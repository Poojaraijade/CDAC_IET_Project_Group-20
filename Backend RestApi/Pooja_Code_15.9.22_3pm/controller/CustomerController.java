package project.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.response.credential.*;
import project.entity.CustomerEntity;
import project.repository.CustomerRepository;
import project.service.CustomerService;

@CrossOrigin
@RestController
@RequestMapping(path="/customers")
public class CustomerController {

	@Autowired
	CustomerService custServ;
	
	@Autowired
	CustomerRepository repo;

	@PostMapping("/signUp")
	public Response<CustomerEntity> customerRegistration(@RequestBody CustomerEntity customer)
	{
		customer = repo.save(customer);
		return Response.getSuccessResponse(customer);
	}

	@PostMapping("/login")
	public Response<CustomerEntity> customerRegistration(@RequestBody Credentials credential)
	{
		Optional<CustomerEntity> cust = custServ.signIn(credential);
		if(cust.isPresent())
		{
			return Response.getSuccessResponse(cust.get());
		}
		else
		{
			return Response.getErrorResponse("Invalid Mobile_Number/password");
		}
	}
	
	@GetMapping("/allCustomer")
	public Response<List<CustomerEntity>> getAllCustomers()
	{
		List<CustomerEntity> list = repo.findAll();
		return Response.getSuccessResponse(list);
	}

	@GetMapping("/getCustomer/{Id}")
	public Response<CustomerEntity> getCustomers(@PathVariable int id)
	{
		Optional<CustomerEntity> list = repo.findById(id);
		if(list.isPresent())
		{
			return Response.getSuccessResponse(list.get());
		}
		else
		{
			return Response.getErrorResponse("Customer Not Found");
		}
	}
	
	@DeleteMapping("/removeCustomer/{id}")
	public Response<CustomerEntity> removeCustomer(@PathVariable int id)
	{
		Optional<CustomerEntity> obj = repo.findById(id);
		if(obj.isPresent())
		{
			CustomerEntity user = obj.get();
			repo.delete(user);
			return Response.getSuccessResponse(user);
		}
		else
		return Response.getErrorResponse("Customer Not Deleted");
	}

	@PutMapping("/updateCustomer/{custId}")
	public Response<CustomerEntity> updateCustomer(@PathVariable int custId,@RequestBody CustomerEntity c)
	{
		Optional<CustomerEntity> obj = repo.findById(custId);
		if(obj.isPresent())
		{
			CustomerEntity user = obj.get();
			user.setFirstName(c.getFirstName());
			user.setLastName(c.getLastName());
			user.setMobileNumber(c.getMobileNumber());
			user.setPassword(c.getPassword());
			repo.save(user);
			return Response.getSuccessResponse(user);
		}
		return Response.getErrorResponse("Customer Not Updated");
	}
}