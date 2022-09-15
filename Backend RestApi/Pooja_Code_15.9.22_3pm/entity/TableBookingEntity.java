package project.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class TableBookingEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	@Column
	private LocalDateTime bookingDate; 
	@Column
	private String guestName;
	@Column
	private boolean tableBookingStatus;
	@Column
	private float tableBookingAmount;
	
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customerId")
	private CustomerEntity customer;
    
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="restaurantInfoId")
	private RestaurantInfoEntity restInfo1;
    
	@JsonIgnore
	@OneToMany(mappedBy = "tableBook1",cascade = CascadeType.ALL)  
	private List<TableFoodBookingEntity> FoodBook3;
    
	public TableBookingEntity()
	{
		
	}

	public TableBookingEntity(int bookingId, LocalDateTime bookingDate, String guestName, boolean tableBookingStatus,
			float tableBookingAmount, CustomerEntity customer, RestaurantInfoEntity restInfo1) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.guestName = guestName;
		this.tableBookingStatus = tableBookingStatus;
		this.tableBookingAmount = tableBookingAmount;
		this.customer = customer;
		this.restInfo1 = restInfo1;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public LocalDateTime getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public boolean isTableBookingStatus() {
		return tableBookingStatus;
	}

	public void setTableBookingStatus(boolean tableBookingStatus) {
		this.tableBookingStatus = tableBookingStatus;
	}

	public float getTableBookingAmount() {
		return tableBookingAmount;
	}

	public void setTableBookingAmount(float tableBookingAmount) {
		this.tableBookingAmount = tableBookingAmount;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public RestaurantInfoEntity getRestInfo1() {
		return restInfo1;
	}

	public void setRestInfo1(RestaurantInfoEntity restInfo1) {
		this.restInfo1 = restInfo1;
	}

	public List<TableFoodBookingEntity> getFoodBook3() {
		return FoodBook3;
	}

	public void setFoodBook3(List<TableFoodBookingEntity> foodBook3) {
		FoodBook3 = foodBook3;
	}

	@Override
	public String toString() {
		return "TableBookingEntity [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", guestName="
				+ guestName + ", tableBookingStatus=" + tableBookingStatus + ", tableBookingAmount="
				+ tableBookingAmount + ", customer=" + customer + ", restInfo1=" + restInfo1 + ", FoodBook3="
				+ FoodBook3 + "]";
	}

	

}
