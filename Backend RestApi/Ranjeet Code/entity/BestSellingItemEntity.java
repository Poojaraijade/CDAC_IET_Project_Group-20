package project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BestSellingItemEntity {
	
	
    @Id         
	private int bestSellingItemId;
    @Column
	private String bestSellingItemName;
    @Column
	private int restaurantInfoId;
	
	
	
    public BestSellingItemEntity() {}



	public BestSellingItemEntity(int bestSellingItemId, String bestSellingItemName, int restaurantInfoId) {
		super();
		this.bestSellingItemId = bestSellingItemId;
		this.bestSellingItemName = bestSellingItemName;
		this.restaurantInfoId = restaurantInfoId;
	}



	public int getBestSellingItemId() {
		return bestSellingItemId;
	}



	public void setBestSellingItemId(int bestSellingItemId) {
		this.bestSellingItemId = bestSellingItemId;
	}



	public String getBestSellingItemName() {
		return bestSellingItemName;
	}



	public void setBestSellingItemName(String bestSellingItemName) {
		this.bestSellingItemName = bestSellingItemName;
	}



	public int getRestaurantInfoId() {
		return restaurantInfoId;
	}



	public void setRestaurantInfoId(int restaurantInfoId) {
		this.restaurantInfoId = restaurantInfoId;
	}



	@Override
	public String toString() {
		return "BestSellingItemEntity [bestSellingItemId=" + bestSellingItemId + ", bestSellingItemName="
				+ bestSellingItemName + ", restaurantInfoId=" + restaurantInfoId + "]";
	}
    
    
        
        




}