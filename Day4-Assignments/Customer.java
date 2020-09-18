import java.util.Date;

public class Customer extends Person{
	private long custId;
	private String custCategory;
	private Account account;
	
	public Customer(String name, Date dob, String gender, String phone,Address address,long custId, String custCategory, Account account){
		super(name, dob,  gender, phone, address);
		this.custId = custId;
		this.custCategory = custCategory;
		this.account = account;
	}

	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getCustCategory() {
		return custCategory;
	}
	public void setCustCategory(String custCategory) {
		this.custCategory = custCategory;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public void testDisplay() {
		System.out.println("Name = "+this.getName()+" dob = "+this.getDob()+" Gender = "+this.getGender()+" phone = "+this.getPhone()+" City = "+this.getAddress().getCity()+" State = "+this.getAddress().getState()+" pin = "+this.getAddress().getPin());
		System.out.println("Customer Id = "+this.getCustId()+" Customer Category = "+this.getCustCategory()+" Account Number = "+account.getAccountNumber()+" Balance = "+account.getBalance());
	}

	@Override
	public void testUpdate() {
	}
	
}
