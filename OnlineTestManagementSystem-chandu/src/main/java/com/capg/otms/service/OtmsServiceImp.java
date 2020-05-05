package com.capg.otms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.otms.dao.IOtmsDao;
import com.capg.otms.entity.UserBean;
import com.capg.otms.exception.UserException;

@Service
public class OtmsServiceImp implements IOtmsService {

	@Autowired
	IOtmsDao dao;

	@Override
	public UserBean addUser(UserBean userBean) {

		UserBean user = dao.findById(userBean.getUserId());
		if (user == null) {
			return dao.addUser(userBean);
		} else {
			try {
				throw new UserException("userId exists");

			} catch (UserException e) {
				System.err.println(e.getMessage());

			}
			return userBean;

		}

	}

	@Override
	public UserBean updateUser(UserBean userBean) {
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

	@Override
	public UserBean findById(long userId) {

		return dao.findById(userId);
	}

}
