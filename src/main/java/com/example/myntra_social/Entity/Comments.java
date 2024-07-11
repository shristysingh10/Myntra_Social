package com.example.myntra_social.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="Comments")
public class Comments {
     @Id
     @GeneratedValue
     private int id;
     private String commentId;
     private String uderId;
     private String postId;
     private String comment;
     private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comments(int id, String commentId, String uderId, String postId, String comment) {
		super();
		this.id = id;
		this.commentId = commentId;
		this.uderId = uderId;
		this.postId = postId;
		this.comment = comment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCommentId() {
		return commentId;
	}
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	public String getUderId() {
		return uderId;
	}
	public void setUderId(String uderId) {
		this.uderId = uderId;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
     
     
}