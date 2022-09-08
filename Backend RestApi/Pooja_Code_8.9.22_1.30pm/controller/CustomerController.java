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
import project.entity.CustomerEntity;
import project.repository.CustomerRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/customers")
public class CustomerController {

	@Autowired
	CustomerRepository repo;

	@PostMapping("/addCustomer")
	public String customerRegistration(@RequestBody CustomerEntity c)
	{
		CustomerEntity customer = new CustomerEntity(c.getCustomerId(),c.getFirstName(),c.getLastName(),c.getMobileNumber(),c.getPassword());
		repo.save(customer);
		return "Record inserted..";
	}

	@GetMapping("/allCustomer")
	public List<CustomerEntity> getAllCustomers()
	{
		List<CustomerEntity> list = repo.findAll();
		return list;
	}

	@PutMapping("/updateCustomer")
	public String updateCustomer(@RequestBody CustomerEntity c)
	{
		String result = "";
		Optional<CustomerEntity> obj = repo.findById(c.getCustomerId());
		if(obj.isPresent())
		{
			CustomerEntity user = obj.get();
			user.setFirstName(c.getFirstName());
			user.setLastName(c.getLastName());
			user.setMobileNumber(c.getMobileNumber());
			user.setPassword(c.getPassword());
			repo.save(user);
			result += "record updated";
			return result;
		}
		result += "record update failed";
		return result;
	}

	@DeleteMapping("/removeCustomer/{id}")
	public String removeCustomer(@PathVariable int id)
	{
		String result = "";
		Optional<CustomerEntity> obj = repo.findById(id);
		if(obj.isPresent())
		{
			CustomerEntity user = obj.get();
			repo.delete(user);
			result = "User deleted successful..";
			return result;
		}
		else
			result = "Record not found !..";

		return result;
	}


}