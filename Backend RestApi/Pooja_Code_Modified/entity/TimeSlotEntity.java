package project.entity;

import java.sql.Date;
import java.sql.Time;

public class TimeSlotEntity {

	private int timeSlotId;
	private Time timeSlot;
	private String meal;
	private String weekday;
	private Date date;
	private int restaurantId;

	public TimeSlotEntity() {}

	public TimeSlotEntity(int timeSlotId, Time timeSlot, String meal, String weekday, Date date, int restaurantId) {
		super();
		this.timeSlotId = timeSlotId;
		this.timeSlot = timeSlot;
		this.meal = meal;
		this.weekday = weekday;
		this.date = date;
		this.restaurantId = restaurantId;
	}

	public int getTimeSlotId() {
		return timeSlotId;
	}

	public void setTimeSlotId(int timeSlotId) {
		this.timeSlotId = timeSlotId;
	}

	public Time getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(Time timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	@Override
	public String toString() {
		return "TimeSlot [timeSlotId=" + timeSlotId + ", timeSlot=" + timeSlot + ", meal=" + meal + ", weekday="
				+ weekday + ", date=" + date + ", restaurantId=" + restaurantId + "]";
	}


}