<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Form</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<script type="text/javascript" src="validatemethod.js"></script>
</head>
<body>
<%@ page import="logmodel.DaoHelper" %>

<h1>Edit Form</h1>  
<form>

</div>
<div class="form-group">
<label class="badge">UserName : </label>
<input type="text" name="username" id="username" class="form-control">

</div>

<div class="form-group">
<label class="badge">FirstName : </label>
<input type="text" name="Firstname" id="Firstname" class="form-control">

</div>
<div class="form-group">
<label class="badge">LastName : </label>
<input type="text" name="lastName" id="lastName" class="form-control">

</div>
<div class="form-group">
<label class="badge">mobile : </label>
<input type="text" name="Mobileno" id="Mobileno" class="form-control">

</div>

</div>
<div class="form-group">
<label class="badge">pasword : </label>
<input type="text" name="password" id="password" class="form-control">

</div>

</div>
<div class="form-group">
<label class="badge">cofrm password : </label>
<input type="text" name="cpassword" id="cpassword" class="form-control">

</div>

<input type="submit" value="Edit & Save"  class="btn btn-success" onclick="getEdit()"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;




</form>

</body>
</html>