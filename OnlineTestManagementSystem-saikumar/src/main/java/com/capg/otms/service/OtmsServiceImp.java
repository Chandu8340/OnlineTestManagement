package com.capg.otms.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.otms.dao.IOtmsDao;
import com.capg.otms.dao.OtmsDaoImp;
import com.capg.otms.entity.Questions;
import com.capg.otms.exceptions.QuestionException;
import com.capg.otms.exceptions.QuestionNotFoundException;
@Service
public class OtmsServiceImp implements IOtmsService {
@Autowired
IOtmsDao dao;

@Autowired
OtmsDaoImp daoImp;
int status ;
List<Questions> list=new ArrayList<Questions>();

	@Override
	public Questions addQuestion(Questions question) {
		// TODO Auto-generated method stub
		
		 Questions ques=dao.findTheValue(question.getQuestionId());
		 System.out.println("question d is here  "+question.getQuestionId());
		 System.out.println("serivice impl   " +ques);
		 //System.out.println("checking question "+question.getTestbean().toString());
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
			Questions ques = dao.findTheValue(questionId);
		if(ques==null)
		{
		
		
				try {
					throw new QuestionException("Question does not Exists");
				} catch (QuestionException e) {
					status=400;
					System.err.println(e.getMessage());
					
					//System.exit(1);
				} 
			}
		else if(ques!=null)
		{
		 System.out.println("title is "+ques.getQuestionTitle());
		 
		 dao.deleteQuestion(ques.getQuestionId());	
		}
	
		
		
		
	}
		
		
		
		
		 


	@Override
	public List<Questions> getAllQuestions() {
		// TODO Auto-generated method stub
		//Questions[] ques=resttemplate.getForObject("http://question-add-and-delete/api/findAll",Questions[].class);
		//return Arrays.asList(ques);
		return dao.getAllQuestions();
		
	}
		

	public int hereWeAre()
	{
		System.out.println(status);
		if(status==400)
		{
			return 400;
		}

		else 
		{
			return 200;
		}
		
	}

	
}
