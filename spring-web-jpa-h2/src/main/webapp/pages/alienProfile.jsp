<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
	function editAlienJs(){
		document.querySelector("div#editBlock").style.display = "block";
	}
</script>
</head>
<body>

	<h2>Hi, Alien here is your details.</h2>
	<p>Name: ${alien.aname}</p>
	<p>Language: ${alien.lang}</p>
	<br>
	<button type="submit" id="editButton"
		onclick="editAlienJs()">Edit</button>
	<div id = "editBlock" style="display:none;">
		<h2>Edit alient details:</h2>
		<form action="updateAlien" method="get">
			<input type="hidden" placeholder="Identification Number" name="aid"
				value="${alien.aid}"> <label>Name:</label><input type="text"
				placeholder="Your Name" name="aname" value="${alien.aname}">
			<label>Language:</label> <select name="lang">
				<option value="java">Java</option>
				<option value="python">Python</option>
				<option value="go">Go</option>
				<option value="node">Node</option>
				<option value="ruby">Ruby</option>
				<option value="php">PHP</option>
				<option value="c#">C#</option>
			</select>
			<button type="submit">Submit</button>
		</form>
	</div>

</body>
</html>