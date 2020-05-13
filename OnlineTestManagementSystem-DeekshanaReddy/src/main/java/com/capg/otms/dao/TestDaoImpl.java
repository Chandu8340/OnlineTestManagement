package com.capg.otms.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.otms.entity.TestBean;

@Repository
@Transactional
public class TestDaoImpl implements ITestDao{
	@PersistenceContext
	EntityManager entitymanager;
	
	/**
	 * @author deekshana: This addTest method will insert details into the entity of TestBean
	 */
	
	@Override
	public TestBean addTest(TestBean bean )
	{

		 entitymanager.persist(bean);
		 
		 return bean;
	}
	
	
	/**
	 * @author deekshana: This removeTest method will delete details of TestBean present in particular id 
	 */
	
	@Override
	public void removeTest (int testId )
	{
		TestBean testbean=entitymanager.find(TestBean.class,testId);
 entitymanager.remove(testbean);
	}
	
	
	/**
	 * @author deekshana: This List method will retrive all the details tests
	 */
	@Override
	public List<TestBean> getAllTests(){
		TypedQuery<TestBean> query=entitymanager.createQuery("from TestBean",TestBean.class);
		return query.getResultList();
		
	}
	}
