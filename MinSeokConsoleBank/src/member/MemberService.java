package member;

public class MemberService {
	
	private MemberDao memberDao;
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	public boolean login(String id, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	public Member getLoginMember() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getAdminId() {
		// TODO Auto-generated method stub
		return null;
	}
}
