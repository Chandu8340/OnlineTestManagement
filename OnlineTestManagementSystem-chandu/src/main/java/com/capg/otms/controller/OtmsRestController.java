package com.capg.otms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.otms.entity.UserBean;
import com.capg.otms.service.OtmsServiceImp;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value="/test")
public class OtmsRestController {

	@Autowired
	OtmsServiceImp service;

	
	
	// This addUsers method is used to add users into database 
	
	@PostMapping(path="/add")
	public UserBean addUsers( @RequestBody UserBean userBean) {
		service.addUser(userBean);
		return userBean ;
	}

	
	//This updateUsers is used to update the details of Users  
	
	@PutMapping(path= "/update")
	public UserBean updateUsers( @RequestBody UserBean userBean) {
		service.updateUser(userBean);
		return  userBean;

	}

	//This deleteUsers method is used to delete users in database
	
	@DeleteMapping(path="/delete/{userId}")
	public String deleteUsers(@PathVariable long userId) {

		 service.deleteUser(userId);

		return  "deleted";

	}

	//This method is used to show all the Users 
	
	@GetMapping(path="/getall")
	public List<UserBean> getAllUsers() {

		List<UserBean> list = service.getAllUser();

		return list;
	}
	
	
	

}
