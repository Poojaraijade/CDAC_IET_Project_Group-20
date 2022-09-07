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
import project.entity.TableFoodBookingEntity;
import project.repository.TableFoodBookingRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/tFoodBooking")
public class TableFoodBookingController
{
	@Autowired
	TableFoodBookingRepository repo;
	
	@PostMapping("/addTableFoodBooking")
	public String insertTableFoodBooking(@RequestBody TableFoodBookingEntity t1)
	{
		TableFoodBookingEntity table = new TableFoodBookingEntity(t1.getFoodBookingId(),t1.getQuantity(),t1.getFoodId(),
				                       t1.getTableBookingId(),t1.getTableFoodBookingAmount(),
				                       t1.isFoodBookingStatus());
		repo.save(table);
		return "Inserted Table Food Booking";
	}
	
	@GetMapping("/getAllTableFoodBooking")
	public List<TableFoodBookingEntity> getAllTableFoodBooking()
	{
		List<TableFoodBookingEntity> list = repo.findAll();
		return list;
	}
	
	@DeleteMapping("/getTableFoodBooking/{id}")
	public String deleteTableFoodBooking(@PathVariable int id)
	{
		String str = "";
		Optional<TableFoodBookingEntity> obj = repo.findById(id);
		if(obj.isPresent())
		{
			TableFoodBookingEntity book =obj.get();
			repo.delete(book);
			str = "Deleted Table Food Booking";
			return str;
		}
		return "Table Food Booking Not Found";
	}
	
	@PutMapping("/updateTableFoodBooking")
	public String updateTableFoodBooking(@RequestBody TableFoodBookingEntity t1)
	{
		String str = "";
		Optional<TableFoodBookingEntity> obj = repo.findById(t1.getFoodBookingId());
		if(obj.isPresent())
		{
			TableFoodBookingEntity food = obj.get();
			food.setQuantity(t1.getQuantity());
			food.setFoodId(t1.getFoodId());
			food.setTableBookingId(t1.getTableBookingId());
			food.setTableFoodBookingAmount(t1.getTableFoodBookingAmount());
			food.setFoodBookingStatus(t1.isFoodBookingStatus());
			repo.save(food);
			str += "Updated Table Food Booking";
			return str;
		}
		str += "Failed Update Table Food Booking";
		return str;
	}
}
