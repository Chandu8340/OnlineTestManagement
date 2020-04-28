package com.capg.otms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.otms.dao.IOtmsDao;
import com.capg.otms.entity.UserBean;
@Service
public class OtmsServiceImp implements IOtmsService {

	@Autowired
	IOtmsDao dao;
	
	@Override
	public UserBean addUser(UserBean userBean) {
		
		return dao.addUser(userBean);
	}

	@Override
	public UserBean updateUser( UserBean userBean) {
		return dao.updateUser(userBean);
	}

	@Override
	public void deleteUser(long userId) {
		
		 dao.deleteUser(userId);
		
	}

	@Override
	public List<UserBean> getAllUser() {
		
		return dao.getAllUser();
	}

	
	}

	

	


