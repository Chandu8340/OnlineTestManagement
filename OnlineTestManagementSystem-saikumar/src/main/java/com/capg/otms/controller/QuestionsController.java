package com.capg.otms.controller;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@RestController
//@RequestMapping("/Questions")
@CrossOrigin("http://localhost:4200")
@Api(value="Online Test Management")
@RequestMapping("/api")

public class QuestionsController {
	
	Logger log=LoggerFactory.getLogger(QuestionsController.class);

	@Autowired
	OtmsServiceImp service;
	

	/* @Autowired RestTemplate resttemplate; */
	
	 //http://localhost:8082/test/create
	// POSTMAN (Post : body{ "QuestionTtitle": "JAVA", "QuestionOption": "["0","1","2","3"]", "QuestionAnswer": "1", "chosenAnswer": "2",QuestionMarks":"5", "MarksScored":"70",}
	//dont insert id ,  id is  :@GeneratedValue(strategy = GenerationType.SEQUENCE)

	
	
	/**
	 * 
	 * @author saikumar: this create question will add a question in to the database
	 * 
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/create")
	
	public Questions createQuestion(@ApiParam(value="Questions  in JSON Format")@RequestBody Questions question)
	{
		Questions questions = service.addQuestion(question);

		return questions;
		

	}
	
	@ApiResponses(value= {
			@ApiResponse(code = 200, message = "Successfull"),
		    @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
		    @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
		    @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
	
	
	
	
	
	

/**
 * 
 * @author saikumar: this delete qyestionbyId will delete the details of Question present list
 */


@DeleteMapping("/{questionId}")
@ApiOperation(value = "Delete a question")
	public Boolean removeQuestion(@PathVariable("questionId")int questionId)
	{
		service.deleteQuestion(questionId);
		int p=service.hereWeAre();
		
		if(p==400)
		{

			System.out.println("in side else");
			return false;
		}
		else 
		{
			
			return true;
		}
	
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
	//OtmsServiceImp serv = new OtmsServiceImp();
	//System.out.println("controller "+questionId);
	
	
		 
		 
			 
				
	}
	
/**
 * author saikumar:this method will retrieve the details of the added questions
 */
	


@HystrixCommand(fallbackMethod="whengetnotworks")
@GetMapping("/findAll")
public ResponseEntity<List<Questions>> getAllQuestions()

{
	List<Questions> queries=service.getAllQuestions();

	return new ResponseEntity<List<Questions>>(queries, new HttpHeaders(),HttpStatus.OK);
}
public ResponseEntity<List<Questions>> whengetnotworks()
{
	return null;
}

}
