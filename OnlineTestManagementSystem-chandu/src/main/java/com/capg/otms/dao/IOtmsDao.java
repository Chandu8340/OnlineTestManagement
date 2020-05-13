package com.capg.otms.dao;

import java.util.List;

import com.capg.otms.entity.UserBean;

public interface IOtmsDao {

	public UserBean addUser(UserBean userBean);

	public UserBean updateUser(UserBean userBean);

	public void deleteUser(long userId);

	public List<UserBean> getAllUser();

	public UserBean findById(long userId);

}
