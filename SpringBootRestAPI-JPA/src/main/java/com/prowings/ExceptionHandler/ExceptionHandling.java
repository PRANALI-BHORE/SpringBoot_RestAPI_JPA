package com.prowings.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class ExceptionHandling {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> exHandling(Exception e) {
		return new ResponseEntity<String>("Something went wrong!!! \n Please check the code!!!", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}