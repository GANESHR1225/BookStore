
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Login</title>
<link rel="stylesheet" href="css/style.css">

</head>
<body>

<h2>Customer Login Page</h2>
<hr>
<form class="form-inline" action="/cust/home" method ="get">
  <div class="form-group">
    <input type="text" class="form-control" id="username" required="required" placeholder="username">
    <input type="password" class="form-control" id="password" required="required" placeholder="Password">
      <input type="checkbox"> Remember me
  <button type="submit" class="btn btn-default">Sign in</button>
  </form>
  <form class="form-inline" action="/customer/newCustomerRegistration" method="post">
  <input type="submit" class="btn btn-default" value="Sign up"/>
  </form>
  </div>


</body>
</html>