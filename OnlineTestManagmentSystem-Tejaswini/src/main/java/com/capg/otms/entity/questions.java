package com.capg.otms.entity;

public class questions {
	private int questionId;
	   private  String questionTitle;
	   private  String correctAnwser;
	   private  int questionsMarks;
	   public questions(int questionId, String questionTitle, String correctAnwser, int questionsMarks) {
		super();
		this.questionId = questionId;
		this.questionTitle = questionTitle;
		this.correctAnwser = correctAnwser;
		this.questionsMarks = questionsMarks;
	}
	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", questionTitle=" + questionTitle + ", questionsMarks=" + questionsMarks + "]";
	}

}
