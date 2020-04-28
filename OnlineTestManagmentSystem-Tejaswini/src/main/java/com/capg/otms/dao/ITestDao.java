package com.capg.otms.dao;

import java.util.Set;

import com.capg.otms.entity.TestBean;


public interface ITestDao {
	public TestBean AddTest(TestBean bean);
	 public TestBean updateTest(TestBean bean);
	 public TestBean findTestById(int testId);
	
	}
