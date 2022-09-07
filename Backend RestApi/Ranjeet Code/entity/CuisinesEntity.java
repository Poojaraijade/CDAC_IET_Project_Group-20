package project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CuisinesEntity {

	@Id
	private int cuisineId;
	@Column
	private String cuisineName;
	@Column
	private int restaurantInfoId;
	
	public CuisinesEntity() {	}

	public CuisinesEntity(int cuisineId, String cuisineName, int restaurantInfoId) {
		super();
		this.cuisineId = cuisineId;
		this.cuisineName = cuisineName;
		this.restaurantInfoId = restaurantInfoId;
	}

	public int getCuisineId() {
		return cuisineId;
	}

	public void setCuisineId(int cuisineId) {
		this.cuisineId = cuisineId;
	}

	public String getCuisineName() {
		return cuisineName;
	}

	public void setCuisineName(String cuisineName) {
		this.cuisineName = cuisineName;
	}

	public int getRestaurantInfoId() {
		return restaurantInfoId;
	}

	public void setRestaurantInfoId(int restaurantInfoId) {
		this.restaurantInfoId = restaurantInfoId;
	}

	@Override
	public String toString() {
		return "CuisinesEntity [cuisineId=" + cuisineId + ", cuisineName=" + cuisineName + ", restaurantInfoId="
				+ restaurantInfoId + "]";
	}

}
