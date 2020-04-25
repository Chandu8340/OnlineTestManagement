package com.capg.otms.dao;

import com.capg.otms.entity.UserBean;

public interface IOtmsDao {

	public UserBean registerUser(UserBean userBean);
	
	 public UserBean updateUser(int userId);
     
	    public UserBean deleteUser (int userId);
	
}
