import java.util.Date;

public abstract class Employee extends Person{
	private long empId;
	private double salary;
	private Account account;
	
	public Employee(String name, Date dob, String gender, String phone,Address address,long empId, double salary, Account account){
		super(name, dob,  gender, phone, address);
		this.empId = empId;
		this.salary = salary;
		this.account = account;
	}

	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}

	public void updateSalary(){
		this.salary += (this.salary * 0.1);
	}


	@Override
	public void testDisplay() {
		System.out.println("Name = "+this.getName()+" dob = "+this.getDob()+" Gender = "+this.getGender()+" phone = "+this.getPhone()+" City = "+this.getAddress().getCity()+" State = "+this.getAddress().getState()+" pin = "+this.getAddress().getPin());
		System.out.println("EmployeeId ="+this.getEmpId()+" Salary = "+this.getSalary()+" Account Number = "+account.getAccountNumber()+" Balance = "+account.getBalance());
	}
	
	@Override
	public void testUpdate() {
		this.updateSalary();
	}

}
