class SavingsAccount extends Account { 
    String ifscCode;
    
    SavingsAccount(long accountNumber, double balance, String ifscCode) {
        super(accountNumber, balance);// Account(long, double)
        // this.accountNumber = accountNumber;
        // this.balance = balance;
        this.ifscCode = ifscCode;
        //System.out.println("SavingsAccount(long, double, String) intialized");
    }

    void minimumBalance() {
        System.out.println("You must have minimum 5000Rs. balance");
    }
    void withdrawLimit() {
        System.out.println("Withdraw limit in Savings is 50000");
    }

    // method overloading
    //void deposit(double amount) { 	`
        // deposit to your account
   // } 
    //void deposit(double amount, long accountNumber) { 
     //  System.out.println("deposit(double, long) in SavingsAccount");
    //}

    public double withdraw(double amount) {
	double balance = this.getBalance();
    	if(balance -5000 >= amount && amount<=50000){
    		balance  -= amount;
		this.setBalance(balance);
    		System.out.println("withdraws amount from account");
    	}
    	else
    		System.out.println("withdrawl can't be done");
    	return balance;
    }

    // method Overriding
    @Override
    public void accountInformation() {
        super.accountInformation();
        //minimumBalance();
        //withdrawLimit();
    }
}