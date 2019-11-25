package com.fdmgroup.cwaf.registration;

import java.util.HashMap;
import java.util.Map;

import com.fdmgroup.cwaf.JPAMemberDAO;
import com.fdmgroup.cwaf.Member;
import com.fdmgroup.cwaf.MemberDAO;

public class UserValidation {

	private MemberDAO dao = new JPAMemberDAO();

	public Member validateUserLogin(Member user) {
		Member userSearch = dao.getMember(user.getUsername());
		if (userSearch != null && userSearch.getPassword().equals(user.getPassword())) {
			return userSearch;
		}
		return null;
	}

	public Map<String, String> validateUserRegistration(Member user /*String passwordConfirm*/) {
		Map<String, String> errors = new HashMap<>();
//		if (!user.getPassword().equals(passwordConfirm)) {
//			errors.put("passwordError", "Passwords did not match!");
//		}
		if (user.getUsername().isEmpty()) {
			errors.put("usernameError", "Username cannot be empty!");
		} else if (dao.getMember(user.getUsername()) != null) {
			errors.put("usernameError", "Username already taken!");
		}
		if (user.getFirstName().isEmpty()) {
			errors.put("firstNameError", "First Name cannot be empty!");
		}
		if (user.getLastName().isEmpty()) {
			errors.put("lastNameError", "Last Name cannot be empty!");
		}
		if (user.getEmail().isEmpty()) {
			errors.put("emailError", "Email cannot be empty!");
		}
		if (user.getPassword().isEmpty()) {
			errors.put("passwordError", "Password cannot be empty!");
		}
		return errors;
	}

}
