package com.company.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
	protected Log log = LogFactory.getLog(this.getClass());
	
	@GetMapping(value = "/test-test",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}, params= {"name"} )
	public ResponseEntity<String> getText(String name) {
		
		String re=name;
		ResponseEntity<String> result = null;
		result=ResponseEntity.status(HttpStatus.OK).body(re);
		System.out.println(re);
		
		return result;
	}
	
	@GetMapping(value = "/test",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE} )
	public ResponseEntity<String> getText() {
		
		String re="success";
		ResponseEntity<String> result = null;
		result=ResponseEntity.status(HttpStatus.OK).body(re);
		System.out.println(re);
		
		return result;
	}
}
