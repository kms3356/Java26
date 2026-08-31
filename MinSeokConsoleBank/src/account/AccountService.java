package account;

import java.util.List;

public class AccountService {
	public static int noSeq = 111111;
	private AccountDao accountDao;
	
	public AccountService(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public boolean createAccount(String owner, String password, int amount) {
		Account ac = new Account(noSeq++, owner, password, amount);
		return accountDao.insertAccount(ac);
	}
	
	public List<Account> getAllAccounts() {
		return accountDao.selectAll();
	}
	
	public List<Account> getMembersAccounts() {
		return null;
	}
	
	public boolean deposit(int accountNo, int amount) throws NoAccountException {
		Account ac = accountDao.selectByNo(accountNo);
		if (ac != null) {
			ac.setBalance(ac.getBalance() + amount);
			accountDao.updateAccount(ac);
			return true;
		}
		throw new NoAccountException(accountNo);
	}
	
	public boolean withdraw(int accountNo, int amount, String password) throws NoAccountException {
		Account ac = accountDao.selectByNo(accountNo);
		if (ac != null) {
			if (password.equals(ac.getPassword())) {
				if (amount >= ac.getBalance()) {
					ac.setBalance(ac.getBalance() - amount);
					accountDao.updateAccount(ac);
					return true;
				}
			}
			return false;
		}
		throw new NoAccountException(accountNo);
	}
	
	public boolean deleteAccount(int accountNo, String password) {
		return true;
	}
}
