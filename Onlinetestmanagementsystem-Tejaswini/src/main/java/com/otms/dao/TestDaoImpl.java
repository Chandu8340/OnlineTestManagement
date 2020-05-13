package com.otms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.otms.entity.TestBean;
@Repository
@Transactional
public class TestDaoImpl implements ITestDao {
	@PersistenceContext
	 private EntityManager entityManager;
	/*
	 * @author Tejaswini : create Test will insert the parameters into entity of TestBean*/

	@Override
	public TestBean CreateTest(TestBean bean) {
		// TODO Auto-generated method stub
		return entityManager.merge(bean);
	}
	/*
	 * @author Tejaswini : findTestById retrieve the details of particular id*/

	@Override
	public TestBean findTestById(int testId) {
		// TODO Auto-generated method stub
		return entityManager.find(TestBean.class,testId);
	}
	/*
	 * @author Tejaswini :getAll method will retrieve all details in entity TestBean*/
	
	@Override
	public List<TestBean> findAllTests() {
		Query q = entityManager.createQuery("select t from TestBean t");
	    List<TestBean> list=q.getResultList();
		return list;
	}
	/*
	 *@author Tejaswini : update method will update the parameters of particular id */
	
	@Override
	public TestBean updateTest(TestBean test) {
		TestBean bean=findTestById(test.getTestId());
		bean.setTestTitle(test.getTestTitle());
		bean.setTestDuration(test.getTestDuration());
		bean.setStartTime(test.getStartTime());
		bean.setEndTime(test.getEndTime());
		
		bean=entityManager.merge(bean);
		return bean;
		
		}

}
