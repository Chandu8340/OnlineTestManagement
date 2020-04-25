package com.capg.otms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usertable")
public class UserBean {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private  int userId;
	private String userName;
	private  String password;
	private double phonenumber;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(double phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", username=" + userName + ", password=" + password + ", phonenumber="
				+ phonenumber + "]";
	}
	
	
	

}
