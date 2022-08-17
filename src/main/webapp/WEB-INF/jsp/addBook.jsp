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
<title>New Book Registration</title>
</head>
<body>

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
				<li class="nav-item active"><a class="nav-link"
					href="/Adminhome">Home <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item active"><a class="nav-link" href="/view">BookList</a></li>
				<li class="nav-item active"><a class="nav-link"
					href="/viewCustomer">UserList</a></li>
			</ul>
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a class="nav-link" href="">About</a></li>
				<li class="nav-item active"><a class="nav-link" href="/">logout</a></li>
			</ul>
		</div>
	</nav>

	<!-- Navabar -->

	<!-- Registraion Form -->
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center text-primary">New Book Registration</h4>

						<form action="add" method="post">

							<div class="form-group">
								<label for="isbn" class="label"> ISBN </label><br> <input
									type="number" class="form-control" name="isbn"
									required="required">
							</div>

							<div class="form-group">
								<label for="name" class="label"> BookName </label><br> <input
									type="text" class="form-control" name="name"
									required="required">
							</div>

							<div class="form-group">
								<label for="author" class="label"> Author </label><br> <input
									type="text" class="form-control" name="author"
									required="required">
							</div>


							<div class="form-group">
								<label for="Edition" class="label"> Edition </label><br> <input
									type="number" class="form-control" name="edition"
									required="required">
							</div>


							<div class="form-group">
								<label for="Price" class="label"> Price</label><br> <input
									type="number" class="form-control" name="price"
									required="required">
							</div>

							<button class="btn btn-primary btn-block" type="submit">Register</button>
						</form>

						<!--  -->
						<!-- Old code -->

						<!-- <div class="Coontainer">
							<h2>New Book Registration</h2>
							<hr>
							<form action="add" method="post">
								<div class="form-group">
									<label for="isbn" class="label"> ISBN <span
										class="span"></span></label><br> <input type="number" name="isbn"
										required="required">
								</div>
								<br>
								<div class="form-group">
									<label for="name" class="label"> BookName <span
										class="span"></span></label><br> <input type="text" name="name"
										required="required">
								</div>
								<br>
								<div class="form-group">
									<label for="author" class="label"> Author <span
										class="span">*</span></label><br> <input type="text"
										name="author" required="required">
								</div>
								<br>
								<div class="form-group">
									<label for="Edition" class="label"> Edition <span
										class="span">*</span></label><br> <input type="number"
										name="edition" required="required">
								</div>
								<br>
								<div class="form-group">
									<label for="Price" class="label"> Price <span
										class="span">*</span></label><br> <input type="number"
										name="price" required="required">
								</div>
								<br>
								<div>
									<button type="submit">Register</button>
								</div>
								<br>
							</form>
		 -->
					</div>
</body>
</html>