package com.capg.otms.dao;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.otms.entity.Questions;
import com.capg.otms.entity.Test;
@Repository
@Transactional

public  class OtmsDaoImp implements IOtmsDao{
	
	@PersistenceContext
	EntityManager em;
	@Override
	public Questions update(Questions questions) {
		
		return em.merge(questions);
	}
	
	@Override
	public Questions addQuestions(Questions question) {
		// TODO Auto-generated method stub
		em.persist(question);
		System.out.println(question);
		return question;
	}
	

	@Override
	public List<Questions> getAllQuestions() {
		// TODO Auto-generated method stub
		TypedQuery<Questions> query=em.createQuery("from Questions",Questions.class);
		return query.getResultList();
	}


	@Override
	public Questions findById(int questionId) {
		// TODO Auto-generated method stub
		Questions question=em.find(Questions.class,questionId);
		
		return question;
		
	}


	@Override
	public int getResult(Questions question) {
		// TODO Auto-generated method stub
		return 0;
	}
}





	
	