package com.fdmgroup.cwaf;

public class Admin extends Moderator {
	private MemberDAO dao;
	public void banUser() {

	}
	
	public void setRole(Member member, String role) {
		Member userSearch = dao.getMember(member.getUsername());
		if (userSearch != null ) {
			userSearch.setRole(role);
		}
	}
	
}
