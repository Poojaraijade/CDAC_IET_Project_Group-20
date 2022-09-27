package project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SpecialRequestsEntity {
	
	@Id
	private int specialRequestId;
	@Column
	private String specialRequest;
	@Column
	private int tableBookingId;
	public SpecialRequestsEntity(int specialRequestId, String specialRequest, int tableBookingId) {
		super();
		this.specialRequestId = specialRequestId;
		this.specialRequest = specialRequest;
		this.tableBookingId = tableBookingId;
	}
	public int getSpecialRequestId() {
		return specialRequestId;
	}
	public void setSpecialRequestId(int specialRequestId) {
		this.specialRequestId = specialRequestId;
	}
	public String getSpecialRequest() {
		return specialRequest;
	}
	public void setSpecialRequest(String specialRequest) {
		this.specialRequest = specialRequest;
	}
	public int getTableBookingId() {
		return tableBookingId;
	}
	public void setTableBookingId(int tableBookingId) {
		this.tableBookingId = tableBookingId;
	}
	@Override
	public String toString() {
		return "SpecialRequestsEntity [specialRequestId=" + specialRequestId + ", specialRequest=" + specialRequest
				+ ", tableBookingId=" + tableBookingId + "]";
	}

	
	

}
