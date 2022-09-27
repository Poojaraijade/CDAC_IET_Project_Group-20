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
import project.entity.TableBookingEntity;
import project.repository.TableBookingRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/tBooking")
public class TableBookingController 
{
	@Autowired
	TableBookingRepository repo;
	
	@PostMapping("/addTableBooking")
	public String insertTableBooking(@RequestBody TableBookingEntity t1)
	{
		TableBookingEntity table = new TableBookingEntity(t1.getBookingId(),t1.getBookingDate(),t1.getGuestName(),t1.isTableBookingStatus(),
				                                          t1.getTableBookingAmount(),t1.getRestaurantInfoId(),t1.getCustomerId());
		repo.save(table);
		return "Inserted Table Booking";
	}
	
	@GetMapping("/getAllTableBooking")
	public List<TableBookingEntity> getAllTableBooking()
	{
		List<TableBookingEntity> list = repo.findAll();
		return list;
	}
	
	@DeleteMapping("/getTableBooking/{id}")
	public String deleteTableBooking(@PathVariable int id)
	{
		String str = "";
		Optional<TableBookingEntity> obj = repo.findById(id);
		if(obj.isPresent())
		{
			TableBookingEntity book =obj.get();
			repo.delete(book);
			str = "Deleted Table Booking";
			return str;
		}
		return "Table Booking Not Found";
	}
	
	@PutMapping("/updateTableBooking")
	public String updateTableBooking(@RequestBody TableBookingEntity t1)
	{
		String str = "";
		Optional<TableBookingEntity> obj = repo.findById(t1.getBookingId());
		if(obj.isPresent())
		{
			TableBookingEntity book = obj.get();
			book.setBookingDate(t1.getBookingDate());
			book.setGuestName(t1.getGuestName());
			book.setTableBookingStatus(t1.isTableBookingStatus());
			book.setTableBookingAmount(t1.getTableBookingAmount());
			book.setRestaurantInfoId(t1.getRestaurantInfoId());
			book.setCustomerId(t1.getCustomerId());
			repo.save(book);
			str += "Updated Table Booking";
			return str;
		}
		str += "Failed Update Table Booking";
		return str;
	}
}






























