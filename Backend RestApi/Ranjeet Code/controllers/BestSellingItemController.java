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

import project.entity.BestSellingItemEntity;
import project.repository.BestSellingItemRepository;

@RestController
@RequestMapping(path="/BestSellingItems")
@CrossOrigin 
public class BestSellingItemController {

	@Autowired
	BestSellingItemRepository repo;
	
	@PostMapping("/addBestSellingItem")
	public String addBestSellingItem(@RequestBody BestSellingItemEntity b)
	{
		BestSellingItemEntity item = new BestSellingItemEntity(b.getBestSellingItemId(), b.getBestSellingItemName(), b.getRestaurantInfoId() );
		repo.save(item);
		return "record inserted";	
	}

	@GetMapping ("/getBestSellingItem")
	public List<BestSellingItemEntity> getBestSellingItem()
	{
		List<BestSellingItemEntity> list = repo.findAll();
		return list;
	}
	
	@DeleteMapping("/removeItem/{id}")
	public String removeItem(@PathVariable int id)
	{
		BestSellingItemEntity item = repo.findById(id).get();
		repo.delete(item);
		return "Deleted best item";	
		
	}
	
	@PutMapping("/updateBestSellingItem/{BestSellingItemName}/{RestaurantId}")
	
	public String updateBestSellingItem(@PathVariable String BestSellingItemName, @PathVariable String RestaurantId )
	
	{
		List<BestSellingItemEntity> list = repo.findAll();
		list.forEach((row)->
		{
			if(row.getBestSellingItemName().equals(BestSellingItemName))
			{
				
			}
		     }
				
			);
				
			
		
		return "updated Best Selling Item";
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

