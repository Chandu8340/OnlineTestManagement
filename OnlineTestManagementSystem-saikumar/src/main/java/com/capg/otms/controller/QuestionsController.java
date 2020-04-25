package com.capg.otms.controller;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.otms.dao.OtmsDaoImp;
import com.capg.otms.entity.Questions;
import com.capg.otms.service.OtmsServiceImp;
@RestController
public class QuestionsController {
	@Autowired
	OtmsServiceImp service;
@PostMapping("/create/{{TestId}}")
	public Questions createQuestion(@PathVariable int TestId,@RequestBody Questions question)
	{
		service.addQuestion(TestId, question);
		
		return question;
		
	}
@DeleteMapping("/remove/{{TestId}}")
	public Questions removeQuestion(@PathVariable int TestId,@RequestBody Questions question)
	{
		
		service.deleteQuestion(TestId, question);
		return question;
		
	}
	
	
}
