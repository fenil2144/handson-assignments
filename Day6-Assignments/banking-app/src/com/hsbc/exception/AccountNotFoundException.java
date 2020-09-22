package com.hsbc.exception;

// Add constructors inside AccountNotFoundException
public class AccountNotFoundException extends Exception {
	public AccountNotFoundException() {
		super("Account Not Found");
	}
	public AccountNotFoundException(String m) {
		super(m);
	}
}
