package com.capg.otms.controller;

import java.util.List;

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
	
	@PostMapping(path="/add")
	public String addUsers(@RequestBody UserBean userBean) {	
	UserBean add=service.addUser(userBean);
		return "hello";
	}
	
	@PutMapping(path="/update")
	public String updateUsers(@RequestBody UserBean userBean) {
		
		UserBean update=service.updateUser(userBean);
		return "updated";
		
	}
	@DeleteMapping(path="/delete/{userId}")
	public String deleteUsers(@PathVariable int userId)
	{
		service.deleteUser(userId);
		
		return "deleted";
		
	}
	
	@GetMapping("/getall")
	public List<UserBean> getAllUsers() {
		
		List<UserBean> list=service.getAllUser();
		return list;
		
	}

}
