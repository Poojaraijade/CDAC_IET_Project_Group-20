package project.controllers;

import java.util.List;

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

import project.entity.CuisinesEntity;
import project.repository.CuisinesRepository;

@RestController
@RequestMapping(path="/Cuisines")
@CrossOrigin
public class CuisinesController {

	@Autowired
	CuisinesRepository repo;
	
	@PostMapping("/addCuisines")
	public String addCuisines (@RequestBody CuisinesEntity s )
	{
		CuisinesEntity cuisines = new CuisinesEntity(s.getCuisineId(), s.getCuisineName(), s.getRestaurantInfoId());
		repo.save(cuisines);
		return"cuisines inserted";	
		
	}
	
	@GetMapping("/getCuisines")
	public List<CuisinesEntity> getCuisines()
	{
		List<CuisinesEntity> list = repo.findAll();
        return list;		
	}	
	
	@DeleteMapping("/removeCuisine/{Id}")
	public String removeCuisine(@PathVariable int id)
	{
		CuisinesEntity cuisine = repo.findById(id).get();
		repo.delete(cuisine);
		return "Deleted cuisine";	
			
	}
	
@PutMapping("/updateCuisine/{CuisineName}/{RestaurantInfoId}/")
	
	public String updateCuisine(@PathVariable String CuisineName,@PathVariable String RestaurantInfoId )
	{
		
		List<CuisinesEntity> list = repo.findAll();
		list.forEach((row)->
		{
			if(row.getCuisineName().equals(CuisineName))
			{
				
			}
		     }
				
			);
				
			
		
		return "updated cuisine";
		
	}

	
	
	
	
	
	
	
	
}
