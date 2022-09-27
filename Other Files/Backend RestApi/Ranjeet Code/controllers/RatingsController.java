package project.controllers;

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

import project.entity.RatingsEntity;
import project.repository.RatingsRepository;

@RestController
@RequestMapping(path="/Ratings")
@CrossOrigin
public class RatingsController {
	
	
	@Autowired
	RatingsRepository repo;
	
	@PostMapping("/addRatings")
	public String addRatings(@RequestBody RatingsEntity r)
	{
		RatingsEntity rating = new RatingsEntity(r.getRatingId(), r.getRating(), r.getRestaurantInfoId(), r.getCustomerId());
		repo.save(rating);
		return "records inserted";	
		
	}
	
	
	@GetMapping ("/getRating")
	public List<RatingsEntity> getRatings()
	{
		List<RatingsEntity> list = repo.findAll();
		return list;	
	}
	
	@DeleteMapping("/removeRating/{Id}")
	public String removeRating(@PathVariable int id)
	{
		String result = "";
		Optional<RatingsEntity> obj = repo.findById(id);
		if(obj.isPresent())
		{
			RatingsEntity user = obj.get();
			repo.delete(user);
			result = " deletion successful";
			return result;
				
		}
		else
			result = "record not found";
		
		return result; 
		
	}
	

	
	@PutMapping("/updateRating")

	public String updateRating(@RequestBody RatingsEntity r )
	{
		String result = "";
		Optional<RatingsEntity> obj = repo.findById(r.getRatingId());
		if(obj.isPresent())
		{
			RatingsEntity user = obj.get();
			user.setRating(r.getRating());
			user.setRestaurantInfoId(r.getRestaurantInfoId());
			user.setCustomerId(r.getCustomerId());
			repo.save(user);
			result += "record updated";
			return result;	
		}
		
		result += "record update failed";
		return result;	
		
	}
		
		
		
		
		
	}
	
	
	
	
	
	
	


