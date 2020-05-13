package com.capg.otms.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.otms.dao.OtmsDaoImp;
import com.capg.otms.entity.UserBean;

@RunWith(SpringRunner.class)
@SpringBootTest
class OtmsServiceImpTest {

	@Autowired
	private OtmsServiceImp service;

	@MockBean
	private OtmsDaoImp dao;

	@Test
	void testAddUser() {

		UserBean user = new UserBean();
		user.setUserId(101);
		user.setUserName("chandu");
		user.setEmail("212chandu@gmail.com");
		user.setPassword("demo123");
		user.setPhonenumber(8125241259l);
		

		Mockito.when(dao.addUser(user)).thenReturn(user);
		assertThat(service.addUser(user)).isEqualTo(user);

	}

	@Test
	void testUpdateUser() {

		UserBean user = new UserBean();
		user.setUserId(101);
		user.setUserName("rajesh");
		user.setEmail("raju@gmail.com");
		user.setPassword("demo");
		user.setPhonenumber(8125241259l);
		

		Mockito.when(dao.updateUser(user)).thenReturn(user);
		assertThat(service.updateUser(user)).isEqualTo(user);

	}
	@Test
	public void testdeleteUser(){
		UserBean userBean=new UserBean(101,"chandu","212chandu@gmail.com","chandu123",8125241259l);
		
		service.deleteUser(101);
		verify(dao,times(1)).deleteUser(101);
		
	}

}
