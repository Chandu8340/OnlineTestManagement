package com.capg.otms.service;

import java.util.List;

import com.capg.otms.entity.UserBean;

public interface IOtmsService {
	
	
     public UserBean addUser(UserBean userBean);
     
    public UserBean updateUser(UserBean userBean);
     
    public UserBean deleteUser (int userId);
    
    public List<UserBean> getAllUser();
  
}
