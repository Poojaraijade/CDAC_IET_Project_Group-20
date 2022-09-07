package project.controller;
/*
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
import project.entity.TableRestaurantImageEntity;
import project.repository.TableRestaurantImageRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/tRestoImage")
public class TableRestaurantImageController 
{
	@Autowired
	TableRestaurantImageRepository repo;
	
	@PostMapping("/addTableRestoImage")
	public String insertTableRestoImage(@RequestBody TableRestaurantImageEntity t1)
	{
		TableRestaurantImageEntity table = new TableRestaurantImageEntity(t1.getRestaurantImageId(),t1.getRestaurantImage(),
				                           t1.getRestaurantInfoId());
		repo.save(table);
		return "Inserted Table Resto Image";
	}
	
	@GetMapping("/getTableRestoImage")
	public List<TableRestaurantImageEntity> getAllTableRestoImage()
	{
		List<TableRestaurantImageEntity> list = repo.findAll();
		return list;
	}
	
	@DeleteMapping("/getTableRestoImage/{id}")
	public String deleteTableRestoImage(@PathVariable int id)
	{
		String str = "";
		Optional<TableRestaurantImageEntity> obj = repo.findById(id);
		if(obj.isPresent())
		{
			TableRestaurantImageEntity image =obj.get();
			repo.delete(image);
			str = "Deleted Table Resto Image";
			return str;
		}
		return "Table Resto Image Not Found";
	}
	
	@PutMapping("/updateTableRestoImage")
	public String updateTableRestoImage(@RequestBody TableRestaurantImageEntity t1)
	{
		String str = "";
		Optional<TableRestaurantImageEntity> obj = repo.findById(t1.getRestaurantImageId());
		if(obj.isPresent())
		{
			TableRestaurantImageEntity image = obj.get();
            image.setRestaurantImage(t1.getRestaurantImage());
            image.setRestaurantInfoId(t1.getRestaurantInfoId());
			repo.save(image);
			str += "Updated Table Resto Image";
			return str;
		}
		str += "Failed Update Table Resto Image";
		return str;
	}
}
*/