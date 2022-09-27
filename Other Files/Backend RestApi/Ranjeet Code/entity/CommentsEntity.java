package project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CommentsEntity {
	
	@Id
	private int commentId;
	@Column
	private String comment;
	@Column
	private int restaurantInfoId;
	@Column
	private int customerId;
	
	public CommentsEntity() {}

	public CommentsEntity(int commentId, String comment, int restaurantInfoId, int customerId) {
		super();
		this.commentId = commentId;
		this.comment = comment;
		this.restaurantInfoId = restaurantInfoId;
		this.customerId = customerId;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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
		return "CommentsEntity [commentId=" + commentId + ", comment=" + comment + ", restaurantInfoId="
				+ restaurantInfoId + ", customerId=" + customerId + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}

