package com.hsbc.exception;

public class UserNotFoundException extends Exception{
	public UserNotFoundException() {
		super("User Not Found");
	}
	public UserNotFoundException(String m) {
		super(m);
	}
}
