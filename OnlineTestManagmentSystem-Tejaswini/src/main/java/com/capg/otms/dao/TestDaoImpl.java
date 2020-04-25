package com.capg.otms.dao;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.otms.entity.TestBean;
import com.capg.otms.entity.questions;

@Repository
@Transactional
public class TestDaoImpl implements ITestDao {
	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public TestBean updateTest(TestBean test, String testTitle) {
		
		return entitymanager.merge(test);
	}

	@Override
	public Set<questions> assignTest(int userId, int testId) {
		// TODO Auto-generated method stub
		return null;
	}

}
