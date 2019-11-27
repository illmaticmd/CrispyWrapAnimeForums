package com.fdmgroup.cwaf.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fdmgroup.cwaf.JPAMemberDAO;
import com.fdmgroup.cwaf.Member;
import com.fdmgroup.cwaf.MemberDAO;
@Component
public class UserRegister {
	@Autowired
	private MemberDAO dao; // = new JPAMemberDAO()

	public Member registerUser(Member user) {

		dao.addMember(user);
		return user;

	}

}
