<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Hi, this is home page.</h2>
	<h2>Add Alien</h2>
	<form action="saveAlien" method="get">
		<label>Id:</label><input type="text"
			placeholder="Identification Number" name="aid"> <label>Name:</label><input
			type="text" placeholder="Your Name" name="aname"> <label>Language:</label>
		<select name="lang">
			<option value="java">Java</option>
			<option>Python</option>
			<option>Go</option>
			<option>Node</option>
			<option>Ruby</option>
			<option>PHP</option>
			<option>C#</option>
		</select>
		<button type="submit">Submit</button>
	</form>

	<h2>Get Alien by its Id:</h2>
	<form action="/getAlienById" method="get">
		<label>Alien Id: </label><input type="text" name="aid">
		<button type="submit">Submit</button>
	</form>

	<h2>Get Alien by its lang:</h2>
	<form action="/getAlienByTech" method="get">
		<label>Language:</label> <select name="lang">
			<option value="java">Java</option>
			<option>Python</option>
			<option>Go</option>
			<option>Node</option>
			<option>Ruby</option>
			<option>PHP</option>
			<option>C#</option>
		</select>
		<button type="submit">Submit</button>
	</form>

</body>
</html>