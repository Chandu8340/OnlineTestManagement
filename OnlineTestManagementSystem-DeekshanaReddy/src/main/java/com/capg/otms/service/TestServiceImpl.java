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
 

/**
 * @author deekshana: This addTest method will insert details into the entity of TestBean
 */
@Override
public TestBean addTest (TestBean Bean ) {
return dao.addTest(Bean);
}


/**
 * @author deekshana: This removeTest method will delete details of TestBean present in particular id 
 */
@Override
public void removeTest(int testId) {
	
dao.removeTest(testId);

}



/**
 * @author deekshana: This List method will retrive all the details tests
 */
@Override
public List<TestBean>getAllTests() {
	return dao.getAllTests();
}
}