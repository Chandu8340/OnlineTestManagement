package com.capg.otms.service;

import java.util.List;

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
	public Questions addQuestion(Questions question) {
		// TODO Auto-generated method stub
		return dao.addQuestion(question);
	}

	@Override
	public void deleteQuestion(int questionId) {
		// TODO Auto-generated method stub
		 dao.deleteQuestion(questionId);
	}

	@Override
	public List<Questions> getAllQuestions() {
		// TODO Auto-generated method stub
		return dao.getAllQuestions();
	}

	

}
