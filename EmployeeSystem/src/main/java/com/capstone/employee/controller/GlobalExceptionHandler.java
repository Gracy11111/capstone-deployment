package com.capstone.employee.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.capstone.employee.exception.EmployeeIdException;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(EmployeeIdException.class)
	  public ResponseEntity<String> handleEmployeeIDException(EmployeeIdException ex) {
	    return new ResponseEntity<String>("Invalid Employee ID", HttpStatus.BAD_REQUEST);
	  }
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> exceptionHandler(Exception ex){
		return new ResponseEntity<String>(ex.getMessage().toString(),HttpStatus.EXPECTATION_FAILED);
	}
}
