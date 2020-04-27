package com.capg.otms.service;

import java.util.Set;


import com.capg.otms.entity.TestBean;
import com.capg.otms.entity.questions;



public interface ITestService {
	public TestBean CreateTest(TestBean test);
	public TestBean findTestById(int testId);
	public TestBean updateTest(TestBean test);
	 public Set<questions>  assignTest(int userId,int testId);
}
