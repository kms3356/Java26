package account;

import java.util.Arrays;

public class AccountMemDao implements AccountDao{
	public static int noSeq = 111111;
	private Account[] accountDB = new Account[100];
	private int numAccount;
	
	// 계좌등록
	public boolean insertAccount(String owner, String password, int balance) {
		int no = noSeq++;
		accountDB[numAccount++] = new Account(no, owner, password, balance);
		return true;
	}
	
	// 계좌조회 (계좌 리스트를 return)
	public Account[] selectAll() {
		Account[] accountList = new Account[numAccount];
		for (int i = 0; i < numAccount; i++)
			accountList[i] = accountDB[i];
		return accountList;
 	}
	
	// 입금
	public boolean deposit(int accountNo, int amount) {
		Account ac = selectByNo(accountNo);
		if (ac != null) {
			ac.setBalance(ac.getBalance() + amount);
			return true;
		} else {
			return false;
		}
		
	}
	
	// 출금
	public boolean withdraw(int accountNo, int amount, String password) {
		Account ac = selectByNo(accountNo);
		if (ac != null) {
			if (password.equals(ac.getPassword())) {
				// 출금
				if (amount <= ac.getBalance()) {
					ac.setBalance(ac.getBalance() - amount);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Account selectByNo(int accountNo) {
		for (int i = 0; i < numAccount; i++) {
			if (accountNo == accountDB[i].getNo()) {
				// 입금처리
				return accountDB[i];
			}
		}
		return null;
	}

	@Override
	public Account[] selectByOwner(String owner) {
		Account[] acList = new Account[10];
		int count = 0;
		for (int i = 0; i < numAccount; i++) {
			if (owner.equals(accountDB[i].getOwner())) {
				acList[count++] = accountDB[i];
			}
		}
		return Arrays.copyOf(acList, count);
	}
}