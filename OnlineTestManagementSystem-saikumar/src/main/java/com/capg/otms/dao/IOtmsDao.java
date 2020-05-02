package com.capg.otms.dao;

import java.util.List;

import com.capg.otms.entity.Questions;

public interface IOtmsDao {

	public Questions addQuestion(Questions question);
	public void deleteQuestion(int questionId);
	List<Questions>getAllQuestions();
	public Questions findById(int questionId);
	
}
