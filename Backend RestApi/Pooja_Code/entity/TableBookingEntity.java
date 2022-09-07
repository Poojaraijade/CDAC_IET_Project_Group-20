package project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TableBookingEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	@Column
	private String bookingDate;
	@Column
	private String guestName;
	@Column
	private boolean tableBookingStatus;
	@Column
	private float tableBookingAmount;
	@Column
	private int restaurantInfoId;
    @Column
	private int customerId;
	
	public TableBookingEntity()
	{
		
	}
	public TableBookingEntity(String bookingDate, String guestName, boolean tableBookingStatus,
			float tableBookingAmount, int restaurantInfoId, int customerId)
	{
		super();
		this.bookingDate = bookingDate;
		this.guestName = guestName;
		this.tableBookingStatus = tableBookingStatus;
		this.tableBookingAmount = tableBookingAmount;
		this.restaurantInfoId = restaurantInfoId;
		this.customerId = customerId;
	}
	public TableBookingEntity(int bookingId, String bookingDate, String guestName, boolean tableBookingStatus,
			float tableBookingAmount, int restaurantInfoId, int customerId)
	{
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.guestName = guestName;
		this.tableBookingStatus = tableBookingStatus;
		this.tableBookingAmount = tableBookingAmount;
		this.restaurantInfoId = restaurantInfoId;
		this.customerId = customerId;
	}
	public TableBookingEntity(int bookingId2, String bookingDate2, String guestName2, boolean tableBookingStatus2,
			float tableBookingAmount2) 
	{
		super();
		this.bookingId = bookingId2;
		this.bookingDate = bookingDate2;
		this.guestName = guestName2;
		this.tableBookingStatus = tableBookingStatus2;
		this.tableBookingAmount = tableBookingAmount2;
	}
	public int getBookingId()
	{
		return bookingId;
	}
	public void setBookingId(int bookingId) 
	{
		this.bookingId = bookingId;
	}
	public String getBookingDate() 
	{
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) 
	{
		this.bookingDate = bookingDate;
	}
	public String getGuestName()
	{
		return guestName;
	}
	public void setGuestName(String guestName)
	{
		this.guestName = guestName;
	}
	public boolean isTableBookingStatus() 
	{
		return tableBookingStatus;
	}
	public void setTableBookingStatus(boolean tableBookingStatus)
	{
		this.tableBookingStatus = tableBookingStatus;
	}
	public float getTableBookingAmount() 
	{
		return tableBookingAmount;
	}
	public void setTableBookingAmount(float tableBookingAmount) 
	{
		this.tableBookingAmount = tableBookingAmount;
	}
	public int getRestaurantInfoId() 
	{
		return restaurantInfoId;
	}
	public void setRestaurantInfoId(int restaurantInfoId) 
	{
		this.restaurantInfoId = restaurantInfoId;
	}
	public int getCustomerId()
	{
		return customerId;
	}
	public void setCustomerId(int customerId) 
	{
		this.customerId = customerId;
	}
	@Override
	public String toString()
	{
		return "Table_Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", guestName=" + guestName
				+ ", tableBookingStatus=" + tableBookingStatus + ", tableBookingAmount=" + tableBookingAmount
				+ ", restaurantInfoId=" + restaurantInfoId + ", customerId=" + customerId + "]";
	}
}
