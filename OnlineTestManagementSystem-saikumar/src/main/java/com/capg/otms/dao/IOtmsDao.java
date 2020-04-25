package com.capg.otms.dao;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;

import com.capg.otms.entity.Questions;

public interface IOtmsDao {

	Questions addQuestion(int TestId,Questions question);
	Questions deleteQuestion(int TestId,Questions question);
	
	
}
