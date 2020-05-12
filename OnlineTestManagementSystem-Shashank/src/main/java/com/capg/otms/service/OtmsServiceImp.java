package com.capg.otms.service;
import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.otms.dao.IOtmsDao;
import com.capg.otms.entity.Questions;
import com.capg.otms.entity.Test;
import com.capg.otms.exceptions.QuestionException;

@Service
public  class OtmsServiceImp implements IOtmsService {
	@Autowired
	IOtmsDao dao;
	public Questions update(Questions question) {
		return dao.update(question);
	}
	@Override
	public int getResult(Questions question) {
		// TODO Auto-generated method stub
		return dao.getResult(question);
	}
	@Override
	public List<Questions> getAllQuestions() {
		// TODO Auto-generated method stub
		return dao.getAllQuestions();
	}
	@Override
	public Questions addQuestions(Questions question) {
		// TODO Auto-generated method stub
		 Questions ques=dao.findById(question.getQuestionId());
		if(ques==null) {
			return dao.addQuestions(question);
		}
		else
		{
			try {
				throw new QuestionException("Question exists");
			}
			catch(QuestionException e) {
				System.err.println(e.getMessage());
			}
			return question;
		}
			}
		}
	



