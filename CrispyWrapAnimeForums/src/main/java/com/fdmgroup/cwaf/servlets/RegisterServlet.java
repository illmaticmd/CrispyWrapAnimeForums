package com.fdmgroup.cwaf.servlets;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fdmgroup.cwaf.Member;
import com.fdmgroup.cwaf.registration.UserRegister;
import com.fdmgroup.cwaf.registration.UserValidation;

public class RegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/views/register.jsp").forward(req, resp);
	}

	private UserRegister ur = new UserRegister();
	private UserValidation uv = new UserValidation();

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");

		HttpSession session = req.getSession();
		Member user = new Member();

		user.setUsername(username);
		user.setPassword(password);
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setEmail(email);
		
		Map<String, String> error = uv.validateUserRegistration(user);
		if ( error.size() == 0 ) /*(uv.validateUserLogin(user) == null)*/ {
			ur.registerUser(user);
			session.setAttribute("user", user);
			req.getRequestDispatcher("WEB-INF/views/userProfile.jsp").forward(req, resp); // how to send on to another
																							// page
		} else {
			req.getRequestDispatcher("").forward(req, resp);
		}

	}
}