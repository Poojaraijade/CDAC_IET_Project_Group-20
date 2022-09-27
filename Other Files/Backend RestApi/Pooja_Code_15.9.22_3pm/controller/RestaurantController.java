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
import project.entity.RestaurantEntity;
import project.repository.RestaurantRepository;
import project.service.RestaurantService;

@CrossOrigin
@RestController
@RequestMapping(path="/restaurants")
public class RestaurantController 
{
	@Autowired
	RestaurantService restServ;
	
	@Autowired
	RestaurantRepository repo;
	
	@PostMapping("/signUp")
	public Response<RestaurantEntity> restaurantRegistration(@RequestBody RestaurantEntity restaurant)
	{
		restaurant = repo.save(restaurant);
		return Response.getSuccessResponse(restaurant);
	}
	
	@PostMapping("/login")
	public Response<RestaurantEntity> restaurantRegistration(@RequestBody Credentials credential)
	{
		Optional<RestaurantEntity> rest = restServ.signIn(credential);
		if(rest.isPresent())
		{
			return Response.getSuccessResponse(rest.get());
		}
		else
		{
			return Response.getErrorResponse("Invalid Mobile_Number/password");
		}
	}
	
	@GetMapping("/getAllRestaurants")
	public Response<List<RestaurantEntity>> getAllRestaurants()
	{
		List<RestaurantEntity> list = repo.findAll();
		return Response.getSuccessResponse(list);
	}
	
	@GetMapping("/getRestaurant/{Id}")
	public Response<RestaurantEntity> getRestaurants(@PathVariable int id)
	{
		Optional<RestaurantEntity> list = repo.findById(id);
		if(list.isPresent())
		{
			return Response.getSuccessResponse(list.get());
		}
		else
		{
			return Response.getErrorResponse("Restaurant Not Found");
		}
	}
	
	@DeleteMapping("/removeRestaurant/{id}")
	public Response<RestaurantEntity> removeRestaurant(@PathVariable int id)
	{
		Optional<RestaurantEntity> obj = repo.findById(id);
		if(obj.isPresent())
		{
			RestaurantEntity rst = obj.get();
			repo.delete(rst);
			return Response.getSuccessResponse(rst);
		}
		else
		return Response.getErrorResponse("Restaurant Not Deleted");
	}

	@PutMapping("/updateRestaurant/{restoId}")
	public Response<RestaurantEntity> updateRestaurant(@PathVariable int restoId,@RequestBody RestaurantEntity r)
	{
		Optional<RestaurantEntity> obj = repo.findById(restoId);
		if(obj.isPresent())
		{
			RestaurantEntity user = obj.get();
			user.setMobileNumber(r.getMobileNumber());
			user.setPassword(r.getPassword());
			repo.save(user);
			return Response.getSuccessResponse(user);
		}
		else 
		return Response.getErrorResponse("Restaurant Not Updated");
	}
}