
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book List</title>
<link href="<c:url value="/css/common.css"/>" rel="stylesheet"
	type="text/css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<!-- NavBar -->

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
					href="/customerhome">Home <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item active"><a class="nav-link" href="/viewbookcust">BookList</a></li>
			</ul>
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a class="nav-link" href="">About</a></li>
				<li class="nav-item active"><a class="nav-link" href="/">logout</a></li>

			</ul>
		</div>
	</nav>
	<!-- NavBar -->

<!-- Table View of Books -->
	<div class="container p-5">

		<table class="table table-striped table-bordered table-hover"
			border="1">
			<thead class="table-dark">
				<tr>
					<th scope="col">ISBN</th>
					<th scope="col">Name</th>
					<th scope="col">Author</th>
					<th scope="col">Price</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${product}" var="product">
					<tr>
						<td>${product.isbn}</td>
						<td>${product.name}</td>
						<td>${product.author}</td>
						<td>${product.price}</td>
						<td><form action="orderfor/${product.isbn}" method="post">
								<button type="order" class="btn btn-sm btn-primary">Confirm Order</button>
							</form>
							<br><form action="/${product.isbn}">
								<button type="submit" class="btn btn-sm btn-primary">remove from cart</button>
							</form></td>
					</tr>
				</c:forEach>
			</tbody>
			</thead>
		</table>


		<!-- Table View of Books -->
<%-- old code
	<div class="container">

		<table class="table table-striped table-bordered table-hover">
			<thead class="table-dark">
				<tr>
					<td>ISBN</td>
					<td>Name</td>
					<td>Author</td>
					<td>Price</td>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${product}" var="product">
					<tr>
						<td>${product.isbn}</td>
						<td>${product.name}</td>
						<td>${product.author}</td>
						<td>${product.price}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<button type="submit" onCLick="msg()">Place Order</button>


	</div>
 --%>
</body>
</html>