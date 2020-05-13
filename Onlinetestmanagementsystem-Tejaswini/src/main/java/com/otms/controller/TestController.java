package com.otms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.otms.entity.TestBean;
import com.otms.service.ITestService;

@RestController
@RequestMapping(value="Test")
@CrossOrigin("http://localhost:4200")
public class TestController {
	@Autowired
	private ITestService Service;
	
	/*
	 * @author Tejaswini : create Test will insert the parameters into entity of TestBean*/
	@PostMapping(path="/add") //PostMan: post
		public ResponseEntity<Boolean> CreateTest(@Valid @RequestBody TestBean bean) {
		Service.CreateTest(bean);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
	}
	/*
	 * @author Tejaswini : findTestById retrieve the details of particular id*/
	@GetMapping(path="/getdetails/{testId}")  //Postman:Get
	public ResponseEntity<TestBean> findTestById(@PathVariable("testId") int testId) throws Exception {
		TestBean bean=Service.findTestById(testId);
		if (bean == null) {
          throw new Exception("test not found for id=" + testId);
        }
		return new ResponseEntity<TestBean>(bean,new HttpHeaders(),HttpStatus.OK);
	}
	/*
	 * @author Tejaswini :getAll method will retrieve all details in entity TestBean*/
	@GetMapping(path="/getAll")   //postman:Get
	public  ResponseEntity<List<TestBean>> findAll(){
		List<TestBean> list=Service.findAllTests();
		return new ResponseEntity<List<TestBean>>(list,new HttpHeaders(),HttpStatus.OK);
	}
	/*
	 *@author Tejaswini : update method will update the parameters of particular id */
	@PutMapping(path="/update")			//postman:Put
	public ResponseEntity<TestBean> updateTest(@RequestBody TestBean bean){
		bean=Service.updateTest(bean);
		return new ResponseEntity<TestBean>(bean,new HttpHeaders(),HttpStatus.OK);
	}
	/*Exception handling*/
	@ExceptionHandler(Exception.class)
	public String inValid(Exception e) {
		return e.getMessage();
	}

}
