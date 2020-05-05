package com.capg.otms.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.otms.entity.TestBean;
import com.capg.otms.entity.User;
import com.capg.otms.repository.ITestRepo;




@Repository
@Transactional
public class TestDaoImpl implements ITestDao {
	@PersistenceContext
	EntityManager entitymanager;
	ITestRepo repo;
	User user = new User(10l, "Candidate", null ,false,"password");
	@Override
	public TestBean createTest(TestBean bean) {
	   return entitymanager.merge(bean);

	}
	
	@Override
	public TestBean findTestById(int testId) {
		return entitymanager.find(TestBean.class,testId);
	}

	@Override
	public TestBean updateTest(TestBean bean) {
		TestBean test=findTestById(bean.getTestId());
		test.setTestTitle(bean.getTestTitle());
		test.setTestTitle(bean.getTestTitle());
		test.setTestDuration(bean.getTestDuration());
		test.setStartTime(bean.getStartTime());
		test.setEndTime(bean.getEndTime());
		test=entitymanager.merge(test);
		return test;
	  
	}

	@Override
	public List<TestBean> findAllTests() {
		Query q = entitymanager.createQuery("select t from test1 t");
	    List<TestBean> list=q.getResultList();
		return list;
	}

	@Override
	public boolean assignTest(long testId) {
		 boolean assignedTest = repo.existsById(testId);
		if(assignedTest) {
			TestBean bean =  repo.getOne(testId);
			if(user.isAdmin()==false) {
			user.setUserTest(bean);
			return true;
			}}
		return false;
	}
	
}
