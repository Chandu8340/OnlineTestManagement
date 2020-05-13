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
/*
 * @CrossOrigin is used to integrate Angular with SpringBoot
 */

@RestController
@RequestMapping(value = "/test")
public class OtmsRestController {

	@Autowired
	OtmsServiceImp service;

	/*
	 * @author=Chandra Mohan
	 * This addUsers method is used to add users into database This method will move
	 * to service layer
	 */

	@PostMapping(path = "/add")
	public UserBean addUsers( @Valid @RequestBody UserBean userBean) {
		service.addUser(userBean);
		return userBean;
	}

	/*
	 * This updateUsers method is used to update users into database This method
	 * will move to service layer
	 */
	@PutMapping(path = "/update")
	public UserBean updateUsers( @Valid @RequestBody UserBean userBean) {
		service.updateUser(userBean);
		return userBean;

	}

	/*
	 * This deleteUsers method is used to delete users from database This method
	 * will move to service layer
	 */

	@DeleteMapping(path = "/delete/{userId}")
	public void deleteUsers(@PathVariable long userId) {

		service.deleteUser(userId);

	}

	/*
	 * This getAllUsers method is used to get users from database This method will
	 * move to service layer
	 */
	@GetMapping(path = "/getall")
	public List<UserBean> getAllUsers() {

		List<UserBean> list = service.getAllUser();

		return list;
	}

}
