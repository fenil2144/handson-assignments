class EmployeeMain{
	public static void main(String args[]){
		Address a1 = new Address("Gujarat","Ahmedabad",380001);
		Address a2 = new Address("Maharashtra","Mumbai",453423);
		Employee[] employee = new Employee[5];
		employee[0] = new Employee(1,"Fenil Shah",10000,a1);
		employee[1] = new Employee(2,"Darsh patel",50000,a2);
		employee[2] = new Employee(3,"krushnapal parikh",100000,a1);
		employee[3] = new Employee(4,"smriti hirani",25000,a2);
		employee[4] = new Employee(5,"harsh kanunga",65000,a1);
		for(Employee e : employee ){
			e.display();
		}
	}
}