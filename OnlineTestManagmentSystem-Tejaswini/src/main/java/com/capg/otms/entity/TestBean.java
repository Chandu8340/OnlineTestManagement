package com.capg.otms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TestBean {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int testId;
	private String testTitle;
	private int userId;
	
		
	public TestBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TestBean(int testId, String testTitle,int userId) {
		super();
		this.testId = testId;
		this.testTitle = testTitle;
		this.userId = userId;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public String getTestTitle() {
		return testTitle;
	}
	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;}
	@Override
	public String toString() {
		return "TestBean [testId=" + testId + ", testTitle=" + testTitle + ", userId=" + userId + "]";
	}

	
    
}
