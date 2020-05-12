package com.capg.otms.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capg.otms.entity.Questions;
import com.capg.otms.service.IOtmsService;
@CrossOrigin(origins = "http://localhost:4200")//connection to UI layer
@RestController
@RequestMapping("/Questions")
public class QuestionController {
	@Autowired
	IOtmsService service;
	
	
	@PutMapping("/update")
	public Questions updateQuestions(@RequestBody Questions question) {
	
				service.update(question);
				return question;
				
				/**
				 * 
				 * @author shashank: this update method will update a question in to the database
				 * 
				 */
	}
	@GetMapping("/Questions/result")
	public int getResult(@PathVariable Questions question ) {
	service.getResult(question);
    return service.getResult(question);
		
	}
	@RequestMapping(method=RequestMethod.POST,value="/create")
	public Questions createQuestion(@RequestBody Questions question)
	{
		service.addQuestions(question);
		return question;
		
		/**
		 * 
		 * @author shashank: this create question will add a question in to the database
		 * 
		 */
	}
	@GetMapping("/findAll")
	public List<Questions>getAllQuestions()
	{
		List<Questions>queries=service.getAllQuestions();
		return queries;
		
		/**
		 * 
		 * @author shashank: this findAll method will view all the question added to the database
		 * 
		 */
	}
}