package com.capg.otms.dao;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.otms.entity.Questions;
@Repository
@Transactional

public abstract class OtmsDaoImp implements IOtmsDao{
	
	
	EntityManager em;
	public Questions updateQuestins(Questions questions,int TestId) {
		em.persist(questions);
		return questions;
	}

}
