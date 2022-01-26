/**
 * 
 */


function regi()
{
	if(!regivalidate())
		return;

	var Firstname = $('#Firstname').val();
	var lastName =  $('#lastName').val();
	var Mobileno =  $('#Mobileno').val();
	var username =  $('#username').val();
	var password =  $('#password').val();
	var cpassword =  $('#cpassword').val();
	
	$.ajax({
		type:'POST',
        url:'registraction', 
        data:"Firstname="+Firstname + "&lastName="+lastName +"&Mobileno="+Mobileno+"&username="+username +"&password="+password + "&cpassword=" +cpassword,
        success:function(resposne) {
        	if(resposne!= "Error")
        		{
        	//	showdisplay(resposne);
        		window.location.href = "Login.jsp";
        		
        		}
        	else
        		{
        		window.location.href = "Registraction.jsp";
        		}
				
			}
	});
}



function validation()
{
	var sar = true;
	var user = document.getElementById('username').value;
	var pass = document.getElementById('password').value;
	
	
	
	if(user == "")
		{
		document.getElementById('user_error').innerHTML = "Please fill username!";
		return false;
		}
	if(pass == "")
		{
		document.getElementById('pass_error').innerHTML = "Please fill password";
		return false;
		}
	if((user.length < 3) || (user.length > 50))
	{
		document.getElementById('user_error').innerHTML = "username must be 3 to 20 character";
		return false;
	}
	if((pass.length < 5) || (pass.length > 20))
	{
		document.getElementById('pass_error').innerHTML = "password must be 5 to 20 ";
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
	return sar;
	
}
//$( function() {
//    $( "#datepicker" ).datepicker();
//  } );


function logvalid()
{
if(!validation())
	return;
	
	var username = $('#username').val();
	var password =  $('#password').val();
	
	$.ajax({
		type: 'POST',
		url: 'login',
		data : "username="+username+"&password="+password,
		success:function(result){
			if(result == "success"){
				window.location.href("success.jsp");
			}
			else
				window.location.href("error.jsp");
		},
		
	});
	

}


function regivalidate()
{
	var validate = true;
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
	
	if(mob ==="")
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
	return validate;
	
} 



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

function SelectAge(){
	
	var noOfChild = document.getElementById('children').value;
	
	
	
	
	if(noOfChild == 1){
		document.getElementById('AgeSelect1').style.display="block";
	}
	if(noOfChild == 2){
		document.getElementById('AgeSelect1').style.display="block";
		document.getElementById('AgeSelect2').style.display="block";
	}
	if(noOfChild == 3){
		document.getElementById('AgeSelect1').style.display="block";
		document.getElementById('AgeSelect2').style.display="block";
		document.getElementById('AgeSelect3').style.display="block";
	}
	if(noOfChild == 4){
		document.getElementById('AgeSelect1').style.display="block";
		document.getElementById('AgeSelect2').style.display="block";
		document.getElementById('AgeSelect3').style.display="block";
		document.getElementById('AgeSelect4').style.display="block";
	}
	if(noOfChild == 5){
		document.getElementById('AgeSelect1').style.display="block";
		document.getElementById('AgeSelect2').style.display="block";
		document.getElementById('AgeSelect3').style.display="block";
		document.getElementById('AgeSelect4').style.display="block";
		document.getElementById('AgeSelect5').style.display="block";
	}
	if(noOfChild == 6){
		document.getElementById('AgeSelect1').style.display="block";
		document.getElementById('AgeSelect2').style.display="block";
		document.getElementById('AgeSelect3').style.display="block";
		document.getElementById('AgeSelect4').style.display="block";
		document.getElementById('AgeSelect5').style.display="block";
		document.getElementById('AgeSelect6').style.display="block";
	}
	if(noOfChild == 7){
		document.getElementById('AgeSelect1').style.display="block";
		document.getElementById('AgeSelect2').style.display="block";
		document.getElementById('AgeSelect3').style.display="block";
		document.getElementById('AgeSelect4').style.display="block";
		document.getElementById('AgeSelect5').style.display="block";
		document.getElementById('AgeSelect6').style.display="block";
		document.getElementById('AgeSelect7').style.display="block";
	}
	if(noOfChild == 8){
		document.getElementById('AgeSelect1').style.display="block";
		document.getElementById('AgeSelect2').style.display="block";
		document.getElementById('AgeSelect3').style.display="block";
		document.getElementById('AgeSelect4').style.display="block";
		document.getElementById('AgeSelect5').style.display="block";
		document.getElementById('AgeSelect6').style.display="block";
		document.getElementById('AgeSelect7').style.display="block";
		document.getElementById('AgeSelect8').style.display="block";
	}
	if(noOfChild == 9){
		document.getElementById('AgeSelect1').style.display="block";
		document.getElementById('AgeSelect2').style.display="block";
		document.getElementById('AgeSelect3').style.display="block";
		document.getElementById('AgeSelect4').style.display="block";
		document.getElementById('AgeSelect5').style.display="block";
		document.getElementById('AgeSelect6').style.display="block";
		document.getElementById('AgeSelect7').style.display="block";
		document.getElementById('AgeSelect8').style.display="block";
		document.getElementById('AgeSelect9').style.display="block";
	}
	if(noOfChild == 10){
		document.getElementById('AgeSelect1').style.display="block";
		document.getElementById('AgeSelect2').style.display="block";
		document.getElementById('AgeSelect3').style.display="block";
		document.getElementById('AgeSelect4').style.display="block";
		document.getElementById('AgeSelect5').style.display="block";
		document.getElementById('AgeSelect6').style.display="block";
		document.getElementById('AgeSelect7').style.display="block";
		document.getElementById('AgeSelect8').style.display="block";
		document.getElementById('AgeSelect9').style.display="block";
		document.getElementById('AgeSelect10').style.display="block";
	}
	if(noOfChild == 0){
		document.getElementById('AgeSelect1').style.display="none";
		document.getElementById('AgeSelect2').style.display="none";
		document.getElementById('AgeSelect3').style.display="none";
		document.getElementById('AgeSelect4').style.display="none";
		document.getElementById('AgeSelect5').style.display="none";
		document.getElementById('AgeSelect6').style.display="none";
		document.getElementById('AgeSelect7').style.display="none";
		document.getElementById('AgeSelect8').style.display="none";
		document.getElementById('AgeSelect9').style.display="none";
		document.getElementById('AgeSelect10').style.display="none";
	}
	
	
}







function getSearch() {

	var pk = $('#pk').val();
	var fname = $('#Firstname').val();
	var lname =  $('#lastName').val();
	var mob =  $('#Mobileno').val();
	var usern =  $('#username').val();
	var pass =  $('#password').val();
	var cpass =  $('#cpassword').val();
	
	$.ajax({
		type:'POST',
        url:'search', 
        data:"pk="+pk +"&fname="+fname + "&lname="+lname +"&mob="+mob+"&usern="+usern +"&pass="+pass + "&cpass=" +cpass,
        success:function(resposne) {
        	if(resposne!= "Error")
        		{
        	//	showdisplay(resposne);
        		showhtml(resposne);
        		
        		}
        	else
        		{
        		window.location.href = "Login.jsp";
        		}
				
			}
	});
	
}

function showdisplay(resposne){
	 $('#register').css("display","none");
	    $('#data').html(resposne);
	
}
var xmlDoc;

function showhtml(resposne){

	
	

	
	var bod = "";
	
	
	var text, parser;

	
	
	
	
	text = resposne;
	
		
	parser = new DOMParser();
	xmlDoc = parser.parseFromString(text,"text/xml");
//	document.getElementById("data").innerHTML= xmlDoc.getElementsByTagName("usertag")[0].nodevalue();
		
		
var usertag =xmlDoc.getElementsByTagName("user");
/*var fname = document.getElementsByTagName("fname");
var lname = document.getElementsByTagName("lname");
var mobile = document.getElementsByTagName("mobile");
var user = document.getElementsByTagName("username");
var pass = document.getElementsByTagName("password");
var cpass = document.getElementsByTagName("cpassword");
*/




/*var xml = response;
xmlDoc = $.parseXML(xml),
$xml = $(xmlDoc);*/






if(usertag!="undefined" && usertag.length!=0)
{

bod +="<table border='1s' cellpadding='30px' align='center' bordercolor='red'>";
bod +="<thead><tr><th>ID</th><th>First Name</th><th>Last Name</th><th>User Name</th><th>Mobile </th><th>Password</th><th>Confirm Password</th><th>EDIT</th><th>DELETE</th></tr></thead>";
bod +="<tbody>";



	for(var i=0;i<usertag.length;i++)
	{
	
	bod +="<tr>";
	
	//var fname = usertag[i].getElementsByTagName('uusertag')[0].innerHTML;
	

	var id=usertag[i].getElementsByTagName("id")[0].innerHTML;
	  var fname=usertag[i].getElementsByTagName("fname")[0].innerHTML;
	   var lname=usertag[i].getElementsByTagName("lname")[0].innerHTML;
      var username=usertag[i].getElementsByTagName("username")[0].innerHTML;
      var mobile=usertag[i].getElementsByTagName("mobile")[0].innerHTML;
      var password=usertag[i].getElementsByTagName("password")[0].innerHTML;
      var cpassword=usertag[i].getElementsByTagName("cpassword")[0].innerHTML; 
      
     
      
      /*bod +=fname;
      bod +=lname;
      bod +=username;
      bod +=mobile;
      bod +=password;
      bod +=cpassword;*/
      
      
      bod +="<td>"+id+"</td>";
      bod +="<td>"+fname+"</td>";
      bod +="<td>"+lname+"</td>";
      bod +="<td>"+username+"</td>";
      bod +="<td>"+mobile+"</td>";
      bod +="<td>"+password+"</td>";
      bod +="<td>"+cpassword+"</td>";
    //  bod +="<td><input type='button' value='Edit'  onclick ='getEdit("+i+")'></td>";
     // bod +="<td><a href = 'Registraction.jsp'></a>" + EDIT + "</td>";
      
      
      
      bod +="<td><a onclick ='getEdit("+i+")'>EDIT</a></td>";
      bod +="<td><a onclick ='getdelete("+i+")'>DELETE</a></td>";
      //bod +="<td><input type='button' value='Delete' onclick='return getdelete("+i+")' style='color:red;'></td>";
      
    
 
 
      bod +="</tr>";
      
      
      
	}
	}
else
	{
	alert("SORRy DATA not found");
	
	}

bod +="</tbody>";
bod +="</tr>";
$('#register').css("display","none");
$('#data').html(bod);
$('#data').show();
/*
StringBuffer str = new StringBuffer();
str.append("<table border='1s' cellpadding='30px' align='center' bordercolor='red'>");
str.append("<thead><tr><th>First Name</th><th>Last Name</th><th>User Name</th><th>Mobile </th><th>Password</th><th>Confirm Password</th></tr></thead>");
str.append("<tbody>");

str.append("<tr>");

str.append("<fname>" +  + "</fname>");
str.append("<lname>" +  + "</lname>");
str.append("<username>" +  + "</username>");
str.append("<password>" +  + "</password>");
str.append("<cpassword>" +  + "</cpassword>")

str.append("</tr>");
str.append("</xml");
str.append("</tbody>");
str.append("</table>");
*/





}



function diser(){
	var bod = "";
	
	
	bod +="<body>";
	bod +="<h1 border='1s' cellpadding='30px' align='center' bordercolor='red'>";
	bod += "Sorry Data Not found";
	bod +="</h1>";
	bod +="<body>";

}

/*function onclickchange(resposne){

	var bod = "";
	
	var text, parser, xmlDoc;

	text = resposne;
	parser = new DOMParser();
	xmlDoc = parser.parseFromString(text,"text/xml");
//	document.getElementById("data").innerHTML= xmlDoc.getElementsByTagName("usertag")[0].nodevalue();
		
		
var usertag =xmlDoc.getElementsByTagName("user");
var fname = document.getElementsByTagName("fname");
var lname = document.getElementsByTagName("lname");
var mobile = document.getElementsByTagName("mobile");
var user = document.getElementsByTagName("username");
var pass = document.getElementsByTagName("password");
var cpass = document.getElementsByTagName("cpassword");





var xml = response;
xmlDoc = $.parseXML(xml),
$xml = $(xmlDoc);



bod +="<table border='1s' cellpadding='30px' align='center' bordercolor='red'>";
bod +="<thead><tr><th>First Name</th><th>Last Name</th><th>User Name</th><th>Mobile </th><th>Password</th><th>Confirm Password</th><th>EDIT</th><th>DELETE</th></tr></thead>";
bod +="<tbody>";


for(var i=0;i<usertag.length;i++)
	{
	
	bod +="<tr>";
	
	//var fname = usertag[i].getElementsByTagName('uusertag')[0].innerHTML;
	

	
	  var fname=usertag[i].getElementsByTagName("fname")[0].innerHTML;
	   var lname=usertag[i].getElementsByTagName("lname")[0].innerHTML;
      var username=usertag[i].getElementsByTagName("username")[0].innerHTML;
      var mobile=usertag[i].getElementsByTagName("mobile")[0].innerHTML;
      var password=usertag[i].getElementsByTagName("password")[0].innerHTML;
      var cpassword=usertag[i].getElementsByTagName("cpassword")[0].innerHTML; 
      
     
      
      bod +=fname;
      bod +=lname;
      bod +=username;
      bod +=mobile;
      bod +=password;
      bod +=cpassword;
      
      
      
      bod +="<td><textarea>"+fname+"</textarea></td>";
      bod +="<td><textarea>"+lname+"</textarea></td>";
      bod +="<td><textarea>"+username+"</textarea></td>";
      bod +="<td><textarea>"+mobile+"</textarea></td>";
      bod +="<td><textarea>"+password+"</textarea></td>";
      bod +="<td><textarea>"+cpassword+"</textarea></td>";
    
     
    
 
 
      bod +="</tr>";
	}


bod +="</tbody>";
bod +="</tr>";
//$('#register').css("display","none");
$('#data').html(bod);

StringBuffer str = new StringBuffer();
str.append("<table border='1s' cellpadding='30px' align='center' bordercolor='red'>");
str.append("<thead><tr><th>First Name</th><th>Last Name</th><th>User Name</th><th>Mobile </th><th>Password</th><th>Confirm Password</th></tr></thead>");
str.append("<tbody>");

str.append("<tr>");

str.append("<fname>" +  + "</fname>");
str.append("<lname>" +  + "</lname>");
str.append("<username>" +  + "</username>");
str.append("<password>" +  + "</password>");
str.append("<cpassword>" +  + "</cpassword>")

str.append("</tr>");
str.append("</xml");
str.append("</tbody>");
str.append("</table>");






}

*/










function getEdit(i){
	
	var bod = "";
	
	var usertag =xmlDoc.getElementsByTagName("user");
	var id=usertag[i].getElementsByTagName("id")[0].innerHTML;
	var fname = usertag[i].getElementsByTagName("fname")[0].innerHTML;
	var lname=usertag[i].getElementsByTagName("lname")[0].innerHTML;
    var username=usertag[i].getElementsByTagName("username")[0].innerHTML;
    var mobile=usertag[i].getElementsByTagName("mobile")[0].innerHTML;
    var password=usertag[i].getElementsByTagName("password")[0].innerHTML;
    var cpassword=usertag[i].getElementsByTagName("cpassword")[0].innerHTML; 
  //  window.location.href = "Registraction.jsp";
    
    document.getElementById('pk').value=id;
    document.getElementById('Firstname').value=fname;
    document.getElementById('lastName').value=lname;
    
    document.getElementById('Mobileno').value=mobile;
    document.getElementById('username').value=username;
    document.getElementById('password').value=password;
    document.getElementById('cpassword').value=cpassword;
    
    
    $('#data').css("display","none");
    $('#register').show();

}


function ar()
{
    /*var fname=usertag[i].getElementsByTagName("fname")[0].innerHTML;
	   var lname=usertag[i].getElementsByTagName("lname")[0].innerHTML;
var username=usertag[i].getElementsByTagName("username")[0].innerHTML;
var mobile=usertag[i].getElementsByTagName("mobile")[0].innerHTML;
var password=usertag[i].getElementsByTagName("password")[0].innerHTML;
var cpassword=usertag[i].getElementsByTagName("cpassword")[0].innerHTML; */
	





	
	/*var usertag =xmlDoc.getElementsByTagName("user");
	var Firstname = usertag[i].getElementsByTagName("Firstname")[0].innerHTML;
	var lastName=usertag[i].getElementsByTagName("lastName")[0].innerHTML;
    var username=usertag[i].getElementsByTagName("username")[0].innerHTML;
    var Mobileno=usertag[i].getElementsByTagName("Mobileno")[0].innerHTML;
    var password=usertag[i].getElementsByTagName("password")[0].innerHTML;
    var cpassword=usertag[i].getElementsByTagName("cpassword")[0].innerHTML; 
  //  window.location.href = "Registraction.jsp";
    document.getElementById("username").innerHTML=username;
    document.getElementById("Firstname").innerHTML=Firstname;
    document.getElementById("lastName").innerHTML=lastName;
    document.getElementById("Mobileno").innerHTML=Mobileno;
    document.getElementById("password").innerHTML=password;
    document.getElementById("cpassword").innerHTML=cpassword;*/
    
	
/*    var fname=usertag[i].getElementsByTagName("fname")[0].innerHTML;
	   var lname=usertag[i].getElementsByTagName("lname")[0].innerHTML;
   var username=usertag[i].getElementsByTagName("username")[0].innerHTML;
   var mobile=usertag[i].getElementsByTagName("mobile")[0].innerHTML;
   var password=usertag[i].getElementsByTagName("password")[0].innerHTML;
   var cpassword=usertag[i].getElementsByTagName("cpassword")[0].innerHTML; */
    
    
	/*var Firstname = $('#Firstname').val();
	var lastName =  $('#lastName').val();
	var Mobileno =  $('#Mobileno').val();
	var username =  $('#username').val();
	var password =  $('#password').val();
	var cpassword =  $('#cpassword').val();*/
	
	
	
	
	
	/*$.ajax({
		Type : 'GET',
		url : 'edit',
		data : "Firstname="+Firstname+"&lastName="+lastName+"&Mobileno="+Mobileno+"&username="+username+"&password="+password+"&cpassword="+cpassword,
		success:
			function(response){
			if(response!= "Error")
				{
				window.location.href = "success.jsp";
//				showhtml(resposne);
				//shoeedithtml(response);
				}
			else{
				window.location.href = "Login.jsp";
			}
		}
	});*/
    
   // $('#data').css("display","none");
    /*$('#register').show();*/


}


function getUpdate(){
	
	
	var pk = $('#pk').val();
	var Firstname = $('#Firstname').val();
	var lastName =  $('#lastName').val();
	var Mobileno =  $('#Mobileno').val();
	var username =  $('#username').val();
	var password =  $('#password').val();
	var cpassword =  $('#cpassword').val();
	
	
	
	$.ajax({
		Type : 'GET',
		url : 'edit',
		data : "&pk="+pk +"&Firstname="+Firstname + "&lastName="+lastName +"&Mobileno="+Mobileno+"&username="+username +"&password="+password + "&cpassword=" +cpassword,
		success:
			function(response){
			if(response!= "Error")
				{
				
				cleardata();
				getSearch();
				
				}
			else{
				window.location.href = "Login.jsp";
			}
		}
	});
}
function cleardata(){
	 $('#pk').val("");
	 $('#Firstname').val("");
	 $('#lastName').val("");
	 $('#Mobileno').val("");
	 $('#username').val("");
	 $('#password').val("");
	 $('#cpassword').val("");
}

//getSearch()
function shoeedithtml(resposne){

	var bod = "";
	
	var text, parser, xmlDoc;

	text = resposne;
	parser = new DOMParser();
	xmlDoc = parser.parseFromString(text,"text/xml");
//	document.getElementById("data").innerHTML= xmlDoc.getElementsByTagName("usertag")[0].nodevalue();
		
		
var usertag =xmlDoc.getElementsByTagName("user");





/*var xml = response;
xmlDoc = $.parseXML(xml),
$xml = $(xmlDoc);*/



bod +="<table border='1s' cellpadding='30px' align='center' bordercolor='red'>";
bod +="<thead><tr><th>First Name</th><th>Last Name</th><th>User Name</th><th>Mobile </th><th>Password</th><th>Confirm Password</th><th>EDIT</th><th>DELETE</th></tr></thead>";
bod +="<tbody>";

bod +="<br><br><br><br>";
for(var i=0;i<usertag.length;i++)
	{
	
	bod +="<tr>";
	
	//var fname = usertag[i].getElementsByTagName('uusertag')[0].innerHTML;
	

	
	  var fname=usertag[i].getElementsByTagName("fname")[0].innerHTML;
	   var lname=usertag[i].getElementsByTagName("lname")[0].innerHTML;
      var username=usertag[i].getElementsByTagName("username")[0].innerHTML;
      var mobile=usertag[i].getElementsByTagName("mobile")[0].innerHTML;
      var password=usertag[i].getElementsByTagName("password")[0].innerHTML;
      var cpassword=usertag[i].getElementsByTagName("cpassword")[0].innerHTML; 
      
     
      
      /*bod +=fname;
      bod +=lname;
      bod +=username;
      bod +=mobile;
      bod +=password;
      bod +=cpassword;*/
      
      
      
      bod +="<td>"+fname+"</td>";
      bod +="<td>"+lname+"</td>";
      bod +="<td>"+username+"</td>";
      bod +="<td>"+mobile+"</td>";
      bod +="<td>"+password+"</td>";
      bod +="<td>"+cpassword+"</td>";
    
     
    
 
 
      bod +="</tr>";
	}


bod +="</tbody>";
bod +="</tr>";
//$('#register').css("display","none");
$('#data').html(bod);






}


/*function showXML(resposne){

	var bod = "";
	
	var text, parser, xmlDoc;

	text = resposne;
	parser = new DOMParser();
	xmlDoc = parser.parseFromString(text,"text/xml");
//	document.getElementById("data").innerHTML= xmlDoc.getElementsByTagName("usertag")[0].nodevalue();
		
		
var usertag =xmlDoc.getElementsByTagName("user");
var fname = document.getElementsByTagName("fname");
var lname = document.getElementsByTagName("lname");
var mobile = document.getElementsByTagName("mobile");
var user = document.getElementsByTagName("username");
var pass = document.getElementsByTagName("password");
var cpass = document.getElementsByTagName("cpassword");





var xml = response;
xmlDoc = $.parseXML(xml),
$xml = $(xmlDoc);



bod +="<table border='1s' cellpadding='30px' align='center' bordercolor='red'>";
bod +="<thead><tr><th>First Name</th><th>Last Name</th><th>User Name</th><th>Mobile </th><th>Password</th><th>Confirm Password</th></tr></thead>";
bod +="<tbody>";


for(var i=0;i<usertag.length;i++)
	{
	
	bod +="<tr>";
	
	//var fname = usertag[i].getElementsByTagName('uusertag')[0].innerHTML;
	

	
	  var fname=usertag[i].getElementsByTagName("fname")[0].innerHTML;
	   var lname=usertag[i].getElementsByTagName("lname")[0].innerHTML;
      var username=usertag[i].getElementsByTagName("username")[0].innerHTML;
      var mobile=usertag[i].getElementsByTagName("mobile")[0].innerHTML;
      var password=usertag[i].getElementsByTagName("password")[0].innerHTML;
      var cpassword=usertag[i].getElementsByTagName("cpassword")[0].innerHTML; 
      
      bod +=fname;
      bod +=lname;
      bod +=username;
      bod +=mobile;
      bod +=password;
      bod +=cpassword;
      
      
      
      bod +="<td>"+fname+"</td>";
      bod +="<td>"+lname+"</td>";
      bod +="<td>"+username+"</td>";
      bod +="<td>"+mobile+"</td>";
      bod +="<td>"+password+"</td>";
      bod +="<td>"+cpassword+"</td>";
      
      
     
      
      
      bod +="</tr>";
	}


bod +="</tbody>";
bod +="</table>";
//bod +="</tr>";
//$('#register').css("display","none");
$('#data').html(bod);




}
*/

function deleteuppp(){
	var usertag =xmlDoc.getElementsByTagName("user");
	var fname = usertag[i].getElementsByTagName("fname")[0].innerHTML;
	var lname=usertag[i].getElementsByTagName("lname")[0].innerHTML;
    var username=usertag[i].getElementsByTagName("username")[0].innerHTML;
    var mobile=usertag[i].getElementsByTagName("mobile")[0].innerHTML;
    var password=usertag[i].getElementsByTagName("password")[0].innerHTML;
    var cpassword=usertag[i].getElementsByTagName("cpassword")[0].innerHTML; 
  //  window.location.href = "Registraction.jsp";
	
    
    
    
    document.getElementById('Firstname').innerHTML=fname;
    document.getElementById('lastName').innerHTML=lname;
    
    document.getElementById('Mobileno').innerHTML=mobile;
    document.getElementById('username').innerHTML=username;
    document.getElementById('password').innerHTML=password;
    document.getElementById('cpassword').innerHTML=cpassword;
    
    
    //$('#data').css("display","none");
    $('#Firstname').val(fname);
    $('#lastName').val(lname);
    $('#Mobileno').val(mobile);
    $('#username').val(username);
    $('#password').val(password);
    $('#cpassword').val(cpassword);
    
    $('#register').show();
	
}


function deletedown(i){
	var usertag =xmlDoc.getElementsByTagName("user");
	var id=usertag[i].getElementsByTagName("id")[0].innerHTML;
	var fname = usertag[i].getElementsByTagName("fname")[0].innerHTML;
	var lname=usertag[i].getElementsByTagName("lname")[0].innerHTML;
    var username=usertag[i].getElementsByTagName("username")[0].innerHTML;
    var mobile=usertag[i].getElementsByTagName("mobile")[0].innerHTML;
    var password=usertag[i].getElementsByTagName("password")[0].innerHTML;
    var cpassword=usertag[i].getElementsByTagName("cpassword")[0].innerHTML; 
  //  window.location.href = "Registraction.jsp";
    
    document.getElementById('pk').value=id;
    document.getElementById('Firstname').value=fname;
    document.getElementById('lastName').value=lname;
    
    document.getElementById('Mobileno').value=mobile;
    document.getElementById('username').value=username;
    document.getElementById('password').value=password;
    document.getElementById('cpassword').value=cpassword;
    
    
    $('#data').css("display","none");
    $('#register').show();

}

function getdelete(i)
{
	
	var usertag =xmlDoc.getElementsByTagName("user");
	var id=usertag[i].getElementsByTagName("id")[0].innerHTML;
	var fname = usertag[i].getElementsByTagName("fname")[0].innerHTML;
	var lname=usertag[i].getElementsByTagName("lname")[0].innerHTML;
    var username=usertag[i].getElementsByTagName("username")[0].innerHTML;
    var mobile=usertag[i].getElementsByTagName("mobile")[0].innerHTML;
    var password=usertag[i].getElementsByTagName("password")[0].innerHTML;
    var cpassword=usertag[i].getElementsByTagName("cpassword")[0].innerHTML; 
  //  window.location.href = "Registraction.jsp";
    
    document.getElementById('pk').value=id;
    document.getElementById('Firstname').value=fname;
    document.getElementById('lastName').value=lname;
    
    document.getElementById('Mobileno').value=mobile;
    document.getElementById('username').value=username;
    document.getElementById('password').value=password;
    document.getElementById('cpassword').value=cpassword;
	
	
	
	var pk = $('#pk').val();
	var Firstname = $('#Firstname').val();
	var lastName =  $('#lastName').val();
	var Mobileno =  $('#Mobileno').val();
	var username =  $('#username').val();
	var password =  $('#password').val();
	var cpassword =  $('#cpassword').val();
	
	
	
/*	var username =  $('#username').val();
	var Mobileno =  $('#Mobileno').val();*/
	


	$.ajax({
		type : 'POST',
		url : 'Deleteuser',
		data : "&pk="+pk +"&Firstname="+Firstname + "&lastName="+lastName +"&Mobileno="+Mobileno+"&username="+username +"&password="+password + "&cpassword=" +cpassword,
		success :
			function(response){
			if(response!= "Error"){
				cleardata();
				getSearch();
			
			}
			else{
				window.location.href = "Login.jsp";
			}
		}
		
		
	})
	
	



}




function displayhhtml(resposne){

	var bod = "";
	var text, parser;
	text = resposne;
	
		
	parser = new DOMParser();
	xmlDoc = parser.parseFromString(text,"text/xml");
//	document.getElementById("data").innerHTML= xmlDoc.getElementsByTagName("usertag")[0].nodevalue();
		
		
var usertag =xmlDoc.getElementsByTagName("user");


bod +="<table border='1s' cellpadding='30px' align='center' bordercolor='red'>";
bod +="<thead><tr><th>ID</th><th>First Name</th><th>Last Name</th><th>User Name</th><th>Mobile </th><th>Password</th><th>Confirm Password</th><th>EDIT</th><th>DELETE</th></tr></thead>";
bod +="<tbody>";


for(var i=0;i<usertag.length;i++)
	{
	
	bod +="<tr>";
	
	var id=usertag[i].getElementsByTagName("id")[0].innerHTML;
	  var fname=usertag[i].getElementsByTagName("fname")[0].innerHTML;
	   var lname=usertag[i].getElementsByTagName("lname")[0].innerHTML;
      var username=usertag[i].getElementsByTagName("username")[0].innerHTML;
      var mobile=usertag[i].getElementsByTagName("mobile")[0].innerHTML;
      var password=usertag[i].getElementsByTagName("password")[0].innerHTML;
      var cpassword=usertag[i].getElementsByTagName("cpassword")[0].innerHTML; 

      
      bod +="<td>"+id+"</td>";
      bod +="<td>"+fname+"</td>";
      bod +="<td>"+lname+"</td>";
      bod +="<td>"+username+"</td>";
      bod +="<td>"+mobile+"</td>";
      bod +="<td>"+password+"</td>";
      bod +="<td>"+cpassword+"</td>";

      bod +="</tr>";
      
      
      
	}
bod +="</tbody>";
bod +="</tr>";
$('#register').css("display","none");
$('#data').html(bod);

}

//window.location.href = "success.jsp";




function Search(){
	
	//var id = $('#id').val();
	var hotel = $('#hotel').val();
	//var hotelname = $('#hotelname').val();
	var datepicker = $('#datepicker').val();
	var checkOut = $('#checkOut').val();
	var room = $('#room').val();
	var adults = $('#adults').val();
	var children = $('#children').val();
	//var citypincode = $('#citypincode').val();
	
	$.ajax({
		type : 'post',
		url : 'searchroom',
		data : "&hotel="+hotel+"&datepicker="+datepicker+"&checkOut="+checkOut+"&room+"+room+"&adults="+adults+"&children"+children,
		success : function(response){
			if(response!="Error")
				{
				ShowHotelSearch(response);
				}
			else{
				window.location.href = "HomePage.jsp";
			}
		}
	});
}

function Booking(){
	window.location.href ="HotelBookingRequest.jsp";
}

function ShowHotelSearch(response){
	
	var str = "";
	var text, parser, xmlDoc;
	text = response;
	parser = new DOMParser();
	xmlDoc = parser.parseFromString(text,"text/xml");
	
	var hotelstag = xmlDoc.getElementsByTagName("hotel");
	
/*	str +="<table border='1s' cellpadding='30px' align='center' bordercolor='red'>";
	str +="<tr style='color:blue;'>";
	str +="<th> HOTEL NAME </th>";
	str +="<th> city Name </th>";
	str +="<th> ROOM TYPE </th>";
	str +="<th> PRICE </th>";*/
	
	
	/*str +="<th> Room Type </th>";*/
	/*str +="<th> Price </th>";*/
	/*str +="</tr>";*/
	
		str +="<table border='1s' cellpadding='30px' align='center' bordercolor='red'>";
	str +="<thead><tr><th>SELECT HOTEL</th><th>HOTEL ID</th><th>city Name</th><th>Hotel NAme</th><th> HOTEL BOOK </th><th> BACK TO SEARCH PAGE </th></tr></thead>";
	str +="<tbody>";
	for(var i = 0; i<hotelstag.length;i++)
		{
		str +="<tr>";
		
		var Id = hotelstag[i].getAttribute("Id");
		var cityname = hotelstag[i].getAttribute("cityname");
		var hotelname = hotelstag[i].getAttribute("hotelname");
		//var price = hotelstag[i].getAttribute("price");
		//var price = hotelstag[i].getElementsByTagName("price")[0].innerHTML;
		
		//var hotel = hotelstag[i].getElementsByTagName("hotel")[0].innerHTML;
	/*	var hotelname = hotelstag[i].getElementsByTagName("hotelname")[0].innerHTML;
		var cityname = hotelstag[i].getElementsByTagName("cityname")[0].innerHTML;
		var roomtype = hotelstag[i].getElementsByTagName("roomtype")[0].innerHTML;
		var price = hotelstag[i].getElementsByTagName("price")[0].innerHTML;
		*/
		//var hotelname = hotelstag[i].getElementsByTagName("hotelname")[0].innerHTML;
		

		
		
		/*str +="<td>"+ i++ +"</td>";*/
		str +="<td><input type=radio name='select' id='select' value='"+hotelname+"' ></td>";
		str +="<td>"+ Id +"</td>";
		str +="<td>"+ cityname +"</td>";
		str +="<td>"+ hotelname +"</td>";
		//str +="<td>"+ price +"</td>";
		
		//str +="<td>"+ price +"</td>";
		
		str +="<td><input type='button' name='Book' id='Book'  value='Book' onclick='Booking()'></td>";
		str +="<td><input type='button' name='back1' id='back1' value='Modify' onclick=' showdAta()'></td>";
		//str +="<td><a onclick ='getEdit("+i+")'>EDIT</a></td>";
		//str +="<td><a onclick ='getdelete("+i+")'>DELETE</a></td>";
		
		
	
		/*str +="<td>"+ roomtype +"</td>";*/
		/*str +="<td>"+ price +"</td>";*/
		
		str +="</tr>";
		
		}
	str +="</tbody>";
	str +="</tr>";
	
	 $('#tt').css("display","none");

	$('#showBOOKdata').html(str);
	}
	
	//str +="<td><input type='button' name='Book' id='Book' value='Book'></td>";
	//str +="<td><input type='reset' name='back' id='back' value='back'></td>";
	
	function IDONTKNOW(){
	str +="</tbody>";
	str +="</tr>";
	
	 $('#tt').css("display","none");

	$('#showBOOKdata').html(str);
		
	 
}

function showdAta(){
	 
			        $('#showBOOKdata').hide();
			        $('#tt').show();
			 
}

/*function showResult(resultXml)
{
	  $('#dd').html('');
	 // $('#searchResult').html('');
   $("#searchResult tr").remove();
   $('#book').remove();
   $('#back1').remove();
  // var parser = new DOMParser();
  // var xmlDoc = parser.parseFromString(resultXml,"text/xml");
   var Hotel = resultXml.getElementsByTagName("Hotel");
   var html="";
   html+="<table id='searchResult' align='center'>";
   html+="<tr style='color:blue;'>";
   html+="<th>Sr.No</th>";
   html+="<th>Select Hotel</th>";
   html+="<th>Hotel Name</th>";
   html+="<th>City Name</th>";
   html+="<th>Room Type</th>";
   html+="<th>Price</th>";
   html+="</tr>";
   for(var i=0;i<Hotel.length;i++)
   {
       var hotelname = Hotel[i].getElementsByTagName("HotelName")[0].innerHTML;
       var cityname = Hotel[i].getElementsByTagName("CtName")[0].innerHTML;
       var roomtype = Hotel[i].getElementsByTagName("RoomType")[0].innerHTML;
       var price = Hotel[i].getElementsByTagName("Price")[0].innerHTML;
   
       html+="<tr>";
           html+="<td>"+(i+1)+"</td>";
           html+="<td><input type=radio name='select' id='select' value='"+hotelname+"' ></td>";
           html+="<td>"+hotelname+"</td>";
           html+="<td>"+cityname+"</td>";
           html+="<td>"+roomtype+"</td>";
           html+="<td>"+price+"</td>";
       html+="</tr>";
   }
   
   html+="<td><input type='button' value='Book' id='book' onclick='newFun()'></td>";
   html+="<td><input type='reset' value='Back' id='back1'></td>";
   html+="<tr ><span id='hotelRange'><input type='button' value='.....DO.. YOU WANT TO...Find Hotel IN yOURR RANGE...!!!!' id='lth' style='color:blue;'></span></tr>";
   html+="</table>"; 
   if(html!="")
	 {  
	    $('#tt').hide();
	    $('#dd').append(html);
	    $('#dd').show();
	  //  $("#box").append(html).show();
	 }
   $('#back1').click(function ()
   {
       $('#dd').hide();
       $('#tt').show();
   });
   
   
   $('#lth').click(function ()
   	    {
   	 $('#priceRangeModal').show();
   	        $('#tt').hide();
   	        $('#dd').show();
   	    });
       $('#cl').click(function ()
   	    {
   	 $('#priceRangeModal').hide();
   	 
   	    });
}*/

function showDataval(key){
//	$.('#hotel').m
	

	$.ajax({
		type : 'post',
		url :'CityServlet',
		data : "&key="+key,
		datatype : "Text",
		success :function(autoresponsexml)
		{

			var cityValue=new Array();
			var text, parser;
			text = autoresponsexml;
			parser = new DOMParser();
			xmlDoc = parser.parseFromString(text,"text/xml");

			/*var cityvalue = new Array();
			var parser = new DOMparser();
			var xmlDOC = parser.parseFromString(autoresponsexml,"text/xml");*/
			var city = xmlDoc.getElementsByTagName("city");
			for(var i = 0; i < city.length; i++)
			{
				var cityname = city[i].innerHTML;
				cityValue.push(cityname);
			}
			$( function(){
			
			$("#hotel").autocomplete({
				source: cityValue
				
			});
			});
			/*$( function(){
				var availableTags = cityValue;
				$("#hotel").autocomplete({
					source: availableTags
				});
			});*/
			mutti();
		}
	});
}

function mutti(){
	$('#room').multiSelect(
			{
				buttonWidth:'250px',
				enableFiltering: true,
				maxHeight : 200,
				enableCaseInsensitiveFiltring: true,
				IncludeSelectAllOption : true,
				filterPlaceholder:'cities',
				dropRight : true
			});
}
/*$('#room').multiSelect(
		{
			buttonWidth:'250px',
			enableFiltering: true,
			maxHeight : 200,
			enableCaseInsensitiveFiltring: true,
			IncludeSelectAllOption : true,
			filterPlaceholder:'cities',
			dropRight : true
		});*/
/*$.ajax({
    type:"POST",
     url:"CityServlet",
    data:{key:key},
    dataType:"text",
    success:function(createSuggestionXML)
    {
            var cityValue=new Array();
            var parser = new DOMParser();
            var xmlDoc = parser.parseFromString(createSuggestionXML,"text/xml");
            var city = xmlDoc.getElementsByTagName("city");
            for (var i = 0; i < city.length; i++)
            {
                var cityName =city[i].innerHTML;
                cityValue.push(cityName);
            }
            $( function() {
                var availableTags = cityValue;
                $( "#name" ).autocomplete({
                  source: availableTags
                });
              } );
    } 
    });   
*/



function Hotelbooking()
{
	var firstname = $('#firstname').val();
	var lastname = $('#lastname').val();
	var email = $('#email').val();
	var contact = $('#contact').val();
	var firstname1 = $('#firstname1').val();
	var lastname1 = $('#lastname1').val();
	
	$.ajax({
		type : 'POST',
		url : 'HotelBook',
		data :"&firstname="+firstname+"&lastname="+lastname+"&email="+email+"&contact="+contact+"&firstname1="+firstname1+"&lastname1"+lastname1,
		success : function(response)
		{
			if(response!="Error")
				{
				
				}
			else {
				
			}
		}
	});



}





function HCreate(){
	var hotelid = $('#hotelid').val();
	var hotelname = $('#hotelname').val();
	var city = $('#city').val();
	var room = $('#room').val();
	var price = $('#price').val();
	var datepicker = $('#datepicker').val();
	var datepicker1 = $('#datepicker1').val();
	
	
	$.ajax({
		type : 'GET',
		url : 'createhotel',
		data : "&hotelid="+hotelid+"&hotelname="+hotelname+"&city="+city+"&room="+room+"&price="+price+"&datepicker="+datepicker+"&datepicker1="+datepicker1,
		success : function(response){
			if(response !="Error")
				{
				window.location.href = "HomePage.jsp";
				}
			else
				{
				window.location.href = "Registraction.jsp";
				}
		}
	});
	
	
}

//function citycall(){
//
//	$.ajax({
//		type : 'post',
//		url : 'Getcity',
//		success   : function(Result){
//			if( Result == "Error")
//				{
//				
//				}
//			else
//				{
//				
//				}
//		}
//		
//		
//	});
//}

/*
function citycall(){

	$.ajax({
		type : 'post',
		url : 'Getcity',
		
		
		
	}).done(function(data){
		var a = data;
		var d = a.split(",");
		var length = d.length-1;
		var html = "<option value = ''>"
	});
}*/

