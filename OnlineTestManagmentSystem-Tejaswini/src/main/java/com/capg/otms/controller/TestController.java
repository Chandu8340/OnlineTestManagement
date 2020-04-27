package com.capg.otms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
public class TestController{
	
	@Autowired
	TestServiceImpl testserviceimpl;

	@PostMapping(path="/create")
	public ResponseEntity<Boolean> CreateTest(@RequestBody TestBean test) {
		testserviceimpl.CreateTest(test);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
	}
	@GetMapping(path="/getdetails/{testId}")
	public ResponseEntity<TestBean> findTestById(@PathVariable("testId") int testId) {
		TestBean test=testserviceimpl.findTestById(testId);
		//if (test == null) {
            //throw new TestNotFoundException("test not found for id=" + testId);
        //}
		return new ResponseEntity<TestBean>(test,new HttpHeaders(),HttpStatus.OK);
	}

	@PutMapping("/update/{test}")
	
		public ResponseEntity<TestBean> updateTest(@RequestBody TestBean test){
			test=testserviceimpl.updateTest(test);
			return new ResponseEntity<TestBean>(test,new HttpHeaders(),HttpStatus.OK);
		}
}
