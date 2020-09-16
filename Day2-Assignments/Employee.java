class Employee{
	int id;
	String empName;
	double salary;
	Address address;
	
	public Employee(int id, String empName, double salary){
		this.id = id;
		this.empName = empName;
		this.salary = salary;
	}
	public Employee(int id, String empName, double salary, Address address ){
		this.id = id;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}
	public void display(){
		if(this.salary>50000){
			System.out.println("id: "+this.id+"  Name: "+this.empName+"  Salary: "+this.salary+"  State: "+address.state+"  City: "+address.city+"  Pin: "+address.pin);
	          }
	}
}