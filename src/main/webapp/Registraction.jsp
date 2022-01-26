<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registraction</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script> -->
<script src= "https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script type="text/javascript" src="validatemethod.js"></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<br><br>

<div id="data"></div>
<h1 align="center" class="p-3 mb-2 bg-info text-white">Sign-Up form</h1>


<div id="register">
<!-- <form action="registraction" method="post" onsubmit="return regivalidate()"> -->

<input type="hidden" name="pk" id="pk">
<div class="form-group">
<label class="badge">FirstName : </label><span class="required">*</span>
<input type="text" name="Firstname" id="Firstname" class="form-control">
<span id="fname_error"></span>
</div>
<div class="form-group">
<label class="badge">LastName : </label><span class="required">*</span>
<input type="text" name="lastName" id="lastName" class="form-control">
<span id="lname_error"></span>
</div>
<div class="form-group">
<label class="badge">Mobile No : </label><span class="required">*</span>
<input type="text" name="Mobileno" id="Mobileno" class="form-control">
<span id="mobile_error"></span>
</div>
<div class="form-group">

<label class="badge">UserName : </label><span class="required">*</span>
<input type="text" name="username" id="username" class="form-control">
<span id="username_error"></span>
</div>
<div class="form-group">
<label class="badge">Password : </label><span class="required">*</span>
<input type="password" name="password" id="password" class="form-control">
<span id="pass_error"></span>
</div>
<div class="form-group">
<label class="badge">Comform-Password : </label><span class="required">*</span>
<input type="password" name="cpassword" id="cpassword" class="form-control">
<span id="cpass_error"></span>
</div>


<!-- </form> -->

</div>
<input type="submit" value="Registraction"  class="btn btn-success"  onclick="regi()"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<input type="submit" value="search"  class="btn btn-success" onclick="return getSearch()">

<input type="reset" value="Clear" class="btn btn-danger" align="right">

<input type="submit" value="Update"  class="btn btn-success" onclick="return getUpdate()">
<input type="submit" value="DElete User"  class="btn btn-success" onclick="return getdelete()">

<jsp:include page="footer.jsp"></jsp:include>


<%-- <jsp:include page="footer.jsp"></jsp:include> --%>

<!--  <script type="text/javascript">

 function regivalidate()
{
	var fname = document.getElementById('Firstname').value;
	var lname =  document.getElementById('lastName').value;
	var mob =  document.getElementById('Mobileno').value;
	var usern =  document.getElementById('username').value;
	var pass =  document.getElementById('password').value;
	var cpass =  document.getElementById('cpassword').value;
	
	if(fname =="")
		{
		document.getElementById('fname_error').innerHTML = "Please fill First Name ";
		return false;
		}
	if(!isNaN(fname)){
		document.getElementById('fname_error').innerHTML = "Please enter only Character";
		return false;
	}
	
// 	if(!NaN(fname))
// 		{
// 		document.getElementById('fname_error').innerHTML = "First Name must be character ";
// 		}
	if(lname == "")
		{
		document.getElementById('lname_error').innerHTML = "Please fill Last Name";
		return false;
		}
	if(!isNaN(lname)){
		document.getElementById('lname_error').innerHTML="Please enter only Character";
		return false;
	}
	
	if(mob =="")
	{
	document.getElementById('mobile_error').innerHTML = "Please fill mobile no ";
	return false;
	}
	if(isNaN(mob))
		{
		document.getElementById('mobile_error').innerHTML = "Please enter only number";
		return false;
		}
	
	if(mob.length < 10) 
		{
		document.getElementById('mobile_error').innerHTML = "Mobile Number Must be 10 digit";
		return false;
		}
	if(usern == "")
		{
		document.getElementById('username_error').innerHTML = "Please fill user Name";
		return false;
		}
	
	if((usern.length < 3) || (usern.length > 50))
		{
		document.getElementById('username_error').innerHTML = "username must be 3 to 20 character";
		return false;
		}
	if(usern.indexOf('@')<=0)
	
	
		{
		document.getElementById('username_error').innerHTML = "Please fill username is a proper format eg. travel@domain.com/.in";
		}
	if(pass == "")
		{
		document.getElementById('pass_error').innerHTML = "Please fill password field";
		return false;
		}
	if((pass.length < 5) || (pass.length > 20))
		{
		document.getElementById('pass_error').innerHTML = "Password must be 5 to 20 character";
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


</script>  -->

</body>
</html>