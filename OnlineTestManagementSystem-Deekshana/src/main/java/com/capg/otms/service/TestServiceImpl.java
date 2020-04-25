package com.capg.otms.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.otms.dao.ITestDao;
import com.capg.otms.entity.TestBean;

@Service
public class TestServiceImpl implements ITestService {
@Autowired
ITestDao dao;

@Override
public TestBean addTest (TestBean Bean ) {
return dao.addTest(Bean);
}
@Override
public void removeTest(int testId) {

dao.removeTest(testId);
}
@Override
public List<TestBean>getAllTests() {
	return dao.getAllTests();
}}