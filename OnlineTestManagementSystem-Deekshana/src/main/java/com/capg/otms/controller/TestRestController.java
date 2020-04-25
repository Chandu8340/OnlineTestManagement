package com.capg.otms.controller;


import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.beans.factory.annotation.Autowired;
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
@RestController
@RequestMapping({"/test"})
public class TestRestController {
	@Autowired
	TestServiceImpl testserviceimpl;
	 //http://localhost:8090/test/create
		// POSTMAN (Post : body{ "testTitle": "JAVA", " testDuration": "2 hours 30 mins", " testQuestions": "9", "testTotalMarks":"100", "testMarksScored":"70", "startTime":"3:30","endTime":6:00}
		//dont insert id ,  id is  :@GeneratedValue(strategy = GenerationType.SEQUENCE)

	@PostMapping("/create")
	public String createTest(@RequestBody TestBean bean)
	{
		TestBean testbean=testserviceimpl.addTest(bean);
		return testbean.getTestTitle() +  " has been added" + "  with test id " +  testbean.getTestId();
  
	
		}
		

	@DeleteMapping("/removeById/{testId}")
	public String deletetestById(@PathVariable int testId)
	{
		testserviceimpl.removeTest(testId);
		
		return "your test is deleted successfully";
	}
	@GetMapping("/findall")
	public List<TestBean> getalltests(){
		List<TestBean> bean=testserviceimpl.getAllTests();
		return bean;
	}
	
  @ExceptionHandler(Exception.class)
  public String inValid(Exception e) {
	  return e.getMessage();
  }
  
  }
