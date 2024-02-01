package com.healthservice.exception;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException(String message)
	{
		super(message);
	}
	
	public ResourceNotFoundException(String message, Exception exception)
	{
		super(message,exception);
	}
	
}
