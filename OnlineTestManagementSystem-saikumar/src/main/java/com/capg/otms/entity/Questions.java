package com.capg.otms.entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="All_Questions")
public class Questions {
	@Id
	private int questionId;
	
	private String questionTitle;
	private String[] questionOption;
	private int questionAnswer;
	private int questionMarks;
	private int chosenAnswer;
	private int marksScored;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public String[] getQuestionOption() {
		return questionOption;
	}
	public void setQuestionOption(String[] questionOption) {
		this.questionOption = questionOption;
	}
	public int getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(int questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	public int getQuestionMarks() {
		return questionMarks;
	}
	public void setQuestionMarks(int questionMarks) {
		this.questionMarks = questionMarks;
	}
	public int getChosenAnswer() {
		return chosenAnswer;
	}
	public void setChosenAnswer(int chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}
	public int getMarksScored() {
		return marksScored;
	}
	public void setMarksScored(int marksScored) {
		this.marksScored = marksScored;
	}
	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", questionTitle=" + questionTitle + ", questionOption="
				+ Arrays.toString(questionOption) + ", questionAnswer=" + questionAnswer + ", questionMarks="
				+ questionMarks + ", chosenAnswer=" + chosenAnswer + ", marksScored=" + marksScored + "]";
	}
	
	
	
	
}
