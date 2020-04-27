package com.capg.otms.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.otms.dao.IOtmsDao;
import com.capg.otms.entity.Questions;
import com.capg.otms.entity.Test;
@Service
public abstract class OtmsServiceImp implements IOtmsService {
	@Autowired
	IOtmsDao dao;
	public Questions updateQuestion(Questions question, int TestId) {
		return dao.updateQuestions(question, TestId);
	}
	public Questions getResult(Questions question, Test test) {
		return dao.getResult(test);
	}

}
