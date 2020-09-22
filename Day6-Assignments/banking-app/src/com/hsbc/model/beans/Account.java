package com.hsbc.model.beans;

import java.util.Random;

public class Account {
	private int accountNumber;
	private String customerName;
	private double balance;
	private long contactNumber;
	
	
	public Account() {
		super();
		Random rand = new Random();
		this.accountNumber = rand.nextInt(10000);
	}


	public Account( String customerName, double balance, long contactNumber) {
		super();
		
		Random rand = new Random();
		this.accountNumber = rand.nextInt(10000);		//Generates Random Account number from 0 to 10,000
		this.customerName = customerName;
		this.balance = balance;
		this.contactNumber = contactNumber;
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}


	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", customerName=" + customerName + ", balance=" + balance
				+ ", contactNumber=" + contactNumber + "]";
	}
	
	
	
	
}
