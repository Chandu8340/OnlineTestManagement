package com.capg.otms.service;

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
		
		return dao.registerUser(userBean);
	}

	@Override
	public UserBean updateUser( int userId) {
		return dao.updateUser(userId);
	}

	@Override
	public UserBean deleteUser(int userId) {
		
		return dao.deleteUser(userId);
		
	}

	

	

}
