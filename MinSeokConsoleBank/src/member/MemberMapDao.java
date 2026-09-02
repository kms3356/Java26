package member;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MemberMapDao implements MemberDao {

	Map<String, Member> memberDB = new LinkedHashMap<>();

	@Override
	public boolean insertMember(Member m) {
		memberDB.put(m.getId(), m);
		return true;
	}

	@Override
	public List<Member> selectAll() {
		return new ArrayList<>(memberDB.values());
	}

	@Override
	public Member selectByID(String id) {
		return memberDB.get(id);
	}

	@Override
	public boolean updateMember(Member m, String password) {
		Member saved = memberDB.get(m.getId());
		if (saved == null || !saved.getPassword().equals(password))
			return false;

		memberDB.put(m.getId(), m);
		return true;
	}

	@Override
	public boolean deleteMember(Member m, String password) {
		Member saved = memberDB.get(m.getId());
		if (saved == null || !saved.getPassword().equals(password))
			return false;

		return memberDB.remove(m.getId()) != null;
	}
}