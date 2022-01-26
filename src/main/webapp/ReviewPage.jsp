<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "input" ).checkboxradio();
  } );
  </script>

  <script>
function myFunction() {
  alert("Thank you For Your Valuable FeedBack!");
}
</script>
  <style>
body, html {
  height: 100%;
  font-family: Arial, Helvetica, sans-serif;
}
 {
  box-sizing: border-box;
}

.bg-img {

  background-image: url("feedback-2044700__340.jpg");

  min-height: 654px;

 
  background-position: center;
  background-repeat: no-repeat;
  background-size: full;
  position: relative;
}


.container {
  position: absolute;
  right: 0;
  margin: 20px;
  max-width: 300px;
  padding: 16px;
  background-color: white;
}

.btn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.btn:hover {
  opacity: 1;
}
</style>
</head>
<body>
<div class="bg-img">
<script src="vald.js" type="text/javascript"></script>
<script src="myAjax.js" type="text/javascript"></script>
<div class="widget">
  <table align="center"><h2></h2>

<tr>
<td><h2>Add A review</h2></td>
</tr>


<tr>
<td><textarea rows="4" cols="42" style="font-weight: bold;"></textarea></td>
</tr>
<tr>
 <td><fieldset>
    <legend>Hotel Ratings: </legend>
    <label for="checkbox-1">2 Star</label>
    <input type="checkbox" name="checkbox" id="checkbox1">
    <label for="checkbox-2">3 Star</label>
    <input type="checkbox" name="checkbox" id="checkbox2">
    <label for="checkbox-3">4 Star</label>
    <input type="checkbox" name="checkbox" id="checkbox3">
    <label for="checkbox-4">5 Star</label>
     <input type="checkbox" name="checkbox" id="checkbox4">
     </fieldset></td></tr>
    <tr>
    <td><input type="submit" value="Submit" onclick="myFunction()"></td>
    </tr>
     </table>
     
     <table align="center">
<tr>
<td><a href="HomePage.jsp" style="FONT-SIZE: medium;color: green" ><h3>Go To Home Page</h3></a></td>
</tr>
</table>
</body>
</html>