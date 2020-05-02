package com.capg.otms.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.otms.dao.ITestDao;
import com.capg.otms.entity.TestBean;

@Service

public class TestServiceImpl implements ITestService {
	@Autowired
	private ITestDao dao;

	public TestBean createTest(TestBean bean) {
		return dao.createTest(bean);
	}

	public TestBean findTestById(int testId) {
		return dao.findTestById(testId);
	}

	public TestBean updateTest(TestBean bean) {
		return dao.updateTest(bean);
	}

	public List<TestBean> findAllTests() {
		return dao.findAllTests();
	}

	public boolean assignTest(long testId) {
		return dao.assignTest(testId);
	}

}
	


	



