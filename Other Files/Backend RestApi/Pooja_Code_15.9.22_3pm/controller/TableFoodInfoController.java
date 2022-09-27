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
import project.entity.TableFoodInfoEntity;
import project.repository.RestaurantInfoRepository;
import project.repository.TableFoodBookingRepository;
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
	
	@Autowired
	TableFoodBookingRepository repo2;
	
	@PostMapping("/addTableFoodInfo/{id}")
	public Response<List<TableFoodInfoEntity>> insertTableBooking(@PathVariable int id,@RequestBody List<TableFoodInfoEntity> t1)
	{
		    Optional<RestaurantInfoEntity> obj = repo1.findById(id);
			RestaurantInfoEntity restInfo = obj.get();
			t1.forEach((e)->{
				e.setRestaurantInfo(restInfo);
			});
			restInfo.setFoodInfoList(t1);
			
			repo1.save(restInfo);
			return Response.getSuccessResponse(t1);
	}
	
	@GetMapping("/getAllTableFoodInfo")
	public Response<List<TableFoodInfoEntity>> getAllTableFoodInfo()
	{
		List<TableFoodInfoEntity> list = repo.findAll();
		return Response.getSuccessResponse(list);
	}

	@PutMapping("/updateTableFoodInfo/{foodInfoId}")
	public Response<TableFoodInfoEntity> updateTableFoodInfo(@PathVariable int foodInfoId,@RequestBody TableFoodInfoEntity t1)
	{
		Optional<TableFoodInfoEntity> obj = repo.findById(foodInfoId);
		if(obj.isPresent())
		{
			TableFoodInfoEntity info = obj.get();
			info.setCategory(t1.getCategory());
			info.setCusineType(t1.getCusineType());
			info.setFoodName(t1.getFoodName());
			info.setUnitPrice(t1.getUnitPrice());
			repo.save(info);
			return Response.getSuccessResponse(info);
		}
		else
		return Response.getErrorResponse("Table Food Info Not Updated");
	}
	
	//delete nahi hot
	
		@DeleteMapping("/getTableFoodInfo/{id}")
		public Response<Optional<TableFoodInfoEntity>> deleteTableFoodInfo(@PathVariable int id)
		{
			String str = "";
			Optional<TableFoodInfoEntity> obj = repo.findById(id);
			if(obj.isPresent())
			{
				TableFoodInfoEntity info =obj.get();
				repo.delete(info);
				str = "Deleted Table Food Info";
				return Response.getSuccessResponse(obj);
			}
			return Response.getErrorResponse("Table Food Info Not Deleted");
		}
}
