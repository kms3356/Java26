package account;

public class Account {
	private int no;
	
	private int balance;
	private String owner;
	private String password;
	
	Account(int no, String owner, String password, int balance) {
		this.no = no;
		this.owner = owner;
		this.password = password;
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Account [no=" + no + ", balance=" + balance + ", owner=" + owner + ", password=" + password + "]";
	}
}