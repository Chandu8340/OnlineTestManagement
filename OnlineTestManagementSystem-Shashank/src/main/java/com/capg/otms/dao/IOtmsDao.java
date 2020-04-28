package com.capg.otms.dao;

import com.capg.otms.entity.Questions;
import com.capg.otms.entity.Test;


public interface IOtmsDao {
	public Questions update(Questions question);
	public Questions getResult(Test test);

}
