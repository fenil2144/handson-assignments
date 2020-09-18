import java.util.Date;

public class Admin extends Employee{
	
	private String username;
	private String password;
	private boolean hasFullRights;
	private String serverName;

	
	public Admin(String name, Date dob, String gender, String phone,Address address,String username, String password, boolean hasFullRights,long empId, double salary, Account account, String serverName){
		super(name, dob,  gender, phone, address,empId,salary,account);
		this.username = username;
		this.password = password;
		this.hasFullRights = hasFullRights;
		this.serverName = serverName;

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isHasFullRights() {
		return hasFullRights;
	}

	public void setHasFullRights(boolean hasFullRights) {
		this.hasFullRights = hasFullRights;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	@Override
	public void testDisplay() {
		super.testDisplay();
		System.out.println("Username = "+this.getUsername()+" Password = "+this.getPassword()+" HasFullRights = "+this.hasFullRights+" Servername = "+this.getServerName());
	}

	@Override
	public void testUpdate() {
		super.updateSalary();
	}

}
