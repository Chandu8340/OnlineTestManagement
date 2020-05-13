package com.capg.otms.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.otms.dao.ITestDao;

import com.capg.otms.entity.TestBean;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceTest {
	@Autowired
	private ITestService testservice;
	@MockBean
	private  ITestDao testdao;
	@Test
	public void test() {
		TestBean testbean=new TestBean();
		testbean.setTestTitle("JAVA");
		testbean.setTestQuestion1("What is final");
		testbean.setTestTotalMarks(100.00);
		Mockito.when(testdao.addTest(testbean)).thenReturn(testbean);
		assertThat(testservice.addTest(testbean)).isEqualTo(testbean);
	}
@Test
public void testgetAlltest() {
	TestBean testbean1=new TestBean();
	 testbean1.setTestTitle("JAVA");
	 testbean1.setTestDuration("2 hours 30 mins");
	 testbean1.setTestQuestion1("What is final?");
	 testbean1.setTestQuestion2("What is Inheritance?");
	 testbean1.setTestQuestion3("What is Static?");
	 testbean1.setTestTotalMarks(100.0);
	 testbean1.setTestMarksScored( 70.0);
	 testbean1.setStartTime("3:30");
	 testbean1.setEndTime( "6:00");
	  List<TestBean>testlist=new ArrayList();
	  testlist.add(testbean1);
	  
	  Mockito.when(testdao.getAllTests()).thenReturn(testlist);
	  assertThat(testservice.getAllTests()).isEqualTo(testlist);
	  assertEquals(testlist.size(),1);
}
	
}
