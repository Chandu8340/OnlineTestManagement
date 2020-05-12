package com.capg.otms;
import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.otms.entity.TestBean;
import com.capg.otms.service.TestServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class OnlineTestManagementSystemDeekshanaApplicationTests {
	@Autowired
	TestServiceImpl testserviceimpl;

	@Test
	void getAllTests()
	{
		List<TestBean> bean=testserviceimpl.getAllTests();
		assertEquals(bean.size(),6);
	//void contextLoads() {
	}
	
}