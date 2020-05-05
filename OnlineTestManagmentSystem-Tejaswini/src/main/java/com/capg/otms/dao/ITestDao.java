package com.capg.otms.dao;

import java.util.List;
import java.util.Set;

import com.capg.otms.entity.TestBean;


public interface ITestDao {
	TestBean createTest(TestBean bean);
	
	TestBean updateTest(TestBean bean);
	
	TestBean findTestById(int testId);
	
	List<TestBean> findAllTests();

	boolean assignTest(long testId);
	
}
