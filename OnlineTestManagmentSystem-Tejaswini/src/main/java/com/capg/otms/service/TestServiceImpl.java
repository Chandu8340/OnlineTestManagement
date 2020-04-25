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
	@Override
	public TestBean updateTest(TestBean test, String testTitle) {
		// TODO Auto-generated method stub
		return dao.updateTest(test,testTitle);
	}
	@Override
	public Set<questions> assignTest(int userId, int testId) {
		// TODO Auto-generated method stub
		return dao.assignTest(userId, testId);
	}
	


	

	
}
