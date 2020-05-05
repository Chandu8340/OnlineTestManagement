package com.capg.otms.service;

import java.util.List;
import java.util.Set;


import com.capg.otms.entity.TestBean;




public interface ITestService {
	
	 TestBean createTest(TestBean bean);
	
	 TestBean findTestById(int testId);
	 
	 TestBean updateTest(TestBean bean);
	 
	 List<TestBean> findAllTests();
	 
	 boolean assignTest(long testId);
	 
}
