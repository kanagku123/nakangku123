package com.example.demo1.DTO;

public class userDTO {

	private String userName;
	private String userId;
	private String userPhone;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPhone() {
		return userPhone;
	}
	
	
	
	@Override
	public String toString() {
		return "userDTO [userName=" + userName + ", userId=" + userId + ", userPhone=" + userPhone + "]";
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
	
	
	
	
}
