package project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TableFeatureEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int featureId;
	@Column
	private String featureName;
	@Column
	private int restaurantInfoId;
	
	public TableFeatureEntity()
	{
		
	}
	public TableFeatureEntity(int featureId, String featureName, int restaurantInfoId) 
	{
		super();
		this.featureId = featureId;
		this.featureName = featureName;
		this.restaurantInfoId = restaurantInfoId;
	}
	public int getFeatureId() 
	{
		return featureId;
	}
	public void setFeatureId(int featureId)
	{
		this.featureId = featureId;
	}
	public String getFeatureName() 
	{
		return featureName;
	}
	public void setFeatureName(String featureName) 
	{
		this.featureName = featureName;
	}
	public int getRestaurantInfoId() 
	{
		return restaurantInfoId;
	}
	public void setRestaurantInfoId(int restaurantInfoId) 
	{
		this.restaurantInfoId = restaurantInfoId;
	}
	@Override
	public String toString()
	{
		return "Table_Feature [featureId=" + featureId + ", featureName=" + featureName + ", restaurantInfoId="
				+ restaurantInfoId + "]";
	}
}
