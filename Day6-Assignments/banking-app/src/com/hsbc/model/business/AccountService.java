package com.hsbc.model.business;

import com.hsbc.exception.*;
import com.hsbc.model.beans.Account;

public interface AccountService {
	public Account createAccount(Account account); 
	public Account[] getAllAccounts();
	public Account getAccountById(int accountNumber) throws AccountNotFoundException;
	
	// use throws InsufficientBalanceException, AccountNotFoundException
	public void transfer(int from, int to, double amount) throws AccountNotFoundException,InsufficientBalanceException;
}
