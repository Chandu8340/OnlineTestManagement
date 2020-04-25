package com.capg.otms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.otms.entity.TestBean;
import com.capg.otms.service.TestServiceImpl;

@RestController
@RequestMapping({"/test"})
public class TestController{
	
	@Autowired
	TestServiceImpl testserviceimpl;

	@PutMapping("/update/{test}")
	public String updateTest(@RequestBody TestBean test, String testTitle)
	{
		testserviceimpl.updateTest(test, testTitle);
		return "updated sucessffully";
		
	}

}
