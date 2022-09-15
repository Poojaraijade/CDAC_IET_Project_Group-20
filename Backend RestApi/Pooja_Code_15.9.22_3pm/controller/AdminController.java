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
import project.entity.AdminEntity;
import project.response.credential.*;
import project.repository.AdminRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/admins")
public class AdminController 
{
	@Autowired
	AdminRepository repo;

	@PostMapping("/addAdmin")
	public Response<AdminEntity> adminRegistration(@RequestBody AdminEntity admin)
	{
		admin = repo.save(admin);
		return Response.getSuccessResponse(admin);
	}

	@GetMapping("/allAdmins")
	public Response<List<AdminEntity>> getAllAdmins()
	{
		List<AdminEntity> list = repo.findAll();
		return Response.getSuccessResponse(list);
	}	
	@DeleteMapping("/removeAdmin/{id}")
	public Response<AdminEntity> removeAdmin(@PathVariable int id)
	{
		Optional<AdminEntity> obj = repo.findById(id);
		if(obj.isPresent())
		{
			AdminEntity user = obj.get();
			repo.delete(user);
			return Response.getSuccessResponse(user);
		}
		else
		return Response.getErrorResponse("Admin Not Deleted");
	}

	@PutMapping("/updateAdmin/{adminId}")
	public Response<AdminEntity> updateCustomer(@PathVariable int adminId,@RequestBody AdminEntity a)
	{
		Optional<AdminEntity> obj = repo.findById(adminId);
		if(obj.isPresent())
		{
			AdminEntity user = obj.get();
			user.setFirstName(a.getFirstName());
			user.setLastName(a.getLastName());
			user.setMobileNumber(a.getMobileNumber());
			user.setPassword(a.getPassword());
			repo.save(user);
			return  Response.getSuccessResponse(user);
		}
		return Response.getErrorResponse("Admin Not Updated");
	}
}