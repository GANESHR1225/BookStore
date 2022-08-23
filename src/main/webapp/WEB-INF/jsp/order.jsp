
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
<title>Buy now</title>
<link href="<c:url value="/css/common.css"/>" rel="stylesheet"
	type="text/css">
</head>
<script type="text/javascript">
            function showMessage() {
                alert("Your Order Has been placed Successfully!");
                location.href = "http://localhost:8080/viewbookcust";
            }
        </script>
<body>

	<!-- NavBAr -->

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
					href="/customerhome">Home <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item active"><a class="nav-link"
					href="/viewbookcust">Book List</a></li>
				<li class="nav-item active"><a class="nav-link"
					href="/viewcart">Cart</a></li>
			</ul>
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a class="nav-link" href="">About</a></li>
				<li class="nav-item active"><a class="nav-link"
					href="/customerlogin">logout</a></li>

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
					<th scope="col">Book ID</th>
					<th scope="col">Book Name</th>
					<th scope="col">Author</th>
					<th scope="col">Price</th>
					<!--  <th scope="col">Quantity:</th>
				<th scope="col">Final Price</th>  -->
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${orderlist}" var="orderlist">
					<tr>
						<td>${orderlist.isbn}</td>
						<td>${orderlist.name}</td>
						<td>${orderlist.author}</td>
						<td>${orderlist.price}</td>
						<%-- <td><section class="container">
								<div class="product-quantity">
									<input data-min="1" data-max="0" type="text" name="quantity"
										value="1" readonly="true">
									<div class="quantity-selectors-container">
										<div class="quantity-selectors">
											<button type="button" class="increment-quantity"
												aria-label="Add one" data-direction="1">
												<span>&#43;</span>
											</button>
											<button type="button" class="decrement-quantity"
												aria-label="Subtract one" data-direction="-1"
												disabled="disabled">
												<span>&#8722;</span>
											</button>
										</div>
									</div>
							</section>
							</td>
						  <td>${quantity * price}</td>
 --%>

						<td><<%-- form action="/${product.isbn}" method="post">
							<button type="order" class="btn btn-sm btn-primary">Buy
							Now</button> </form> --%> 
							<button type="order" class="btn btn-sm btn-primary"
							onClick="showMessage()">Buy Now</button></td>
						<!-- 						<td><input type="number" required="required"></td> -->
					</tr>
				</c:forEach>
			</tbody>
			</thead>
		</table>


		<!-- Table View of Books -->

		<%-- old code
		<div class="container">

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
						</tr>
					</c:forEach>
				</tbody>

			</table>

		</div>
 old code --%>
</body>
</html>