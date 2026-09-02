package member;

import java.util.List;

public class MemberService {

	private static final String ADMIN_ID = "admin";

	private MemberDao memberDao;
	private Member loginMember;

	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
		memberDao.insertMember(new Member(ADMIN_ID, "관리자", "1234"));
	}

	public boolean login(String id, String password) {
		Member m = memberDao.selectByID(id);
		if (m != null && m.getPassword().equals(password)) {
			loginMember = m;
			return true;
		}
		return false;
	}

	public void logout() {
		loginMember = null;
	}

	public List<Member> getMemberAll() {
		return memberDao.selectAll();
	}

	public Member getLoginMember() {
		return loginMember;
	}

	public String getAdminId() {
		return ADMIN_ID;
	}

	public Member getMemberById(String id) {
		return memberDao.selectByID(id);
	}

	public void insertMember(Member member) {
		memberDao.insertMember(member);
	}

	public boolean updatePassword(String oldPassword, String newPassword) {
		if (!loginMember.getPassword().equals(oldPassword))
			return false;

		loginMember.setPassword(newPassword);
		return memberDao.updateMember(loginMember, newPassword);
	}

	public boolean deleteMember(String password) {
		if (memberDao.deleteMember(loginMember, password)) {
			logout();
			return true;
		}
		return false;
	}

	public boolean deleteMemberByAdmin(String id) {
		Member target = memberDao.selectByID(id);
		if (target == null)
			return false;
		return memberDao.deleteMember(target, target.getPassword());
	}
}