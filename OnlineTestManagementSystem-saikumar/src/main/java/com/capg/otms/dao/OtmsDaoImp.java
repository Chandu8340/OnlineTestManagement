package com.capg.otms.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.capg.otms.entity.Questions;
import com.capg.otms.service.OtmsServiceImp;

@Repository
@Transactional
public class OtmsDaoImp implements IOtmsDao {
	@PersistenceContext
	EntityManager entityManager;

	@Autowired
	OtmsServiceImp service;
	
	

	/**
	 * 
	 * @author saikumar: this add question method will add a question in to the bean
	 * 
	 */
	@Override
	public Questions addQuestion(Questions question) {
		System.out.println("inside persist method");
	String[] array=	question.getQuestionOption();
	


		entityManager.persist(question);
	
	

		System.out.println(question);
		return question;
	}

	/**
	 * 
	 * @author saikumar: this delete questionbyId will delete the details of
	 *         Question from bean
	 */
	@Override
	public void deleteQuestion(int questionId) {
		// TODO Auto-generated method stub

		Questions question = entityManager.find(Questions.class, questionId);
		System.out.println("dao " + question.getQuestionTitle());
		entityManager.remove(question);

	}

	/**
	 * author saikumar:this method will retrieve the details of the added questions
	 */

	@Override
	public List<Questions> getAllQuestions() {
		TypedQuery<Questions> query = entityManager.createQuery("from Questions", Questions.class);
		
		return query.getResultList();
	}

	@Override
	public Questions findTheValue(int questionId) {
		System.out.println("inside dao impl" + questionId);

		return entityManager.find(Questions.class, questionId);
	}


	

}
