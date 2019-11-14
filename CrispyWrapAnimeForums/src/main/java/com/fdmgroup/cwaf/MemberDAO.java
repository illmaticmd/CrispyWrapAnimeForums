package com.fdmgroup.cwaf;

import java.util.List;

public interface MemberDAO {
	void addMember(Member user);

	Member getMember(String username);

	void removeMember(String username);

	void updateMember(Member user);

	List<Member> listMembers();
}
