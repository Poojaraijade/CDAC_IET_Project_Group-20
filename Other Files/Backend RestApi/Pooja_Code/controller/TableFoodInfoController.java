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
import project.entity.TableFoodInfoEntity;
import project.repository.TableFoodInfoRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/tFoodInfo")
public class TableFoodInfoController 
{
	@Autowired
	TableFoodInfoRepository repo;
	
	@PostMapping("/addTableFoodInfo")
	public String insertTableBooking(@RequestBody TableFoodInfoEntity t1)
	{
		TableFoodInfoEntity table = new TableFoodInfoEntity(t1.getFoodId(),t1.getFoodName(),t1.getCategory(),
				                    t1.getCusineType(),t1.getUnitPrice(),t1.getRestaurantId());
		repo.save(table);
		return "Inserted Table Food Info";
	}
	
	@GetMapping("/getAllTableFoodInfo")
	public List<TableFoodInfoEntity> getAllTableFoodInfo()
	{
		List<TableFoodInfoEntity> list = repo.findAll();
		return list;
	}
	
	@DeleteMapping("/getTableFoodInfo/{id}")
	public String deleteTableFoodInfo(@PathVariable int id)
	{
		String str = "";
		Optional<TableFoodInfoEntity> obj = repo.findById(id);
		if(obj.isPresent())
		{
			TableFoodInfoEntity info =obj.get();
			repo.delete(info);
			str = "Deleted Table Food Info";
			return str;
		}
		return "Table Food Info Not Found";
	}
	
	@PutMapping("/updateTableFoodInfo")
	public String updateTableFoodInfo(@RequestBody TableFoodInfoEntity t1)
	{
		String str = "";
		Optional<TableFoodInfoEntity> obj = repo.findById(t1.getFoodId());
		if(obj.isPresent())
		{
			TableFoodInfoEntity info = obj.get();
			info.setCategory(t1.getCategory());
			info.setCusineType(t1.getCusineType());
			info.setFoodName(t1.getFoodName());
			info.setUnitPrice(t1.getUnitPrice());
			info.setRestaurantId(t1.getRestaurantId());
			repo.save(info);
			str += "Updated Table Food Info";
			return str;
		}
		str += "Failed Update Table Food Info";
		return str;
	}
}
