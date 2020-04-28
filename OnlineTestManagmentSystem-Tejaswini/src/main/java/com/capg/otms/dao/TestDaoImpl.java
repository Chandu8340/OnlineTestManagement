package com.capg.otms.dao;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.otms.entity.TestBean;


@Repository
@Transactional
public class TestDaoImpl implements ITestDao {
	@PersistenceContext
	EntityManager entitymanager;
	
	@Override
	public TestBean AddTest(TestBean bean) {
	   return entitymanager.merge(bean);

	}
	
	@Override
	public TestBean findTestById(int testId) {
		// TODO Auto-generated method stub
		return entitymanager.find(TestBean.class,testId);
	}

	@Override
	public TestBean updateTest(TestBean bean) {
		TestBean test=findTestById(bean.getTestId());
		test.setTestTitle(bean.getTestTitle());
		//emp.setEmpSal(test.getEmpSal());
		test=entitymanager.merge(test);
		return test;
	   // return entitymanager.merge(test);
	}
	
	

	

}
