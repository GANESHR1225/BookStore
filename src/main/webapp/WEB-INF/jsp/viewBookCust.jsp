
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Book List</title>
<link href="<c:url value="/css/common.css"/>" rel="stylesheet"
	type="text/css">
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
					href="/cust/home">Home <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item active"><a class="nav-link"
					href="viewcart">Cart</a></li>
			</ul>
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a class="nav-link" href="">About</a></li>
				<li class="nav-item active"><a class="nav-link" href="/">logout</a></li>

			</ul>
		</div>
	</nav>

	<!-- Nav-bar -->




	<!-- Table View of Books -->
	<div class="container p-5">
		<h1>Book List</h1>
		<table class="table table-striped table-bordered table-hover"
			border="1">
			<thead class="table-dark">
				<tr>
					<th scope="col">ISBN</th>
					<th scope="col">Name</th>
					<th scope="col">Author</th>
					<th scope="col">Edition</th>
					<th scope="col">Price</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${book}" var="book">
					<tr>
						<td>${book.isbn}</td>
						<td>${book.name}</td>
						<td>${book.author}</td>
						<td>${book.edition}</td>
						<td>${book.price}</td>

						<%-- <td><a class="btn btn-sm btn-primary"
							c:href="/${book.isbn}">Add to Cart</a> <a
							class="btn btn-sm btn-danger"
							c:href="cart/viewcart">Go to cart</a></td> --%>

						<td><form action="/${book.isbn}" method="post">
								<button type="submit" class="btn btn-sm btn-primary">Add to cart</button>
							</form>
							
					</tr>
				</c:forEach>
			</tbody>
			</thead>
		</table>



		<!-- Table View of Books -->
	<%-- 	<div class="container">

			<div class="row">
				<h1>Book List</h1>
			</div>
			<table class="table table-striped table-bordered table-hover">
				<thead class="table-dark">
					<tr>
						<td>ISBN</td>
						<td>Name</td>
						<td>Author</td>
						<td>Edition</td>
						<td>Price</td>
						<td>Action</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${book}" var="book">
						<tr>
							<td>${book.isbn}</td>
							<td>${book.name}</td>
							<td>${book.author}</td>
							<td>${book.edition}</td>
							<td>${book.price}</td>
							<td><form action="/${book.isbn}" method="post">
									<button type="submit">Add to cart</button>
								</form>
								<form action="cart/viewcart" method="post">
									<button type="submit">Go to cart</button>
								</form></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<form action="cart/viewcart" method="post">
				<button type="submit">Go to cart</button>
			</form>

		</div>
		olde code --%>
</body>
</html>