package com.capg.otms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usertable")
public class UserBean {
	@Id
	private long userId;
	@NotEmpty(message="Name feild is manadatory, please provide name")
	@Size(min=3,message="Name should contain alteast 3 characters")
	private String userName;
	@NotEmpty(message="email feild is manadatory, please provide email")
	private String email;
	@NotEmpty(message="password feild is manadatory, please provide password")
	@Size(min=3,message="password should contain alteast 3 characters")
	private String password;
	@NotNull(message="phonenumber feild is manadatory, please provide phonenumber")
	private long phonenumber;

	public UserBean() {

	}

	public UserBean(long userId, String userName, String email, String password, long phonenumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.phonenumber = phonenumber;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", phonenumber=" + phonenumber + "]";
	}

}
