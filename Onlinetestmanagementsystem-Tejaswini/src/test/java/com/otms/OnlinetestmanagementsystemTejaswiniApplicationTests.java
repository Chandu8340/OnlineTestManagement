package com.otms;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.otms.dao.ITestDao;
import com.otms.entity.TestBean;
import com.otms.service.TestServiceImpl;
@RunWith(SpringRunner.class)
@SpringBootTest
class OnlinetestmanagementsystemTejaswiniApplicationTests {
	@Autowired
	private TestServiceImpl tsi;
	@MockBean
	private ITestDao dao;
	private EntityManager em;
/*** test case for create test*/
	@Test
	public void createTest() {
		TestBean bean=new TestBean();
		bean.setTestId(2);
		bean.setTestTitle("Java");
		bean.setTestDuration("01:00:00");
		bean.setStartTime("09:00:00 AM");
		bean.setEndTime("10:00:00 AM");
		Mockito.when(dao.CreateTest(bean)).thenReturn(bean);
		assertThat(tsi.CreateTest(bean)).isEqualTo(bean);	
	}
	/*** test case for List test*/
	@Test
	public void findAllTests() {
		TestBean bean1=new TestBean();
		bean1.setTestId(2);
		bean1.setTestTitle("java");
		bean1.setTestDuration("01:00:00");
		bean1.setStartTime("09:00:00 AM");
		bean1.setEndTime("10:00:00 AM" );
		List<TestBean> testlist=new ArrayList<>();
		testlist.add(bean1);
		Mockito.when(dao.findAllTests()).thenReturn(testlist);
		assertThat(tsi.findAllTests()).isEqualTo(testlist);	
	}
	/*** test case for Update test*/
	@Test
	public void updateTest() {
		TestBean bean=new TestBean();
		bean.setTestId(2);
		bean.setTestTitle("string");
		bean.setTestDuration("01:00:00");
		bean.setStartTime("09:00:00 AM");
		bean.setEndTime("10:00:00 AM");
		Mockito.when(dao.updateTest(bean)).thenReturn(bean);
		assertThat(tsi.updateTest(bean)).isEqualTo(bean);	
	}

}
