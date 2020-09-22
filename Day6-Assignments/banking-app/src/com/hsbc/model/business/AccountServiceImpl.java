package com.hsbc.model.business;

import com.hsbc.exception.AccountNotFoundException;
import com.hsbc.exception.InsufficientBalanceException;
import com.hsbc.model.beans.Account;
import com.hsbc.model.dao.AccountDao;
import com.hsbc.model.utility.AccountFactory;
import com.hsbc.model.utility.Type;

public class AccountServiceImpl implements AccountService{
	
	private AccountDao accountDao;

	public AccountServiceImpl() {
		super();
		accountDao = (AccountDao) AccountFactory.getInstance(Type.DAO);
	}

	@Override
	public Account createAccount(Account account) {
		return accountDao.store(account);
	}

	@Override
	public Account getAccountById(int accountNumber) throws AccountNotFoundException {
		return accountDao.fetchAccountById(accountNumber);
	}

	@Override
	public void transfer(int from, int to, double amount)
			throws AccountNotFoundException, InsufficientBalanceException {
		Account debitorAccount = accountDao.fetchAccountById(from);
		Account creditorAccount = accountDao.fetchAccountById(to);
		
		if(debitorAccount.getBalance() > amount){
			debitorAccount.setBalance(debitorAccount.getBalance() - amount);
			creditorAccount.setBalance(creditorAccount.getBalance() + amount);
			accountDao.updateAccount(debitorAccount.getAccountNumber(), debitorAccount);
			accountDao.updateAccount(creditorAccount.getAccountNumber(), creditorAccount);
		}
		else
			throw new InsufficientBalanceException();
		
	}

	@Override
	public Account[] getAllAccounts() {
		return accountDao.fetchAccounts();
	}

}
