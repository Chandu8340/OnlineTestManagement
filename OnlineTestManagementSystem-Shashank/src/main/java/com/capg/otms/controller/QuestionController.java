package com.capg.otms.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.capg.otms.entity.Questions;
import com.capg.otms.entity.Test;
import com.capg.otms.service.IOtmsService;
import com.capg.otms.service.OtmsServiceImp;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class QuestionController {
	@Autowired
	IOtmsService service;
	@PutMapping("/update")
	public Questions updateQuestions(@RequestBody Questions question) {
	
				service.update(question);
				return question;
	}
	@GetMapping("/Questions/result")
	public String getResult(@PathVariable int QuestionId, Test test ) {
		Questions questions=service.getResult(test);
				return "your result is"+service.getResult(test);
		
	}
	

}
