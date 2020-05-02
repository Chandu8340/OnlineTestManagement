package com.capg.otms.dao;

import java.util.List;

import com.capg.otms.entity.Questions;
import com.capg.otms.entity.Test;


public interface IOtmsDao {
	public Questions update(Questions question);
	public int getResult(Questions question);
	public Questions addQuestions(Questions question);
	public List<Questions>getAllQuestions();


}
