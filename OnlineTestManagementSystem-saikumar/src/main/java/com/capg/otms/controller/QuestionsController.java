package com.capg.otms.controller;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capg.otms.entity.Questions;
import com.capg.otms.service.OtmsServiceImp;
@RestController
@RequestMapping("/Questions")
@CrossOrigin("http://localhost:4200")
public class QuestionsController {

	@Autowired
	OtmsServiceImp service;
	 //http://localhost:8082/test/create
	// POSTMAN (Post : body{ "QuestionTtitle": "JAVA", "QuestionOption": "["0","1","2","3"]", "QuestionAnswer": "1", "chosenAnswer": "2",QuestionMarks":"5", "MarksScored":"70",}
	//dont insert id ,  id is  :@GeneratedValue(strategy = GenerationType.SEQUENCE)

	
	
	/**
	 * 
	 * @author saikumar: this create question will add a question in to the database
	 * 
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/create")
	
	public Questions createQuestion(@RequestBody Questions question)
	{

		Questions questions = service.addQuestion(question);
		return questions;
		/*
		 * ResponseEntity<Questions>
		 * if(q!=null) { return new ResponseEntity(q, HttpStatus.OK); } return new
		 * ResponseEntity(q, HttpStatus.NOT_FOUND);
		 */

	}


/**
 * 
 * @author saikumar: this delete qyestionbyId will delete the details of Question present list
 */


@DeleteMapping("/remove/{questionId}")
	public void removeQuestion(@PathVariable("questionId")int questionId)
	{
	
	//ResponseEntity<Boolean>
		
		 
		/*
		 * if(service.findById(questionId)!=null) {
		 * 
		 * ResponseEntity<Boolean> responseEntity= new ResponseEntity(true,
		 * HttpStatus.OK); 
		 * 
		 * 
		 * } ResponseEntity<Boolean> responseEntity= new ResponseEntity(false,
		 * HttpStatus.BAD_REQUEST);
		 */
		 // System.out.println("response entity="+responseEntity); 
	System.out.println(questionId);
		  service.deleteQuestion(questionId);
		 // return "deleted";
		  
		 
			 
				
	}
	
/**
 * author saikumar:this method will retrieve the details of the added questions
 */
	



@GetMapping("/findAll")
public ResponseEntity<List<Questions>> getAllQuestions()
{
	List<Questions> queries=service.getAllQuestions();
	return new ResponseEntity<List<Questions>>(queries, new HttpHeaders(),HttpStatus.OK);
}

}
