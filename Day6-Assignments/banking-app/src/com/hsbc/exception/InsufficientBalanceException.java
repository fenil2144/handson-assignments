package com.hsbc.exception;

public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException() {
		super("Insufficient Account Balance");
	}
	public InsufficientBalanceException(String m) {
		super(m);
	}
}
