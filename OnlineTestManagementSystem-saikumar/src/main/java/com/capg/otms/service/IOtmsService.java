package com.capg.otms.service;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;

import com.capg.otms.entity.Questions;

public interface IOtmsService {

	Questions addQuestion(Questions question);
	public void deleteQuestion(int questionId);
	List<Questions>getAllQuestions();
	
}
