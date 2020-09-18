import java.util.Date;

public class Manager extends Employee{
	
	private int employeeCount;
	
	public Manager(String name, Date dob, String gender, String phone,Address address, long empId, double salary, Account account,int employeeCount){
		super(name, dob,  gender, phone, address, empId,salary,account);
		this.employeeCount = employeeCount;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}


	@Override
	public void testDisplay() {
		super.testDisplay();
		System.out.println(" EmployeeCount = "+this.getEmployeeCount());
	}
	
	@Override
	public void testUpdate() {
		super.updateSalary();
	}
}
