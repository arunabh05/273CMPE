package package1;

public class BankCustomer {

	private String name;
	private int accNo;
	private String accType;
	private String phone;
	private int balance;
	public BankCustomer(String name, int accNo, String accType, String phone, int balance) {
		super();
		this.name = name;
		this.accNo = accNo;
		this.accType = accType;
		this.phone = phone;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccNo() {
		return accNo;
	}
	public String getAccType() {
		return accType;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
