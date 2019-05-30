package com.github.diegogomesaraujo.exceptions;

import static org.springframework.http.HttpStatus.NOT_FOUND;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

	@ResponseBody
	@ResponseStatus(NOT_FOUND)
	@org.springframework.web.bind.annotation.ExceptionHandler(NotFoundException.class)
	public ErrorResponse invalidParamExceptionHandler(NotFoundException e) {
		ErrorResponse error = new ErrorResponse();
		error.setCode(NOT_FOUND.value());
		error.setError(NOT_FOUND.getReasonPhrase());
		error.setMessage(e.getMessage());
		
		return error;
	}
	
}
