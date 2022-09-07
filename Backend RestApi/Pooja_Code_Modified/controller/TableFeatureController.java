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
import project.entity.TableFeatureEntity;
import project.repository.TableFeatureRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/tFeature")
public class TableFeatureController 
{
	@Autowired
	TableFeatureRepository repo;
	
	@PostMapping("/addTableFeature")
	public String insertTableFeature(@RequestBody TableFeatureEntity t1)
	{
		TableFeatureEntity feature = new TableFeatureEntity(t1.getFeatureId(),t1.getFeatureName(),t1.getRestaurantInfoId());
		repo.save(feature);
		return "Inserted Table Feature";
	}
	
	@GetMapping("/getAllTableFeature")
	public List<TableFeatureEntity> getAllTableFeature()
	{
		List<TableFeatureEntity> list = repo.findAll();
		return list;
	}
	
	@DeleteMapping("/getTableFeature/{id}")
	public String deleteTableFeature(@PathVariable int id)
	{
		String str = "";
		Optional<TableFeatureEntity> obj = repo.findById(id);
		if(obj.isPresent())
		{
			TableFeatureEntity feature =obj.get();
			repo.delete(feature);
			str = "Deleted Table Feature";
			return str;
		}
		return "Table Feature Not Found";
	}
	
	@PutMapping("/updateTableFeature")
	public String updateTableFetaure(@RequestBody TableFeatureEntity t1)
	{
		String str = "";
		Optional<TableFeatureEntity> obj = repo.findById(t1.getFeatureId());
		if(obj.isPresent())
		{
			TableFeatureEntity feature = obj.get();
			feature.setFeatureId(t1.getFeatureId());
			feature.setFeatureName(t1.getFeatureName());
			feature.setRestaurantInfoId(t1.getRestaurantInfoId());
			repo.save(feature);
			str += "Updated Table Feature";
			return str;
		}
		str += "Failed Update Table Feature";
		return str;
	}
}
