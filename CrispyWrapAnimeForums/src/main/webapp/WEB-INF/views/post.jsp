<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/cwaf.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Post A Thread</title>
</head>
<body>
	<div id="bannernav">
		<div class="logo center tabs">
			<a href="home"><img src="resources/cwafbanner2.png"
				alt="CWAF logo"></a>
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

	<div class="center">
		<h2>Compose thread post:</h2>
		<form action="anime">
			<div class="flexContainer center centerItems">
				<p>Title:&nbsp;</p>
				<input type="title" name="title" placeholder="title of thread" />
			</div>
			<textarea name="body" cols="50" rows="5">
		Enter some text...
		</textarea>
			<br /> <input type="submit" value=" Sumbit Post" />
		</form>
	</div>
</body>
</html>