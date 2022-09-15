package project.controller;

import java.io.IOException;
import java.sql.Time;
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
import project.entity.RestaurantInfoEntity;
import project.repository.RestaurantInfoRepository;
import project.repository.RestaurantRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/restaurantInfo")
public class RestaurantInfoController 
{
	@Autowired
	RestaurantRepository repo1;

	@Autowired
	RestaurantInfoRepository repo2;

	@PostMapping("/addRestaurantInfo/{restId}/{openingTime}/{closingTime}")
	public Response<RestaurantInfoEntity> restaurantRegistration(@PathVariable int restId,@PathVariable String openingTime,@PathVariable String closingTime,@RequestBody RestaurantInfoEntity restInfo) throws IOException
	{
		Time t1 = Time.valueOf(openingTime);
		Time t2 = Time.valueOf(closingTime);
		System.out.println(t1+" "+t2);
		RestaurantInfoEntity restInfo1 = new RestaurantInfoEntity(restInfo.getRestaurantInfoId(),restInfo.getRestaurantName(),restInfo.getRestaurantAddress(),restInfo.getCity(),restInfo.getContactPersonName(),
				                              restInfo.getPhoneNumber(),restInfo.getEmailId(),restInfo.getMinBookingAmountPerPerson(),
				                              t1,t2,restInfo.getRestaurantContactNumber(),
				                              restInfo.getNumberOfSeatAvailable());

		Optional<RestaurantEntity> rest = repo1.findById(restId);
		if(rest.isPresent())
		{
			RestaurantEntity r = rest.get();
			RestaurantEntity savedRest = repo1.save(r);
			restInfo1.setRest(savedRest);
			repo2.save(restInfo1);
		}
		return Response.getSuccessResponse(restInfo1);
	}

	@GetMapping("/getAllRestaurantInfo")
	public Response<List<RestaurantInfoEntity>> getAllRestaurants()
	{
		List<RestaurantInfoEntity> list = repo2.findAll();
		return Response.getSuccessResponse(list);
	}
	
	@PutMapping("/updateRestaurantInfo/{openingTime}/{closingTime}/{restInfoId}")
	public Response<Optional<RestaurantInfoEntity>> updateRestaurantInfo(@PathVariable String openingTime,@PathVariable String closingTime,@PathVariable int restInfoId,@RequestBody RestaurantInfoEntity r)
	{
		Time t1 = Time.valueOf(openingTime);
		Time t2 = Time.valueOf(closingTime);
		Optional<RestaurantInfoEntity> obj = repo2.findById(restInfoId);
		if(obj.isPresent())
		{
			RestaurantInfoEntity rst = obj.get();
			rst.setRestaurantName(r.getRestaurantName());
			rst.setRestaurantAddress(r.getRestaurantAddress());
			rst.setCity(r.getCity());
			rst.setContactPersonName(r.getContactPersonName());
			rst.setPhoneNumber(r.getPhoneNumber());
			rst.setEmailId(r.getEmailId());
			rst.setMinBookingAmountPerPerson(r.getMinBookingAmountPerPerson());
			rst.setOpeningTime(t1);
			rst.setClosingTime(t2);
			rst.setRestaurantContactNumber(r.getRestaurantContactNumber());
			rst.setNumberOfSeatAvailable(r.getNumberOfSeatAvailable());
			repo2.save(rst);
			return Response.getSuccessResponse(obj);
		}
		else
		return Response.getErrorResponse("Restaurant Info Not Updated");
	}
	
//delete nahi hot
	
	@DeleteMapping("/removeRestaurant/{id}")
	public Response<RestaurantInfoEntity> removeRestaurant(@PathVariable int id)
	{
		Optional<RestaurantInfoEntity> obj = repo2.findById(id);
		if(obj.isPresent())
		{
			RestaurantInfoEntity rst = obj.get();
			System.out.println(rst);
			repo2.delete(rst);
			return Response.getSuccessResponse(rst);
		}
		else
		return Response.getErrorResponse("Restaurant Info Not Deleted");
	}
}