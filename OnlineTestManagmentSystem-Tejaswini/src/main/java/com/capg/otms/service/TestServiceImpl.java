package com.capg.otms.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.otms.dao.ITestDao;
import com.capg.otms.entity.TestBean;




@Service
public class TestServiceImpl implements ITestService {
@Autowired
ITestDao dao;
@Override
public TestBean AddTest(TestBean bean) {
	// TODO Auto-generated method stub
	return dao.AddTest(bean);
}
@Override
public TestBean findTestById(int testId) {
	return dao.findTestById(testId);
}

@Override
public TestBean updateTest(TestBean bean) {
			return dao.updateTest(bean);
}



	}
	


	



