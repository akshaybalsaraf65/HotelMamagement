<%-- <%@page import="com.sun.xml.internal.bind.v2.WellKnownNamespace"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Booking Here</title>


</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h1>Here BOOKING HOTEL</h1>

<div>
<%-- <%

String hotelname = (String)session.getAttribute("hotelname");
String hotel = (String)session.getAttribute("hotel");


out.print("welcome"+hotel);

%> --%>

<h1 align="center">Traveller Information</h1>

  <div class="form-group">
  <label>First Name :</label>
  <select name="title" id="title">
                    <option value="Mr">Mr </option>
                    <option value="Mrs"> Mrs</option>
                    <option value="Ms">Ms </option>
                    <br>

    <input type="text" id="fname">
  </div>
  <div class="form-group">
    <label for="lname">Last Name:</label>
    <input type="text" class="form-control" id="lname">
  </div>
   <div class="form-group">
    <label for="email">Email address:</label>
    <input type="email" class="form-control" id="email">
  </div>
  <div class="form-group">
    <label for="contact">Contact Info:</label>
    <input type="text" class="form-control" id="contact">
  </div>
  
  
  <button type="submit" class="btn btn-primary">Pay Now</button>

<table align="center">
<tr>
<td><a href="ReviewPage.jsp" style="FONT-SIZE: medium;color: green" ><h3>ADD A REVIEW</h3></a></td>
</tr>
</table>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>