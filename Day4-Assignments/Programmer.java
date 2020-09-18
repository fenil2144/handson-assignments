import java.util.Date;

public class Programmer extends Employee{
	private long programmerRank;
	private String technology;
	
	public Programmer(String name, Date dob, String gender, String phone,Address address,long empId, double salary, Account account, long programmerRank, String technology){
		super(name, dob,  gender, phone, address, empId,salary,account);
		this.programmerRank = programmerRank;
		this.technology = technology;
	}

	public long getProgrammerRank() {
		return programmerRank;
	}
	public void setProgrammerRank(long programmerRank) {
		this.programmerRank = programmerRank;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}

	@Override
	public void testDisplay() {
		super.testDisplay();
		System.out.println("ProgrammerRank = "+this.getProgrammerRank()+" Technology = "+this.getTechnology());
	}
	
	@Override
	public void testUpdate() {
		super.updateSalary();
	}
}
