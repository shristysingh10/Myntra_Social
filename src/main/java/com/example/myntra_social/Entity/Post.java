package com.example.myntra_social.Entity;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="Post")

public class Post {
	@Id
	@GeneratedValue
	private int Id;
	private String postId;
	private String userId;
	private String userName;
	private String postPath;

	private int likeCount;
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(int id, String postId, String userId, String postPath,  int likeCount) {
		super();
		Id = id;
		this.postId = postId;
		this.userId = userId;
		this.postPath = postPath;
//		this.timeStamp = timeStamp;
		this.likeCount = likeCount;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPostPath() {
		return postPath;
	}
	public void setPostPath(String postPath) {
		this.postPath = postPath;
	}


	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	
	
	

}
