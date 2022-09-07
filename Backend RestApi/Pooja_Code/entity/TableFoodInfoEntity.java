package project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TableFoodInfoEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int foodId;
	@Column
	private String foodName;
	@Column
	private String category;
	@Column
	private String cusineType;
	@Column
	private float unitPrice;
	@Column
	private int restaurantId;
	
	public TableFoodInfoEntity()
	{
		
	}
	public TableFoodInfoEntity(int foodId, String foodName, String category, String cusineType, float unitPrice,
			int restaurantId)
	{
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.category = category;
		this.cusineType = cusineType;
		this.unitPrice = unitPrice;
		this.restaurantId = restaurantId;
	}
	public int getFoodId()
	{
		return foodId;
	}
	public void setFoodId(int foodId)
	{
		this.foodId = foodId;
	}
	public String getFoodName() 
	{
		return foodName;
	}
	public void setFoodName(String foodName)
	{
		this.foodName = foodName;
	}
	public String getCategory() 
	{
		return category;
	}
	public void setCategory(String category) 
	{
		this.category = category;
	}
	public String getCusineType() 
	{
		return cusineType;
	}
	public void setCusineType(String cusineType)
	{
		this.cusineType = cusineType;
	}
	public float getUnitPrice() 
	{
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice)
	{
		this.unitPrice = unitPrice;
	}
	public int getRestaurantId() 
	{
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) 
	{
		this.restaurantId = restaurantId;
	}
	@Override
	public String toString() 
	{
		return "Table_Food_Info [foodId=" + foodId + ", foodName=" + foodName + ", category=" + category
				+ ", cusineType=" + cusineType + ", unitPrice=" + unitPrice + ", restaurantId=" + restaurantId + "]";
	}
}
