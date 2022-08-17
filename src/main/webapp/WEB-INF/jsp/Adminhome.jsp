<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<script type="text/javascript">
	function onClick() {
		location.href = 'http://localhost:8080/viewBook.jsp';
	}
</script>
<body>
	<!-- Navabar -->

	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<a class="navbar-brand">BookStore</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item active"><a class="nav-link" href="/addBook">Book Registration</a></li>
				<li class="nav-item active"><a class="nav-link" href="/view">BookList</a></li>
				<li class="nav-item active"><a class="nav-link" href="/viewCustomer">UserList</a></li>
			</ul>
			<ul class="navbar-nav ml-auto">
			<li class="nav-item active"><a class="nav-link" href="">About</a></li>
				<li class="nav-item active"><a class="nav-link" href="/">logout</a></li>
				
				</ul>
			</div>
	</nav>

	<!-- Navabar -->
	
	<!-- Old Code -->
<!-- 	<div class="form">
		<form class="form-inline" action="/addBook" method="post">
			<div>
				<button type="submit">Add New Book</button>
			</div>
		</form>
		<div>
			<form class="form-inline" action="/view" method="get">
				<button type="submit">View Book</button>
			</form>
		</div>
		<div>
			<form action="/viewCustomer" method="get">
				<button type="submit">View Customer</button>
			</form>
		</div>
	</div> -->
</body>
</html>