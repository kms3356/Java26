package account;

public interface AccountDao {
	public boolean insertAccount(String owner, String password, int balance);
	public Account[] selectAll();
	public boolean deposit(int accountNo, int amount);
	public boolean withdraw(int accountNo, int amount, String password);
	public Account selectByNo(int accountNo);
	public Account[] selectByOwner(String owner);
}
