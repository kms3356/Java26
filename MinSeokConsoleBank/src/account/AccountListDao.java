package account;

import java.util.ArrayList;
import java.util.List;

public class AccountListDao implements AccountDao {

	List<Account> accountDB = new ArrayList<>();

	@Override
	public boolean insertAccount(Account ac) {
		return accountDB.add(ac);
	}

	@Override
	public List<Account> selectAll() {
		return new ArrayList<>(accountDB);
	}

	@Override
	public Account selectByNo(int accountNo) {
		for (Account ac : accountDB) {
			if (ac.getNo() == accountNo)
				return ac;
		}
		return null;
	}

	@Override
	public List<Account> selectByOwner(String owner) {
		List<Account> list = new ArrayList<>();
		for (Account ac : accountDB) {
			if (ac.getOwner().equals(owner))
				list.add(ac);
		}
		return list;
	}

	@Override
	public boolean updateAccount(Account ac) {
		for (int i = 0; i < accountDB.size(); i++) {
			if (accountDB.get(i).getNo() == ac.getNo()) {
				accountDB.set(i, ac);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteAccount(int accountNo) {
		Account ac = selectByNo(accountNo);
		if (ac == null)
			return false;
		return accountDB.remove(ac);
	}
}