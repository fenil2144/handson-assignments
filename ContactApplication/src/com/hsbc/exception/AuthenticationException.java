package com.hsbc.exception;

public class AuthenticationException extends  Exception{

	public AuthenticationException(String message) {
		super(message);
	}

	public AuthenticationException() {
		super("Authentication Failed");
	}

	
}
