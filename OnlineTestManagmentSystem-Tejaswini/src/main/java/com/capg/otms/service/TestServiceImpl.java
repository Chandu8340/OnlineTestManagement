package com.capg.otms.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.otms.dao.ITestDao;
import com.capg.otms.entity.TestBean;
import com.capg.otms.entity.questions;



@Service
public class TestServiceImpl implements ITestService {
@Autowired
ITestDao dao;
public TestBean findTestById(int testId) {
	return dao.findTestById(testId);
}

@Override
public TestBean updateTest(TestBean test) {
			return dao.updateTest(test);
}
@Override
public Set<questions> assignTest(int userId, int testId) {
	return dao.assignTest(userId, testId);
}


@Override
public TestBean CreateTest(TestBean test) {
	// TODO Auto-generated method stub
	return dao.CreateTest(test);
}
	}
	


	

	

