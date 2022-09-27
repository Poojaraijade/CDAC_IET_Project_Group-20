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
import project.entity.RestaurantEntity;
import project.repository.RestaurantRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/restaurant")
public class RestaurantController {

	@Autowired
	RestaurantRepository repo;

	@PostMapping("/addRestaurant")
	public String restaurantRegistration(@RequestBody RestaurantEntity r)
	{
		RestaurantEntity rs = new RestaurantEntity(r.getRestaurantId(),r.getMobileNumber(),r.getPassword());
		repo.save(rs);
		return "Record inserted..";
	}

	@GetMapping("/getAllRestaurants")
	public List<RestaurantEntity> getAllRestaurants()
	{
		List<RestaurantEntity> list = repo.findAll();
		return list;
	}

	@PutMapping("/updateRestaurant")
	public String updateRestaurant(@RequestBody RestaurantEntity r)
	{
		String result = "";
		Optional<RestaurantEntity> obj = repo.findById(r.getRestaurantId());
		if(obj.isPresent())
		{
			RestaurantEntity user = obj.get();
			user.setMobileNumber(r.getMobileNumber());
			user.setPassword(r.getPassword());
			repo.save(user);
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
		Optional<RestaurantEntity> obj = repo.findById(id);
		if(obj.isPresent())
		{
			RestaurantEntity rst = obj.get();
			repo.delete(rst);
			result = "rst deleted successful..";
			return result;
		}
		else
			result = "Record not found !..";

		return result;
	}

}