<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<title>Admin Login</title>
</head>
<body>
	<h2>Admin Login Page</h2>
	<hr>
	<div class="form-inline">
		<form class="form-inline" action="/Adminhome" method="post">
			<div class="form-group">
				<input type="text" class="form-control" id="userId"
					required="required" placeholder="UserId"> <input
					type="password" class="form-control" id="password"
					required="required" placeholder="Password"> <input
					type="checkbox"> Remember me
				<button type="submit">Login</button>
		</form>

	</div>
	</form>
	</div>
</body>
</html>