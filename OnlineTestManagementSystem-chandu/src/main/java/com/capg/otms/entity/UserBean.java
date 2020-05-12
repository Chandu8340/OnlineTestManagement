package com.capg.otms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usertable")
public class UserBean {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private  long userId;
	@NotEmpty(message="firstname is mandatory field,please provide firstname")
	@Size(min=3,message="firstname should contain alteast 3 characters")
	private String firstName;
	@NotEmpty(message="lastname is mandatory field,please provide lastname")
	@Size(min=3,message="lastname should contain alteast 3 characters")
	private String lastName;
	@NotEmpty(message="email is mandatory field,please provide email")
	@Size(min=8,max=30,message="email should contain alteast 8 characters")
	private String email;
	@NotEmpty(message="password is mandatory field,please provide password")
	private String password;
	
	private  long  phonenumber;

	public UserBean() {

	}

	public UserBean(long userId, String firstName, String lastName, String email, String password, long phonenumber) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
		return "UserBean [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", phonenumber=" + phonenumber + "]";
	}

}
