package com.capg.otms.service;

import static org.assertj.core.api.Assertions.assertThat;

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

}
