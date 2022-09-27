package project.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class RestaurantInfoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int restaurantInfoId;
	@Column
	private String restaurantName;
	@Column
	private String restaurantAddress;
	@Column
	private String city;
	@Column
	private String contactPersonName;
	@Column
	private long phoneNumber;
	@Column
	private String emailId;
	@Column
	private double minBookingAmountPerPerson;
	@Column
	private Time openingTime;
	@Column
	private Time closingTime;
	@Column
	private long restaurantContactNumber;
	@Column
	private int numberOfSeatAvailable;
	
	@OneToOne
	private RestaurantEntity rest;
	
	public RestaurantInfoEntity() {}

	public RestaurantInfoEntity(int restaurantInfoId, String restaurantName, String restaurantAddress, String city,
			String contactPersonName, long phoneNumber, String emailId, double minBookingAmountPerPerson,
			Time openingTime, Time closingTime, long restaurantContactNumber, int numberOfSeatAvailable,
			RestaurantEntity rest) {
		super();
		this.restaurantInfoId = restaurantInfoId;
		this.restaurantName = restaurantName;
		this.restaurantAddress = restaurantAddress;
		this.city = city;
		this.contactPersonName = contactPersonName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.minBookingAmountPerPerson = minBookingAmountPerPerson;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.restaurantContactNumber = restaurantContactNumber;
		this.numberOfSeatAvailable = numberOfSeatAvailable;
		this.rest = rest;
	}

	public int getRestaurantInfoId() {
		return restaurantInfoId;
	}

	public void setRestaurantInfoId(int restaurantInfoId) {
		this.restaurantInfoId = restaurantInfoId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantAddress() {
		return restaurantAddress;
	}

	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactPersonName() {
		return contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getMinBookingAmountPerPerson() {
		return minBookingAmountPerPerson;
	}

	public void setMinBookingAmountPerPerson(double minBookingAmountPerPerson) {
		this.minBookingAmountPerPerson = minBookingAmountPerPerson;
	}

	public Time getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(Time openingTime) {
		this.openingTime = openingTime;
	}

	public Time getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(Time closingTime) {
		this.closingTime = closingTime;
	}

	public long getRestaurantContactNumber() {
		return restaurantContactNumber;
	}

	public void setRestaurantContactNumber(long restaurantContactNumber) {
		this.restaurantContactNumber = restaurantContactNumber;
	}

	public int getNumberOfSeatAvailable() {
		return numberOfSeatAvailable;
	}

	public void setNumberOfSeatAvailable(int numberOfSeatAvailable) {
		this.numberOfSeatAvailable = numberOfSeatAvailable;
	}

	public RestaurantEntity getRest() {
		return rest;
	}

	public void setRest(RestaurantEntity rest) {
		this.rest = rest;
	}

	@Override
	public String toString() {
		return "RestaurantInfoEntity [restaurantInfoId=" + restaurantInfoId + ", restaurantName=" + restaurantName
				+ ", restaurantAddress=" + restaurantAddress + ", city=" + city + ", contactPersonName="
				+ contactPersonName + ", phoneNumber=" + phoneNumber + ", emailId=" + emailId
				+ ", minBookingAmountPerPerson=" + minBookingAmountPerPerson + ", openingTime=" + openingTime
				+ ", closingTime=" + closingTime + ", restaurantContactNumber=" + restaurantContactNumber
				+ ", numberOfSeatAvailable=" + numberOfSeatAvailable + ", rest=" + rest + "]";
	}

	

	

	
	
	
}
