package com.capg.otms.service;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;

import com.capg.otms.entity.Questions;
import com.capg.otms.entity.Test;

public interface IOtmsService {
	public Questions update(Questions question);
	public int getResult(Questions question);
	public Questions addQuestions(Questions question);
	public List<Questions>getAllQuestions();

}
