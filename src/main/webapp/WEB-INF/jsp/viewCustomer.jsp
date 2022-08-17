
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
<link href="<c:url value="/css/common.css"/>" rel="stylesheet"
	type="text/css">
</head>
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
				<li class="nav-item active"><a class="nav-link"
					href="/Adminhome">Home <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item active"><a class="nav-link" href="/addBook">Book
						Registration</a></li>
				<li class="nav-item active"><a class="nav-link" href="/view">BookList</a></li>
			</ul>
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a class="nav-link" href="">About</a></li>
				<li class="nav-item active"><a class="nav-link" href="/">logout</a></li>

			</ul>
		</div>
	</nav>
	<!-- Nav bar -->

<!-- user's table view -->
<div class="container p-5">
		<h1> User List</h1>
		<table class="table table-striped table-bordered table-hover" 
			border="1">
			<thead class="table-dark">
				<tr>
					<th scope="col">ID</th>
					<th scope="col">First Name</th>
					<th scope="col">Last Name</th>
					<th scope="col">City</th>
					<th scope="col">Email</th>
					<th scope="col">Date of Birth</th>
					<th scope="col">Username</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${customer}" var="customer">
					<tr>
						<td>${customer.id}</td>
						<td>${customer.firstname}</td>
						<td>${customer.lastname}</td>
						<td>${customer.city}</td>
						<td>${customer.email}</td>
						<td>${customer.dob}</td>
						<td>${customer.username}</td>
						<td><a class="btn btn-sm btn-primary"
							th:href="@{/update/{id}(id=${customer.id})}">Update</a> <a
							class="btn btn-sm btn-danger"
							th:href="@{/delete/{id}(id=${customer.id})}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
			</thead>
		</table>



<!-- user's table view -->
	<%--  old code
	<div class="container">

		<div class="row">
			<h1>Book List</h1>
		</div>
		<table class="table table-striped table-bordered table-hover">
			<thead class="table-dark">
				<tr>
					<td>ID</td>
					<td>FirstName</td>
					<td>LastName</td>
					<td>City</td>
					<td>Email</td>
					<td>Date of Birth</td>
					<td>username</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${customer}" var="customer">
					<tr>
						<td>${customer.id}</td>
						<td>${customer.firstname}</td>
						<td>${customer.lastname}</td>
						<td>${customer.city}</td>
						<td>${customer.email}</td>
						<td>${customer.dob}</td>
						<td>${customer.username}</td>
					</tr>
				</c:forEach>
			</tbody>

		</table>

	</div>
 old code--%>
</body>
</html>