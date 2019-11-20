package com.fdmgroup.cwaf.registration;

import com.fdmgroup.cwaf.JPAMemberDAO;
import com.fdmgroup.cwaf.Member;
import com.fdmgroup.cwaf.MemberDAO;

public class UserRegister {
	private MemberDAO dao = new JPAMemberDAO();

	public Member registerUser(Member user) {

		dao.addMember(user);
		return user;

	}

}
