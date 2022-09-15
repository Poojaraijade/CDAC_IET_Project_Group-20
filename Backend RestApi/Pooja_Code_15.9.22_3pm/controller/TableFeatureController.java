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
import project.response.credential.*;
import project.entity.RestaurantInfoEntity;
import project.entity.TableFeatureEntity;
import project.repository.RestaurantInfoRepository;
import project.repository.TableFeatureRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/tFeature")
public class TableFeatureController 
{
	@Autowired
	TableFeatureRepository repo;
	
	@Autowired
	RestaurantInfoRepository repo1;
	
	@PostMapping("/addTableFeature/{restInfoId}")
	public Response<TableFeatureEntity> insertTableFeature(@PathVariable int restInfoId,@RequestBody TableFeatureEntity feature)
	{
		//TableFeatureEntity feature = new TableFeatureEntity(t1.getFeatureId(),t1.getFeatureName());
		
		Optional<RestaurantInfoEntity> r = repo1.findById(restInfoId);
		if(r.isPresent())
		{
			feature.setRestInfo2(r.get());
		}
		repo.save(feature);
		return Response.getSuccessResponse(feature);
	}

	@PutMapping("/updateTableFeature/{featureId}")
	public Response<TableFeatureEntity> updateTableFetaure(@PathVariable int featureId,@RequestBody TableFeatureEntity t1)
	{
		Optional<TableFeatureEntity> obj = repo.findById(featureId);
		if(obj.isPresent())
		{
			TableFeatureEntity feature = obj.get();
			feature.setFeatureName(t1.getFeatureName());
			repo.save(feature);
			return Response.getSuccessResponse(feature);
		}
		else
		return Response.getErrorResponse("Table Feature Not Updated");
	}

	 @GetMapping("/getAllTableFeature")
	public Response<List<TableFeatureEntity>> getAllTableFeature()
	{
		List<TableFeatureEntity> list = repo.findAll();
		return Response.getSuccessResponse(list);
	}

//delete nahi hot	
	 
	@DeleteMapping("/getTableFeature/{id}")
	public Response<TableFeatureEntity> deleteTableFeature(@PathVariable int id)
	{
		Optional<TableFeatureEntity> obj = repo.findById(id);
		if(obj.isPresent())
		{
			TableFeatureEntity feature =obj.get();
			repo.delete(feature);
			return Response.getSuccessResponse(feature);
		}
		else
		return Response.getErrorResponse("Table Feature Not Deleted");
	}
}
