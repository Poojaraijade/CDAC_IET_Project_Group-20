package project.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
import project.entity.CustomerEntity;
import project.response.credential.*;
import project.entity.RestaurantInfoEntity;
import project.entity.TableBookingEntity;
import project.repository.CustomerRepository;
import project.repository.RestaurantInfoRepository;
import project.repository.TableBookingRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/tBooking")
public class TableBookingController 
{
	@Autowired
	TableBookingRepository repo;
	
	@Autowired
	CustomerRepository repo1;
	
	@Autowired
	RestaurantInfoRepository repo2;
	
	@PostMapping("/addTableBooking/{date}/{custId}/{restInfoId}")
	public Response<TableBookingEntity> insertTableBooking(@RequestBody TableBookingEntity t1 ,@PathVariable String date,@PathVariable int custId,@PathVariable int restInfoId ) 
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime dateTime = LocalDateTime.parse(date, formatter);

		TableBookingEntity table = new TableBookingEntity(t1.getBookingId(),dateTime,t1.getGuestName(),t1.isTableBookingStatus(),
				                                          t1.getTableBookingAmount(),t1.getCustomer(),t1.getRestInfo1());
	
		Optional<CustomerEntity> c = repo1.findById(custId);
		if(c.isPresent())
		{
			table.setCustomer(c.get());
		}
		Optional<RestaurantInfoEntity> r = repo2.findById(restInfoId);
		if(r.isPresent())
		{
			table.setRestInfo1(r.get());
		}
		repo.save(table);
		return Response.getSuccessResponse(table);
	}

	@PutMapping("/updateTableBooking/{date}/{tbookingId}")
	public Response<Optional<TableBookingEntity>> updateTableBooking(@PathVariable String date,@PathVariable int tbookingId,@RequestBody TableBookingEntity t1)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
		Optional<TableBookingEntity> obj = repo.findById(tbookingId);
		if(obj.isPresent())
		{
			TableBookingEntity book = obj.get();
			book.setBookingDate(dateTime);
			book.setGuestName(t1.getGuestName());
			book.setTableBookingStatus(t1.isTableBookingStatus());
			book.setTableBookingAmount(t1.getTableBookingAmount());
			repo.save(book);
			return Response.getSuccessResponse(obj);
		}
		else
		return Response.getErrorResponse("Table Booking Not Updated");
	}

	@GetMapping("/getAllTableBooking")
	public Response<List<TableBookingEntity>> getAllTableBooking()
	{
		List<TableBookingEntity> list = repo.findAll();
		return Response.getSuccessResponse(list);
	}
	
//delete nahi hot
	
	@DeleteMapping("/getTableBooking/{id}")
	public Response<TableBookingEntity> deleteTableBooking(@PathVariable int id)
	{
		Optional<TableBookingEntity> obj = repo.findById(id);
		if(obj.isPresent())
		{
			TableBookingEntity book =obj.get();
			repo.delete(book);
			return Response.getSuccessResponse(book);
		}
		else
		return Response.getErrorResponse("Table Booking Not Deleted");
	}
}