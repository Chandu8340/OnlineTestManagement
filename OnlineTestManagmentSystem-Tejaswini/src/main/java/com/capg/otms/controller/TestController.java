package com.capg.otms.controller;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

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

import com.capg.otms.entity.TestBean;
import com.capg.otms.service.TestServiceImpl;



@RestController
@RequestMapping (value="/test")
@CrossOrigin("http://localhost:4200")
public class TestController{
	
	@Autowired
	private TestServiceImpl testserviceimpl;
	
	@PostMapping(value="/create")
	public ResponseEntity<Boolean> createTest(@RequestBody TestBean bean) {
	 testserviceimpl.createTest(bean);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
	}
			
	@GetMapping(path="/getdetails/{testId}")
	public ResponseEntity<TestBean> findTestById(@PathVariable("testId") int testId) throws Exception {
		TestBean bean=testserviceimpl.findTestById(testId);
		if (bean == null) {
            throw new Exception("test not found for id=" + testId);
        }
		return new ResponseEntity<TestBean>(bean,new HttpHeaders(),HttpStatus.OK);
	}
	
	@GetMapping(path="/getAll")
	public  ResponseEntity<List<TestBean>> findAll(){
		List<TestBean> list=testserviceimpl.findAllTests();
		return new ResponseEntity<List<TestBean>>(list,new HttpHeaders(),HttpStatus.OK);
	}

	@PutMapping("/update")
	
		public ResponseEntity<TestBean> updateTest(@RequestBody TestBean bean){
			bean=testserviceimpl.updateTest(bean);
			return new ResponseEntity<TestBean>(bean,new HttpHeaders(),HttpStatus.OK);
		}
	@PutMapping("/assign/{testId}")
	public ResponseEntity assignTest(@PathVariable long testId){
		boolean status = testserviceimpl.assignTest(testId);
		if(status) {
			return new ResponseEntity(HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(Exception.class)
	public String inValid(Exception e) {
		return e.getMessage();
	}
}
