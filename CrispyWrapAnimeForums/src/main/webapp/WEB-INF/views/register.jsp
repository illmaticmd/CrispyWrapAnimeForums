<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="cwaf.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CWAF Registration</title>
</head>
<body>
	<div id="bannernav">
		<div class="logo center tabs">
			<a href="home.html"><img src="cwafbanner2.png" alt="CWAF logo"></a>
		</div>
		<div class="tabs flexContainer center">
			<div class="cat1">
				<a href="home.html"><p>Home</p></a>
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
	<div class="center">
		<p>Register!</p>
		<form action="register" method="POST">
			<div class="flexContainer center centerItems">
				<div>
					<p>First Name:&nbsp;</p>
				</div>
				<input type="text" name="firstname" placeholder="First Name" />
			</div>

			<div class="flexContainer center centerItems">
				<div class="label">
					<p>Last Name:&nbsp;</p>
				</div>
				<input type="text" name="lastname" placeholder="Last Name" />
			</div>

			<div class="flexContainer center centerItems">
				<p>Username:&nbsp;</p>
				<p></p>
				<input type="text" name="username" placeholder="Username" />
			</div>

			<div class="flexContainer center centerItems">
				<p>Password:&nbsp;</p>
				<input type="password" name="password" placeholder="Password" />
			</div>

			<div class="flexContainer center centerItems">
				<p>E-mail:&nbsp;</p>
				<input type="text" name="email" placeholder="E-mail" />
				<p></p>
			</div>
			<input type="submit" value="Register!" />
		</form>
	</div>
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