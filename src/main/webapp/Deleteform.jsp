<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<script type="text/javascript" src="validatemethod.js"></script>
</head>
<body>
<h1 align="center" class="p-3 mb-2 bg-success text-white">Delete User</h1>


<div class="form-group">
<label class="badge">UserName : </label>
<input type="text" name="username" id="username" class="form-control">
<span id="user_error"></span>
</div>
<div class="form-group">
<label class="badge">Mobile No : </label>
<input type="text" name="Mobileno" id="Mobileno" class="form-control">
<span id="mobile_error"></span>
</div>




<input type="submit" value="DElete"  class="btn btn-success" onclick="return getdelete()"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="reset" value="Clear" class="btn btn-danger"> 
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;



</body>
</html>