package com.capg.otms.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
@Entity 
@Table(name="Test_Spring")
public class TestBean {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	@NotNull(message="Give the existed Id")
	private int testId;
	
	@NotEmpty(message="Title should not be null and It accepts String")
	@Pattern (regexp=  "[a-z A-Z]*$" )
    private String testTitle;
	@NotEmpty(message="Test Duration should not be null and It accepts String")
	@Pattern(regexp="([01]?[0-9]|2[0-3]):[0-5][0-9]")
    private String testDuration;
	@NotEmpty(message="Test Question1 should not be null and It accepts String")
	private String testQuestion1;
	@NotEmpty(message="Test Question2 should not be null and It accepts String")
    private String testQuestion2;
	@NotEmpty(message="Test Question3 should not be null and It accepts String")
    private String testQuestion3;
    private double testTotalMarks ;
	private double testMarksScored ;
	@NotEmpty(message="Start Time should not be null and It accepts String")
	@Pattern(regexp="([01]?[0-9]|2[0-3]):[0-5][0-9]")
	private String startTime ;
	@NotEmpty(message="End time should not be null and It accepts String")
	@Pattern(regexp="([01]?[0-9]|2[0-3]):[0-5][0-9]")
    private String endTime ;
	
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
	public String getTestDuration() {
		return testDuration;
	}
	public void setTestDuration(String testDuration) {
		this.testDuration = testDuration;
	}
	public String getTestQuestion1() {
		return testQuestion1;
	}
	public void setTestQuestion1(String testQuestion1) {
		this.testQuestion1 = testQuestion1;
	}
	public String getTestQuestion2() {
		return testQuestion2;
	}
	public void setTestQuestion2(String testQuestion2) {
		this.testQuestion2 = testQuestion2;
	}
	public String getTestQuestion3() {
		return testQuestion3;
	}
	public void setTestQuestion3(String testQuestion3) {
		this.testQuestion3 = testQuestion3;
	}
	
	public double getTestTotalMarks() {
		return testTotalMarks;
	}
	public void setTestTotalMarks(double testTotalMarks) {
		this.testTotalMarks = testTotalMarks;
	}
	public double getTestMarksScored() {
		return testMarksScored;
	}
	public void setTestMarksScored(double testMarksScored) {
		this.testMarksScored = testMarksScored;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "TestBean [testId=" + testId + ", testTitle=" + testTitle + ", testDuration=" + testDuration
				+ ", testQuestion1=" + testQuestion1 + ", testQuestion2=" + testQuestion2 + ", testQuestion3="
				+ testQuestion3 + ",  testTotalMarks=" + testTotalMarks
				+ ", testMarksScored=" + testMarksScored + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}

}
	