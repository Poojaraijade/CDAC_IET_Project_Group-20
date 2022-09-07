package project.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class RestaurantEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int restaurantId;
	@Column
	private long mobileNumber;
	@Column
	private String password;
	
	@OneToOne(mappedBy = "rest", cascade = CascadeType.ALL)
	private RestaurantInfoEntity info;
	
	public RestaurantEntity() {}

	public RestaurantEntity(int restaurantId, long mobileNumber, String password) {
		super();
		this.restaurantId = restaurantId;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RestaurantInfoEntity getInfo() {
		return info;
	}

	public void setInfo(RestaurantInfoEntity info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", mobileNumber=" + mobileNumber + ", password=" + password
				+ "]";
	}
	
	
}
