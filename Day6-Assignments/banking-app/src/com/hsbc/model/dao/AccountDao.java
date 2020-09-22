package com.hsbc.model.dao;

import com.hsbc.exception.AccountNotFoundException;
import com.hsbc.model.beans.Account;

public interface AccountDao {
	public Account store(Account account);
	public Account[] fetchAccouts();
	public Account fetchAccountById(int accountNumber) throws AccountNotFoundException;
	public Account updateAccount(int accountNumber, Account account) throws AccountNotFoundException;
}
