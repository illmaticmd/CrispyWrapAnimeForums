package com.fdmgroup.cwaf;

public class MemberFactory {

	public Member createMember(String username, String password, String firstName, String lastName) {
		Member member = new Member();
		member.setFirstName(firstName);
		member.setLastName(lastName);
		member.setUsername(username);
		member.setPassword(password);
		return member;
	}
	
}
