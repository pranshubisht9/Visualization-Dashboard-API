package com.blackcoffer.visualdashboardapp.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice // AOP Aspect Oriented Programming
public class GlobalDataExceptionHandler {


	// Handler for any other Exception

	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorData> genericExceptionHandler4(Exception ae, WebRequest req) {

		MyErrorData err = new MyErrorData();

		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ae.getMessage());
		err.setDetails(req.getDescription(false));

		return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);

	}

	// No Handler Found Exception

	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorData> myexpHandler5(NoHandlerFoundException ae, WebRequest req) {

		MyErrorData err = new MyErrorData();

		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ae.getMessage());
		err.setDetails(req.getDescription(false));

		return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);

	}

	//Handler for Method Argument not valid Exception

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorData> myMANVExceptionHandler6(MethodArgumentNotValidException me) {

		MyErrorData err = new MyErrorData();

		err.setTimestamp(LocalDateTime.now());
		err.setDetails("Validation Error");
		err.setMessage(me.getBindingResult().getFieldError().getDefaultMessage());

		return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);

	}

}
