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
	private  long userId;
	private String name;
	private  String password;
	private long phonenumber;
	
	public UserBean() {
		
	}

	public UserBean(long userId, String name, String password, long phonenumber) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.phonenumber = phonenumber;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", name=" + name + ", password=" + password + ", phonenumber="
				+ phonenumber + "]";
	}


}
