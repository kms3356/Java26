package account;

public class NoAccountException extends Exception {

	private static final long serialVersionUID = 1L;

	public NoAccountException(int accountNo) {
		super(accountNo + "번 계좌는 존재하지 않습니다.");
	}
}