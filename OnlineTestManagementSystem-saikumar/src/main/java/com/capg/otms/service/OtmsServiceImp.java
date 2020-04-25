package com.capg.otms.service;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.otms.dao.IOtmsDao;
import com.capg.otms.entity.Questions;
@Service
public class OtmsServiceImp implements IOtmsService {
@Autowired
IOtmsDao dao;
	@Override
	public Questions addQuestion(int TestId, Questions question) {
		// TODO Auto-generated method stub
		return dao.addQuestion(TestId, question);
	}

	@Override
	public Questions deleteQuestion(int TestId, Questions question) {
		// TODO Auto-generated method stub
		return dao.deleteQuestion(TestId, question);
	}

	

}
