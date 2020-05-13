package com.otms.service;

import java.util.List;

import com.otms.entity.TestBean;

public interface ITestService {

	public TestBean CreateTest(TestBean bean);

	public TestBean findTestById(int testId);

	public List<TestBean> findAllTests();

	public TestBean updateTest(TestBean bean);

}
