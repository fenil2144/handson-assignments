package com.hsbc.model.dao;

import com.hsbc.exception.AccountNotFoundException;
import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.beans.Account;
import com.hsbc.model.beans.User;

public class AccountDaoImpl implements AccountDao{
	
	// temporary database
	private static Account[] accountArray = new Account[10];
	
	private static int index = 0;

	@Override
	public Account store(Account account) {
		accountArray[index++] = account;
		return account;
	}

	@Override
	public Account[] fetchAccounts() {
		return accountArray;
	}

	@Override
	public Account fetchAccountById(int accountNumber) throws AccountNotFoundException {
		Account account = null;
		for(int i = 0; i< index; i++){
			if(accountArray[i].getAccountNumber() == accountNumber){
				account = accountArray[i];
				return account;
			}
		}
		throw new AccountNotFoundException();

	}

	@Override
	public Account updateAccount(int accountNumber, Account account) throws AccountNotFoundException {
		for(int i = 0; i< index; i++){
			if(accountArray[i].getAccountNumber() == accountNumber){
				accountArray[i] = account;
				return account;
			}
		}
		throw new AccountNotFoundException();
	}

}
