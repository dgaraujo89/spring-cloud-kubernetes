package com.github.diegogomesaraujo.exceptions;

import lombok.Data;

@Data
public class ErrorResponse {

	private Integer code;
	private String error;
	private String message;
	
}
