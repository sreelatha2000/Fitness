package com.healthservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class ExceptionHandling {

	@ExceptionHandler(value = ResourceNotFoundException.class)
	public ResponseEntity<String> exception(ResourceNotFoundException exception) {
		log.error("ResourceNotFoundException-" + exception.getMessage(), exception);
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = IllegalArgumentException.class)
	public ResponseEntity<String> exception(IllegalArgumentException exception) {
		log.error("IllegalArgumentException-" + exception.getMessage(), exception);
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<String> exception(Exception exception) {
		log.error("IllegalArgumentException-" + exception.getMessage(), exception);
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
