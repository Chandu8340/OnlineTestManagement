package com.capg.otms.service;

import java.util.List;


import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.otms.dao.IOtmsDao;
import com.capg.otms.entity.Questions;
import com.capg.otms.exceptions.QuestionException;
import com.capg.otms.exceptions.QuestionNotFoundException;
@Service
public class OtmsServiceImp implements IOtmsService {
@Autowired
IOtmsDao dao;
	@Override
	public Questions addQuestion(Questions question) {
		// TODO Auto-generated method stub
		
		 Questions ques=dao.findById(question.getQuestionId());
		  if(ques==null) {
		  
		  return dao.addQuestion(question); 
		  } else {
		  
		  try { throw new QuestionException("Question Exists"); }
		  
		  catch (QuestionException e) 
		  { System.err.println(e.getMessage()); 
		  }
		 
		return question ;
		}
		
		
	
	}

	@Override
	public void deleteQuestion(int questionId) {
		// TODO Auto-generated method stub
		Questions ques=dao.findById(questionId);
		Questions question =new Questions();
		

	if(ques==null)
	{
			try {
				throw new QuestionException("Question does not Exists");
			} catch (QuestionException e) {
				System.err.println(e.getMessage());
			} 
		}
	else
	{
	 dao.deleteQuestion(questionId);	
	 
	}

		
	
	}
		
		
		
		
		 


	@Override
	public List<Questions> getAllQuestions() {
		// TODO Auto-generated method stub
		return dao.getAllQuestions();
	}
	@Override
	public Questions findById(int questionId)
	{
		return dao.findById(questionId);
	    
	}
		

	

}
