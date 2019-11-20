package com.fdmgroup.cwaf.registration;

import com.fdmgroup.cwaf.JPAMemberDAO;
import com.fdmgroup.cwaf.Member;
import com.fdmgroup.cwaf.MemberDAO;

public class UserValidation {

	private MemberDAO dao = new JPAMemberDAO();

	public boolean validateUser(Member user) {
		Member userSearch = dao.getMember(user.getUsername());
		if (userSearch != null) {
			return false;
		}
		return true; 
	}
}
