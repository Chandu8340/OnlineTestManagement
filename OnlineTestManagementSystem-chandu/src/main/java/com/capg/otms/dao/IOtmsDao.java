package com.capg.otms.dao;

import java.util.List;

import com.capg.otms.entity.UserBean;

public interface IOtmsDao {

	public UserBean registerUser(UserBean userBean);
	
	 public UserBean updateUser(UserBean userBean);
     
	    public UserBean deleteUser (int userId);
	    
	    public List<UserBean> getAllUser();
	
}
