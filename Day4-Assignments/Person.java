import java.util.Date;

public abstract class Person {
	private String name;
	private Date dob;
	private String gender;
	private String phone;
	private Address address;
	
	public Person(String name, Date dob, String gender, String phone,Address address){
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public abstract void testDisplay();
	public abstract void testUpdate();
	
}
