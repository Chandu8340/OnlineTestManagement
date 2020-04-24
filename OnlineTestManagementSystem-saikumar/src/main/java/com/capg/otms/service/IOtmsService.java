package com.capg.otms.service;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;

import com.capg.otms.entity.Questions;

public interface IOtmsService {

	Questions addQuestion(int TestId,Questions question);
	Questions deleteQuestion(int TestId,Questions question);
	
	
	
}
