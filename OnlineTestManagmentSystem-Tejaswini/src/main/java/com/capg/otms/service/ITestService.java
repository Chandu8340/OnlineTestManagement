package com.capg.otms.service;

import java.util.Set;


import com.capg.otms.entity.TestBean;




public interface ITestService {
	public TestBean AddTest(TestBean bean);
	public TestBean findTestById(int testId);
	public TestBean updateTest(TestBean bean);
	 
}
