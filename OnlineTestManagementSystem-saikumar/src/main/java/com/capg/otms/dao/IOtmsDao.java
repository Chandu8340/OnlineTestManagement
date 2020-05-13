package com.capg.otms.dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.capg.otms.entity.Questions;

@Repository
public interface IOtmsDao {

	public Questions addQuestion(Questions question);
	public void deleteQuestion(int questionId);
	List<Questions>getAllQuestions();
	public Questions findTheValue(int questionId);
	
}
