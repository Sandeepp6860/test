package com.interview.question.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interview.question.test.entity.ResultDto;
import com.interview.question.test.service.TestService;

@RestController
public class TestController {
   
	
	@Autowired
	private TestService testService;
	
	@GetMapping("/getData")
	public ResponseEntity<List<ResultDto>> getData(){
		 List<ResultDto> data = testService.getData();
		return ResponseEntity.status(HttpStatus.OK).body(data);
	}
} 
