package com.capg.otms.service;

import com.capg.otms.entity.UserBean;

public interface IOtmsService {
	
	
     public UserBean addUser(UserBean userBean);
     
    public UserBean updateUser(int userId);
     
    public UserBean deleteUser (int userId);
  
}
