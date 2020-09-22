package com.hsbc.controller;

import java.util.Scanner;

import com.hsbc.exception.AccountNotFoundException;
import com.hsbc.exception.InsufficientBalanceException;
import com.hsbc.model.beans.Account;
import com.hsbc.model.business.AccountService;
import com.hsbc.model.utility.AccountFactory;
import com.hsbc.model.utility.Type;

public class MainViewBankingController {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		// This is getting service object
		AccountService service = (AccountService) AccountFactory.getInstance(Type.SERVICE);
		int option = 0;
		do {
			System.out.println("*****************************************************************************************");
			System.out.println("1: Store 2: Fetch All Accounts 3: Find Account by Account number  4:Transfer Amount 5: Exit");
			System.out.println("*****************************************************************************************");
			option = scanner.nextInt();
			switch(option) {
			case 1: 
				Account account = new Account();
				
				System.out.println("Enter name");		
				account.setCustomerName(scanner.next());
				
				System.out.println("Enter amount deposited at time of account opening.");	
				account.setBalance(scanner.nextDouble());
				
				System.out.println("Enter Contact no");	
				account.setContactNumber(scanner.nextLong());
				
				Account createdAccount = service.createAccount(account);
				System.out.println(createdAccount);
				break;
				
			case 2: 
				Account[] accounts = service.getAllAccounts();
				for(Account temp : accounts) {
					if(temp!=null)
					System.out.println(temp);
				}
				break;
			case 3:
				try{
					System.out.println("Enter Account Id");
					Account account1 = service.getAccountById(scanner.nextInt());
					System.out.println(account1);
				}
				catch(AccountNotFoundException e){
					System.err.print(e.getMessage());
				}
				break;
			case 4:
				try{
					System.out.println("Enter Depositor Account Id");
					int depositorAccount = scanner.nextInt();
					
					System.out.println("Enter Creditor Account Id");
					int creditorAccount = scanner.nextInt();
										
					System.out.println("Enter the amount to be transferred");	
					double amount = scanner.nextDouble();
					
					service.transfer(depositorAccount, creditorAccount, amount);
					
					System.out.println("Transferred Successfully!");
				}
				catch(AccountNotFoundException e){
					System.err.print(e.getMessage());
				} catch (InsufficientBalanceException e) {
					System.err.print(e.getMessage());
				}
				break;
				
			}
		} while(option != 5);
		
		scanner.close();
	}

}
