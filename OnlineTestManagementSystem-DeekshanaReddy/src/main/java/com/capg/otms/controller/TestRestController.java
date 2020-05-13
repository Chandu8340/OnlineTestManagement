package com.capg.otms.controller;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.otms.entity.TestBean;
import com.capg.otms.service.TestServiceImpl;
@CrossOrigin(origins = "http://localhost:4200")

//This @CrossOrigin will help to connect with the angular with the help of above url
@RestController
@RequestMapping("/test")
public class TestRestController {
	@Autowired 
	
	// autowire attribute reduces configuration.
	
	TestServiceImpl testserviceimpl;
	 //http://localhost:8090/test/create
		// POSTMAN (Post : body{ "testTitle": "JAVA", " testDuration": "2 hours 30 mins","testTotalMarks":"100","testQuestion1":"What is final?",
	//"testQuestion2":"What is Inheritance?","testQuestion3":"What is Static?""testMarksScored":"70", "startTime":"3:30","endTime":"6:00"}
		//dont insert id ,  id is  :@GeneratedValue(strategy = GenerationType.SEQUENCE)

	@PostMapping("/create")    //postman :POST
	/**
	 * *
	 * @author Deekshana : This createTest method will insert details into the entity 
	 * 
	 */
	public ResponseEntity<Boolean>createTest(@Valid @RequestBody TestBean bean)
	{
		TestBean testbean=testserviceimpl.addTest(bean);
		ResponseEntity<Boolean> responseEntity=new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity="+responseEntity);
		return responseEntity;
				
				 // testbean.getTestTitle() +  " has been added with test id " +  testbean.getTestId() + "\nTestQuestions:"+testbean.getTestQuestion1()+
				
				// "\nTestQuestions:"+testbean.getTestQuestion2()+ "\nTestQuestions:"+testbean.getTestQuestion3() +
				//"\nTestTotalMarks:"+testbean.getTestTotalMarks() + "\nTestMarksScored: "+ testbean.getTestMarksScored()
				// +"\nStartTime:"+ testbean.getStartTime()+"\n EndTime:"+testbean.getEndTime(); 
		
		}
		/**
		 * 
		 * @author deekshana: this deletetestById will delete the details of test present in particular id
		 * 
		 */

	@DeleteMapping("/removeById/{testId}")      //postman :DELETE
	public 	ResponseEntity<String> deletetestById(@PathVariable int testId)
	{try {
		testserviceimpl.removeTest(testId);
		ResponseEntity<String> responseEntity= new ResponseEntity(true, HttpStatus.OK);
	  System.out.println("response entity="+responseEntity);
	return 	responseEntity;
	}
	catch(Exception e) {
	
		return new ResponseEntity <String>("Id does not exists",HttpStatus.BAD_REQUEST);
	}
	}
	
	
	/**
	 * @author deeekshana: this List method will retrive the details of tests
	 * 
	 */
	
	
	@GetMapping("/findall") 
	//postman :GET
	public ResponseEntity< List<TestBean>> getalltests(){
		List<TestBean> bean=testserviceimpl.getAllTests();
		return new ResponseEntity<List<TestBean>>(bean, new HttpHeaders(),HttpStatus.OK);
	}
	
  @ExceptionHandler(Exception.class)
  public String inValid(Exception e) {
	  return e.getMessage();
  }
  
  }
