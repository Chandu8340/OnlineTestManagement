package com.otms.dao;

import java.util.List;

import com.otms.entity.TestBean;

public interface ITestDao {

	TestBean CreateTest(TestBean bean);

	TestBean findTestById(int testId);

	List<TestBean> findAllTests();

	TestBean updateTest(TestBean bean);

}
