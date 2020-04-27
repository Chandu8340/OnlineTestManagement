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
	public TestBean CreateTest(TestBean test) {
	   return entitymanager.merge(test);

	}
	
	@Override
	public TestBean findTestById(int testId) {
		// TODO Auto-generated method stub
		return entitymanager.find(TestBean.class,testId);
	}

	@Override
	public TestBean updateTest(TestBean test) {
		TestBean tst=findTestById(test.getTestId());
		tst.setTestTitle(test.getTestTitle());
		//emp.setEmpSal(test.getEmpSal());
		tst=entitymanager.merge(tst);
		return tst;
	   // return entitymanager.merge(test);
	}
	
	@Override
	public Set<questions> assignTest(int userId, int testId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
