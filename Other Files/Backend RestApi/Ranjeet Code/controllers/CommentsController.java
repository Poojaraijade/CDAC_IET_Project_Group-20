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

import project.entity.CommentsEntity;
import project.repository.CommentsRepository;

@RestController
@RequestMapping(path="/Comments")
@CrossOrigin
public class CommentsController {
	
	@Autowired
	CommentsRepository repo;
	
	@PostMapping("/addComments")
	public String addComments(@RequestBody CommentsEntity c)
	{
		CommentsEntity comments = new CommentsEntity(c.getCommentId(), c.getComment(), c.getRestaurantInfoId(), c.getCustomerId());
		repo.save(comments);
		return "records inserted";
		
	}
	
	@GetMapping("/getComments")
	public List<CommentsEntity> getComments()
	{
		List<CommentsEntity> list = repo.findAll();
        return list;		
	}
	
	@DeleteMapping("/removeComment/{Id}")
	public String removeComment(@PathVariable int id)
	{
		CommentsEntity comment = repo.findById(id).get();
		repo.delete(comment);
		return "Deleted comment";	
			
	}
	
	@PutMapping("/updateComment/{Comment}/{RestaurantInfoId}/{CustomerId}")
	
	public String updateComment(@PathVariable String Comment,@PathVariable String RestaurantInfoId, @PathVariable String CustomerId )
	{
		
		List<CommentsEntity> list = repo.findAll();
		list.forEach((row)->
		{
			if(row.getComment().equals(Comment))
			{
				
			}
		     }
				
			);
				
			
		
		return "updated comment";
		
	}

	
	

}
