package com.capg.otms.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="test1")
public class TestBean {
	@Id
	@GeneratedValue
    private int testId;
	private String testTitle;
	@DateTimeFormat(pattern="hh:mm:ss")
	private LocalTime testDuration;
	
	@DateTimeFormat(pattern="yyyy/MM/ddThh:mm:ss")
	private LocalDateTime startTime;
	@DateTimeFormat(pattern="yyyy/MM/ddThh:mm:ss")
	private LocalDateTime endTime;
	public TestBean() {
		
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
	public LocalTime getTestDuration() {
		return testDuration;
	}
	public void setTestDuration(LocalTime testDuration) {
		this.testDuration = testDuration;
	}
		public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	public TestBean(int testId, String testTitle, LocalTime testDuration, LocalDateTime startTime, LocalDateTime endTime) {
		super();
		this.testId = testId;
		this.testTitle = testTitle;
		this.testDuration = testDuration;
		
		this.startTime = startTime;
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testTitle=" + testTitle + ", testDuration=" + testDuration
				+ ", startTime=" + startTime + ", endTime="
				+ endTime + "]";
	}
		
}