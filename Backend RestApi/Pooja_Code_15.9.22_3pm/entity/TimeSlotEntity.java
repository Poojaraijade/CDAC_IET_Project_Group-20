package project.entity;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TimeSlotEntity 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int timeSlotId;
    @Column
	private Time timeSlot;
    @Column
	private String meal;
    @Column
	private String weekday;
    @Column
	private LocalDateTime date;
    @Column
	private int restaurantId;

	public TimeSlotEntity() {}

	public TimeSlotEntity(int timeSlotId, Time timeSlot, String meal, String weekday, LocalDateTime date,
			int restaurantId) {
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

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
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
		return "TimeSlotEntity [timeSlotId=" + timeSlotId + ", timeSlot=" + timeSlot + ", meal=" + meal + ", weekday="
				+ weekday + ", date=" + date + ", restaurantId=" + restaurantId + "]";
	}
}