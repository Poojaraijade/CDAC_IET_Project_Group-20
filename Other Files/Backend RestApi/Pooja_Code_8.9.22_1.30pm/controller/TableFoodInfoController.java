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
import project.entity.RestaurantInfoEntity;
import project.entity.TableFoodInfoEntity;
import project.repository.RestaurantInfoRepository;
import project.repository.TableFoodInfoRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/tFoodInfo")
public class TableFoodInfoController 
{
	@Autowired
	TableFoodInfoRepository repo;
	
	@Autowired
	RestaurantInfoRepository repo1;
	
	@PostMapping("/addTableFoodInfo/{id}")
	public String insertTableBooking(@PathVariable int id,@RequestBody List<TableFoodInfoEntity> t1)
	{
		    Optional<RestaurantInfoEntity> obj = repo1.findById(id);
			RestaurantInfoEntity restInfo = obj.get();
			t1.forEach((e)->{
				e.setRestaurantInfo(restInfo);
			});
			restInfo.setFoodInfoList(t1);
			repo1.save(restInfo);
			return "Record Inserted";
	}
	
	/*
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
			info.setRestaurantInfo(t1.getRestaurantInfo());
			repo.save(info);
			str += "Updated Table Food Info";
			return str;
		}
		str += "Failed Update Table Food Info";
		return str;
	}
	*/
}
