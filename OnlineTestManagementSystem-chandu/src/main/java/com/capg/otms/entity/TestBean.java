package com.capg.otms.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;

public class TestBean {
	
	private long testId;
	private String testTitle;
	private LocalTime testDuration;
	private Set<QuestionBean> testQuestions;
	private double testTotalMarks;
	private double testMarksScored;
	private QuestionBean currentQuestions;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	
	
	public long getTestId() {
		return testId;
	}
	public void setTestId(long testId) {
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
	public Set<QuestionBean> getTestQuestions() {
		return testQuestions;
	}
	public void setTestQuestions(Set<QuestionBean> testQuestions) {
		this.testQuestions = testQuestions;
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
	public QuestionBean getCurrentQuestions() {
		return currentQuestions;
	}
	public void setCurrentQuestions(QuestionBean currentQuestions) {
		this.currentQuestions = currentQuestions;
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
	
	
	@Override
	public String toString() {
		return "TestBean [testId=" + testId + ", testTitle=" + testTitle + ", testDuration=" + testDuration
				+ ", testQuestions=" + testQuestions + ", testTotalMarks=" + testTotalMarks + ", testMarksScored="
				+ testMarksScored + ", currentQuestions=" + currentQuestions + ", startTime=" + startTime + ", endTime="
				+ endTime + "]";
	}
	
	
	
	



}
