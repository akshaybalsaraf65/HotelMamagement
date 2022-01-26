<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Forget Password</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<script type="text/javascript" src="validatemethod.js"></script>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h1 align="center" class="p-3 mb-2 bg-success text-white">FORGET PASSWORD</h1>

<form action="forget" method="post" onsubmit="return forgetvalidate()">
<input type="hidden" name="id" id="id">
<div class="form-group">
<label class="badge">UserName : </label>
<input type="text" name="username" id="username" class="form-control">
<span id="user_error"></span>
</div>
<div class="form-group">
<label class="badge">New Password : </label>
<input type="password" name="password" id="password" class="form-control">
<span id="pass_error"></span>
</div>

<div class="form-group">
<label class="badge">Comform-Password : </label>
<input type="password" name="cpassword" id="cpassword" class="form-control">
<span id="cpass_error"></span>
</div>


<input type="submit" value="Forget"  class="btn btn-success"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="reset" value="Clear" class="btn btn-danger"> 
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

</form>


<!-- <script type="text/javascript">

function forgetvalidate()
{

var user = document.getElementById('username').value;
var pass = document.getElementById('password').value;
var cpass = document.getElementById('cpassword').value;

if(user == "")
	{
	document.getElementById('user_error').innerHTML = "Please fill username";
	return false;
	}
if((user.length < 3 ) || (user.length > 50))
{
	document.getElementById('user_error').innerHTML = "username must be 3 to 20 character";
	return false;
}
if(user.indexOf('@')<=0)
	{
	document.getElementById('user_error').innerHTML = "Please fill username is a proper format eg. travel@domain.com/.in";
	return false;
	}
	if((user.charAt(user.length-4)!='.') && (user.charAt(user.length-3)!='.'))
		{
		document.getElementById('user_error').innerHTML = "Please fill username is a proper format .extension eg. travel@domain.com/.in";
		return false;
		}
	if(pass == "")
		{
		document.getElementById('pass_error').innerHTML = "Please fill password";
		return false;
		}
	if((pass.length < 5 ) || (pass.length > 20))
		{
		document.getElementById('pass_error').innerHTML = "password must be 5 to 20 ";
		return false;
		}
	if(cpass == "")
		{
		document.getElementById('cpass_error').innerHTML = "Please fill corm-password field";
		return false;
		}
	if(pass!=cpass)
		{
		document.getElementById('cpass_error').innerHTML = "Password should be not same";
		return false;
		}


}

</script>
 -->
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>