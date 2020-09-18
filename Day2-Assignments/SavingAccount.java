class SavingAccount{
	double accountNo;
	String name;
	double balance;
	String ifsc;
	String state;
	String city;
	double pin;
	
	public SavingAccount(double accountNo,String name,String state,String city,double pin){
		this.accountNo = accountNo;
		this.name = name;
		this.state = state;
		this.city = city;
		this.pin = pin;
		this.balance = 0.0;
		this.ifsc = "HSBC001";
	}
	public SavingAccount(double accountNo,String name,double balance, String state,String city,double pin){
		this.accountNo = accountNo;
		this.name = name;
		this.state = state;
		this.city = city;
		this.pin = pin;
		this.balance = balance;
		this.ifsc = "HSBC001";
	}
	
	public double getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(double accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; 
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPin() {
		return pin;
	}
	public void setPin(double pin) {
		this.pin = pin;
	}
	
	public void deposit(double amount){
		this.balance += amount;
	}
	public void withdraw(double amount){
		if(this.balance > amount){	//minimum balance to be kept is 0
			this.balance -= amount;
		}
		else{
			System.out.println("Withdrawal amount exceeded account balance");
		}	
	}
	public void display(){
		System.out.println("Name: "+this.name+"\n"+"State: "+this.state+"\n"+"City: "+this.city+"\n"+"Pincode: "+this.pin+"\n"+"Account No: "+this.accountNo+"\n"+"Balance: "+this.balance+"\n"+"ifsc: "+this.ifsc+"\n");
	}
}
