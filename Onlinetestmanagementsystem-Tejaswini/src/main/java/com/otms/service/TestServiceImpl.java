package com.otms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.otms.dao.ITestDao;
import com.otms.entity.TestBean;
@Service
public class TestServiceImpl implements ITestService{
	@Autowired
	private ITestDao Dao;
	/*
	 * @author Tejaswini : create Test will insert the parameters into entity*/

	@Override
	public TestBean CreateTest(TestBean bean) {
		return Dao.CreateTest(bean);
	}
	/*
	 * @author Tejaswini : find test by Id retrieve the details of particular id*/

	@Override
	public TestBean findTestById(int testId) {
		return Dao.findTestById(testId);
	}
	/*
	 * @author Tejaswini :findAllTests method will retrieve all details in entity*/

	@Override
	public List<TestBean> findAllTests() {
		return Dao.findAllTests();
	}
	/*
	 * @author Tejaswini : update method will update the parameters of particular id*/

	@Override
	public TestBean updateTest(TestBean bean) {
		return Dao.updateTest(bean);
	}

}
