package com.capg.otms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
@RequestMapping("/test")
public class OtmsRestController {
	
	@Autowired
	OtmsServiceImp service;
	
	@PostMapping("/add")
	public String addUsers(@RequestBody UserBean userBean) {	
	UserBean add=service.addUser(userBean);
		return "hello";
	}
	
	@PutMapping("/update/{userId}")
	public String updateUsers(@RequestBody UserBean userBean,@PathVariable int userId) {
		
		UserBean update=service.updateUser(userId);
		return "updated";
		
	}
	@DeleteMapping("/delete/{userid}")
	public String deleteUsers(@PathVariable int userId)
	{
		service.deleteUser(userId);
		return "deleted";
	}

}
