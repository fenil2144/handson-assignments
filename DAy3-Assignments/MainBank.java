public class MainBank {
    public static void main(String[] args) {

//Assignment1

//	long accountNo  = Long.parseLong(args[0]);
//	double amount = Double.parseDouble(args[1]);
//	Account ac = MainBank.getAccount(accountNo);
//	if(ac != null){
//		ac.accountInformation();
//		ac.deposit(amount );
//		ac.accountInformation();
//	}
//	else{
//		System.out.println("Account Can't be found");
//	}
//
//    }


	long accountNo1 = Long.parseLong(args[0]);
	long accountNo2= Long.parseLong(args[2]);
	double amount = Double.parseDouble(args[1]);
	Account ac1 = MainBank.getAccount(accountNo1);
	Account ac2 = MainBank.getAccount(accountNo2);
	if(ac1 != null && ac2 != null) {
		if(ac1.getBalance() >= amount) {
			ac1.withdraw(amount);
			ac2.deposit(amount);
			System.out.println("Amount Transferred");
			ac1.accountInformation();
			ac2.accountInformation();
		}
		else
			System.out.println("Insufficient Balance");
	}
	else
		System.out.println("Account Number Invalid");
	
    }

    public static Account getAccount(long accountNo) {
	        Account account = null;
        Account[] accounts = AccountsDB.getAccounts();
	for(Account a : accounts){
		if(a.getAccountNumber() == accountNo)
			account = a;
		}

        // get the account from accounts using the accountNo

        return account;
    }
}