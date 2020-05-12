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
		user.setFirstName("chandu");
		user.setLastName("reddy");
		user.setEmail("212chandu@gmail.com");
		user.setPassword("demo123");
		user.setPhonenumber(8885182933l);

		Mockito.when(dao.addUser(user)).thenReturn(user);
		assertThat(service.addUser(user)).isEqualTo(user);

	}

	@Test
	void testUpdateUser() {

		UserBean user = new UserBean();
		user.setUserId(101);
		user.setFirstName("chandu");
		user.setLastName("reddy");
		user.setEmail("212chandu@gmail.com");
		user.setPassword("demo123");
		user.setPhonenumber(8885182933l);

		Mockito.when(dao.updateUser(user)).thenReturn(user);
		assertThat(service.updateUser(user)).isEqualTo(user);

	}
	@Test
	public void testdeleteUser(){
		UserBean userBean=new UserBean(101,"chandu","reddy","212chandu@gmail.com","demo123",8888999977l);
		
		service.deleteUser(101);
		verify(dao,times(1)).deleteUser(101);
		
	}

}
