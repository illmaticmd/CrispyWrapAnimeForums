package com.fdmgroup.cwaf;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fdmgroup.cwaf.Member;
import com.fdmgroup.cwaf.registration.UserRegister;
import com.fdmgroup.cwaf.registration.UserValidation;

@Controller
public class UserController {
	@Autowired
	private UserValidation uv;
	@Autowired
	private UserRegister ur;

	@GetMapping("/")
	public String landingPage() {
		return "home";
	}

	@GetMapping("/home")
	public String returnHome() {
		return "home";
	}
	@GetMapping("/userProfile")
	public String home() {
		return "userProfile";
	}

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String postLoginPage(@RequestParam String username, @RequestParam String password, HttpSession session,
			HttpServletRequest req) {

		Member user = new Member();

		user.setUsername(username);
		user.setPassword(password);

		user = uv.validateUserLogin(user);
		if (user != null) {
			session.setAttribute("user", user);
			return "redirect:/home";
		} else {
			return "login";
		}

	}

	@GetMapping("/register")
	public String registerPage(Model model) {
		model.addAttribute("user", new Member());
		return "register";
	}

	@PostMapping("/register")
	public String postRegsiterPage(Member user, HttpSession session, HttpServletRequest req, Model model) {

		Map<String, String> error = uv.validateUserRegistration(user);
		if (error.size() == 0) {
			ur.registerUser(user);
			session.setAttribute("user", user);
			return "redirect:/userProfile";
		} else {
			model.addAttribute("user", user);
			return "register";
		}

	}

	@GetMapping("/anime")
	public String animePage() {
		return "anime";
	}

	@GetMapping("/post")
	public String postPage() {
		return "post";
	}

	@PostMapping()
	public String postThreadPage(){
		return "post";

	}

	@GetMapping("/manga")
	public String mangaPage() {
		return "manga";
	}
}
