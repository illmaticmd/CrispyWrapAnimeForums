<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/cwaf.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CWAF User Profile</title>
</head>
<body>
	<div id="bannernav">
		<div class="logo center tabs">
			<a href="home"><img src="resources/cwafbanner2.png" alt="CWAF logo"></a>
		</div>
		<div class="tabs flexContainer center">
			<div class="cat1">
				<a href="home"><p>Home</p></a>
			</div>
			<div class="cat1">
				<a href="userProfile"><p>Profile</p></a>
			</div>
			<div class="cat1">
				<a href="login"><p>Login</p></a>
			</div>
			<div class="cat1">
				<a href="register"><p>Register</p></a>
			</div>
		</div>
	</div>
	<h1>Welcome, ${ user.firstName }</h1>
	<p>Your Full Name: ${ user.firstName } ${ user.lastName }</p>
	<p>Your Username: ${ user.username }</p>
	<p>Your Password: -------- </p>
	<p>Your E-mail: ${ user.email }</p>
</body>
<footer>
<div class="flexContainer center">
	<div class="footercontent">
		<p>Created by: McDesmond Duru</p>
	</div>
	<div class="footercontent">
		<a href="" target="_blank"><p>Terms of Use</p></a>
	</div>
	<div class="footercontent">
		<a href="" target="_blank"><p>Privacy</p></a>
	</div>
	<div class="footercontent">
		<a href="" target="_blank"><p>Contact Us</p></a>
	</div>
</div>
</footer>
</html>