package com.capg.otms.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.capg.otms.entity.Questions;
@Repository
public class OtmsDaoImp implements IOtmsDao {
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Questions addQuestion(int TestId, Questions question) {
		entityManager.persist(question);
		return question;
	}

	@Override
	public Questions deleteQuestion(int TestId, Questions question) {
entityManager.remove(question);
		return null;
	}


}
