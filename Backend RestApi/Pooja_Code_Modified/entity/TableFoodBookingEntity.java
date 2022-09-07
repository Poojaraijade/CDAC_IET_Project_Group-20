package project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TableFoodBookingEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int foodBookingId;
	@Column
	private int quantity;
	@Column
	private int foodId;
	@Column
	private int tableBookingId;
	@Column
	private float tableFoodBookingAmount;
	@Column
	private boolean foodBookingStatus;
	
	public TableFoodBookingEntity()
	{
		
	}
	public TableFoodBookingEntity(int foodBookingId, int quantity, int foodId, int tableBookingId,
			float tableFoodBookingAmount, boolean foodBookingStatus) 
	{
		super();
		this.foodBookingId = foodBookingId;
		this.quantity = quantity;
		this.foodId = foodId;
		this.tableBookingId = tableBookingId;
		this.tableFoodBookingAmount = tableFoodBookingAmount;
		this.foodBookingStatus = foodBookingStatus;
	}
	public int getFoodBookingId() 
	{
		return foodBookingId;
	}
	public void setFoodBookingId(int foodBookingId) 
	{
		this.foodBookingId = foodBookingId;
	}
	public int getQuantity() 
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public int getFoodId() 
	{
		return foodId;
	}
	public void setFoodId(int foodId) 
	{
		this.foodId = foodId;
	}
	public int getTableBookingId()
	{
		return tableBookingId;
	}
	public void setTableBookingId(int tableBookingId)
	{
		this.tableBookingId = tableBookingId;
	}
	public float getTableFoodBookingAmount() 
	{
		return tableFoodBookingAmount;
	}
	public void setTableFoodBookingAmount(float tableFoodBookingAmount)
	{
		this.tableFoodBookingAmount = tableFoodBookingAmount;
	}
	public boolean isFoodBookingStatus() 
	{
		return foodBookingStatus;
	}
	public void setFoodBookingStatus(boolean foodBookingStatus) 
	{
		this.foodBookingStatus = foodBookingStatus;
	}
	@Override
	public String toString()
	{
		return "Table_Food_Booking [foodBookingId=" + foodBookingId + ", quantity=" + quantity + ", foodId=" + foodId
				+ ", tableBookingId=" + tableBookingId + ", tableFoodBookingAmount=" + tableFoodBookingAmount
				+ ", foodBookingStatus=" + foodBookingStatus + "]";
	}
}

