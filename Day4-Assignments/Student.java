import java.util.Date;

public class Student extends Person{
	
	private String standard;
	private long rollNumber;
	private double grade;
	
	public Student(String name, Date dob, String gender, String phone,Address address,long rollNumber, String standard,double grade){
		super(name, dob,  gender, phone, address);
		this.rollNumber = rollNumber;
		this.standard = standard;
		this.grade = grade;
	}

	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(long rollNumber) {
		this.rollNumber = rollNumber;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public void testDisplay() {
		System.out.println("Name = "+this.getName()+" dob = "+this.getDob()+" Gender = "+this.getGender()+" phone = "+this.getPhone()+" City = "+this.getAddress().getCity()+" State = "+this.getAddress().getState()+" pin = "+this.getAddress().getPin());
		System.out.println("RollNumber = "+this.getRollNumber()+" Standard = "+this.getStandard()+" Grade = "+this.getGrade());
	}

	@Override
	public void testUpdate() {
	}
	
}
