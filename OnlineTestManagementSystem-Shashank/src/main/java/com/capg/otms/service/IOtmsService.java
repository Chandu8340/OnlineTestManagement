package com.capg.otms.service;

import com.capg.otms.entity.Questions;
import com.capg.otms.entity.Test;

public interface IOtmsService {
	public Questions update(Questions question);
	public Questions getResult(Test test);

}
