class Bank{
	public static void main(String args[]){
	SavingAccount a1 = new SavingAccount(12345678,"Fenil Shah","Gujarat", "Ahmedabad",380001);
	SavingAccount a2 = new SavingAccount(87654321,"Harsh Shah",10000,"maharashtra", "mumbai",486342);
	SavingAccount a3 = new SavingAccount(88763732,"Ninad patel",50000,"karnataka", "bengalaru",453432);
	SavingAccount a4 = new SavingAccount(67373778,"Khusboo variya","Gujarat", "Rajkot",380021);
	SavingAccount a5 = new SavingAccount(25454321,"Varun sharma", 1000,"maharashtra", "pune",214512);

	a1.display();
	a1.deposit(20000);
	a1.display();
	a2.withdraw(5000);
	a2.display();
	a3.deposit(12000);
	a3.display();
	a4.withdraw(5000);
	a4.display();
	a5.deposit(1000);
	a5.display();
	}
}