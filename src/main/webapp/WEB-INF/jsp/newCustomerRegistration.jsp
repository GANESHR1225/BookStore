<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration</title>
</head>
<body>
 <div class="container text-center">
        <div>
            <h1>User Registration - Sign Up</h1>
        </div>
<hr>
<form action="/customer/addcustomer" method="post">
<div class="form-group ">
<label for ="firstname" class="label"> Name <span class="span"></span></label><br>
<input type="text" name="firstname" required="required">
</div><br>
<div class="form-group">
<label for ="lastname" class="label"> Last Name <span class="span"></span></label><br>
<input type="text" name="lastname" required="required">
</div><br>
<div class="form-group">
<label for ="dob" class="label"> Date Of Birth <span class="span">*</span></label><br>
<input type="date" name="dob" required="required">
</div><br>
<div class="form-group  ${status.error ? 'has-error' : ''}">
<label for ="username" class="label"> USERNAME <span class="span">*</span></label><br>
<input type="text" name="username" required="required">
<div class="form-group  ${status.error ? 'has-error' : ''}">
<label for ="password" class="label"> Password <span class="span">*</span></label><br>
<input type="password" name="password" required="required">
</div><br>
<div class="form-group">
<label for ="email" class="label"> Email <span class="span">*</span></label><br>
<input type="email" name="email" required="required">
</div><br>
<div class="form-group">
<label for ="city" class="label"> City <span class="span">*</span></label><br>
<input type="text" name="city" required="required">
</div><br>
<div> 
<button type="submit">Register</button> 
</div><br>
</form>
</div>
</body>
</html>