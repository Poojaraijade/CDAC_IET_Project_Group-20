package project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RatingsEntity {
	
	@Id
	private int ratingId;
	@Column
	private int rating;
	@Column
	private int restaurantInfoId;
	@Column
	private int customerId;
	
	
	
	public RatingsEntity() {}



	public RatingsEntity(int ratingId, int rating, int restaurantInfoId, int customerId) {
		super();
		this.ratingId = ratingId;
		this.rating = rating;
		this.restaurantInfoId = restaurantInfoId;
		this.customerId = customerId;
	}



	public int getRatingId() {
		return ratingId;
	}



	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}



	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	public int getRestaurantInfoId() {
		return restaurantInfoId;
	}



	public void setRestaurantInfoId(int restaurantInfoId) {
		this.restaurantInfoId = restaurantInfoId;
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	@Override
	public String toString() {
		return "RatingsEntity [ratingId=" + ratingId + ", rating=" + rating + ", restaurantInfoId=" + restaurantInfoId
				+ ", customerId=" + customerId + "]";
	}



	
}

