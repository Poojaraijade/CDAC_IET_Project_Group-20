package project.controllers;

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

import project.entity.RestaurantEntity;
import project.entity.RestaurantInfoEntity;
import project.repository.RestaurantInfoRepository;
import project.repository.RestaurantRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/restaurantInfo")
public class RestaurantInfoController {

	@Autowired
	RestaurantRepository repo1;
	
	@Autowired
	RestaurantInfoRepository repo2;
	
	@PostMapping("/addRestaurantInfo/{mobileNo}/{pwd}/{name}/{address}/{city}/{contactPersonName}/{phoneNo}/{emailId}/{minBookingAmountPerPerson}/{openingTime}/{closingTime}/{restaurantContactNumber}/{numberOfSeatAvailable}")
	public String restaurantRegistration(@PathVariable long mobileNo, @PathVariable String pwd, @PathVariable String name, @PathVariable String address, @PathVariable String city, @PathVariable String contactPersonName, @PathVariable long phoneNo, @PathVariable String emailId, @PathVariable double minBookingAmountPerPerson, @PathVariable String openingTime, @PathVariable String closingTime, @PathVariable long restaurantContactNumber, @PathVariable int numberOfSeatAvailable)
	{
		RestaurantInfoEntity restInfo = new RestaurantInfoEntity();
		restInfo.setRestaurantName(name);
		restInfo.setCity(city);
		restInfo.setRestaurantAddress(address);
		restInfo.setContactPersonName(contactPersonName);
		restInfo.setEmailId(emailId);
		restInfo.setMinBookingAmountPerPerson(minBookingAmountPerPerson);
		restInfo.setNumberOfSeatAvailable(numberOfSeatAvailable);
		restInfo.setPhoneNumber(phoneNo);
		restInfo.setRestaurantContactNumber(restaurantContactNumber);
		Time t1 = Time.valueOf(openingTime);
		Time t2 = Time.valueOf(closingTime);
		restInfo.setOpeningTime(t1);
		restInfo.setClosingTime(t2);
		
		RestaurantEntity rest = new RestaurantEntity();
		rest.setMobileNumber(mobileNo);
		rest.setPassword(pwd);
		
		RestaurantEntity savedRest = repo1.save(rest);
		
		restInfo.setRest(savedRest);
		repo2.save(restInfo);
		return "Record inserted..";
	}
	
	/*
	@GetMapping("/getAllRestaurantInfo")
	public List<RestaurantInfoEntity> getAllRestaurants()
	{
		List<RestaurantInfoEntity> list = repo.findAll();
		return list;
	}
	
	@PutMapping("/updateRestaurantInfo")
	public String updateRestaurantInfo(@RequestBody RestaurantInfoEntity r)
	{
		String result = "";
		Optional<RestaurantInfoEntity> obj = repo.findById(r.getRestaurantInfoId());
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
			rst.setOpeningTime(r.getOpeningTime());
			rst.setClosingTime(r.getClosingTime());
			rst.setRestaurantContactNumber(r.getRestaurantContactNumber());
			rst.setNumberOfSeatAvailable(r.getNumberOfSeatAvailable());
			rst.setRestaurantId(r.getRestaurantId());
			repo.save(rst);
			result += "record updated";
			return result;
		}
		result += "record update failed";
		return result;
	}
	
	@DeleteMapping("/removeRestaurant/{id}")
	public String removeRestaurant(@PathVariable int id)
	{
		String result = "";
		Optional<RestaurantInfoEntity> obj = repo.findById(id);
		if(obj.isPresent())
		{
			RestaurantInfoEntity rst = obj.get();
			repo.delete(rst);
			result = "rst deleted successful..";
			return result;
		}
		else
			result = "Record not found !..";
		
		return result;
	}
	
	*/
	
}
