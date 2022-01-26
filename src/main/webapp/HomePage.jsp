<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
<link rel="stylesheet" href="style.css">

  <script src="http://code.jquery.com/jquery-3.1.1.slim.min.js"></script>
<script src="http://src/jquery.multi-select.js"></script> 
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
  
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div id="dd" class="dd" style="color:blue;">
</div>
 <div id="tt">


<h1>Book Domestic AND International Hotels</h1>



                    <!-- <form action="#" method="post"> -->
                       <div class="background">
                        <div class="row justify-content-between align-items-end">
                        <input type="hidden" name="Hid" id="Hid">
                        
                        <div class="autocomplete" style="width:300px;">
                                <label for="hotel"> CITY/HOTEL/AREA</label>
                                <input type="text" placeholder="Search City" class="form-control" id="hotel"  name="hotel" style="color:red;font-weight:bold" onkeyup="showDataval(value)" >
                                <div id="hotel1"></div>
                            </div>
                           <input type="hidden" name="StarRate" id="StarRate">
                           <input type="hidden" name="Price" id="Price">
                           <input type="hidden" name="CID" id="CID"> 
                           <input type="hidden" name="CNAME" id="CNAME"> 
                          
                            <div class="#"> 
                                <label for="checkIn">Check In</label>
                                <input type="text" class="fa-calendar form-control"  id="datepicker" name="datepicker">
                            </div>
                            <div class="#">
                                <label for="checkOut">Check Out</label>
                                <input type="text" class="form-control" id="checkOut" name="checkOut">
                            </div> 
                            <div class="#">
                                <label for="room">Room</label>
                                <select name="room" id="room" class="form-control">
                                    <option value="01">01</option>
                                    <option value="02">02</option>
                                    <option value="03">03</option>
                                    <option value="04">04</option>
                                    <option value="05">05</option>
                                    <option value="06">06</option>
                                    <option value="07">07</option>
                                    <option value="08">08</option>
                                    <option value="09">09</option>
                                    <option value="10">10</option>
                                </select>
                            </div>
                            <div class="#">
                                <label for="adults">Adult</label>
                                <select name="adults" id="adults" class="form-control">
                                    <option value="01">01</option>
                                    <option value="02">02</option>
                                    <option value="03">03</option>
                                    <option value="04">04</option>
                                    <option value="05">05</option>
                                    <option value="06">06</option>
                                    <option value="07">07</option>
                                    <option value="08">08</option>
                                    <option value="09">09</option>
                                    <option value="10">10</option>
                                </select>
                            </div>
                            <div class="#">
                                <label for="children">Children</label>
                                <select name="children" id="children" class="form-control" onchange="SelectAge()">
                                	<option value="0">0</option>
                                    <option value="01">01</option>
                                    <option value="02">02</option>
                                    <option value="03">03</option>
                                    <option value="04">04</option>
                                    <option value="05">05</option>
                                    <option value="06">06</option>
                                    <option value="07">07</option>
                                    <option value="08">08</option>
                                    <option value="09">09</option>
                                    <option value="10">10</option>
                                </select>
                            </div>
                            <div id="AgeSelect1" style="display: none;">
                            <label>Child Age : 1</label>
                            <select name="children" id="child" class="form-control">
                                    <option value="01">01</option>
                                    <option value="02">02</option>
                                    <option value="03">03</option>
                                    <option value="04">04</option>
                                    <option value="05">05</option>
                                    <option value="06">06</option>
                                    <option value="07">07</option>
                                    <option value="08">08</option>
                                    <option value="09">09</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                </select>
                            
                            </div>
                            
                             <div id="AgeSelect2" style="display: none;">
                            <label>Child Age : 2</label>
                            <select name="children" id="child2" class="form-control">
                                    <option value="01">01</option>
                                    <option value="02">02</option>
                                    <option value="03">03</option>
                                    <option value="04">04</option>
                                    <option value="05">05</option>
                                    <option value="06">06</option>
                                    <option value="07">07</option>
                                    <option value="08">08</option>
                                    <option value="09">09</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                </select>
                            
                            </div>
                            
                            
                                 <div id="AgeSelect3" style="display: none;">
                            <label>Child Age : 3</label>
                            <select name="children" id="child2" class="form-control">
                                    <option value="01">01</option>
                                    <option value="02">02</option>
                                    <option value="03">03</option>
                                    <option value="04">04</option>
                                    <option value="05">05</option>
                                    <option value="06">06</option>
                                    <option value="07">07</option>
                                    <option value="08">08</option>
                                    <option value="09">09</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                </select>  
                            </div>
                            
                                 <div id="AgeSelect4" style="display: none;">
                            <label>Child Age : 4</label>
                            <select name="children" id="child2" class="form-control">
                                    <option value="01">01</option>
                                    <option value="02">02</option>
                                    <option value="03">03</option>
                                    <option value="04">04</option>
                                    <option value="05">05</option>
                                    <option value="06">06</option>
                                    <option value="07">07</option>
                                    <option value="08">08</option>
                                    <option value="09">09</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                </select>
                            </div>
                            
                                 <div id="AgeSelect5" style="display: none;">
                            <label>Child Age : 5</label>
                            <select name="children" id="child2" class="form-control">
                                    <option value="01">01</option>
                                    <option value="02">02</option>
                                    <option value="03">03</option>
                                    <option value="04">04</option>
                                    <option value="05">05</option>
                                    <option value="06">06</option>
                                    <option value="07">07</option>
                                    <option value="08">08</option>
                                    <option value="09">09</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                </select>
                            </div>
                            
                                 <div id="AgeSelect6" style="display: none;">
                            <label>Child Age : 6</label>
                            <select name="children" id="child2" class="form-control">
                                    <option value="01">01</option>
                                    <option value="02">02</option>
                                    <option value="03">03</option>
                                    <option value="04">04</option>
                                    <option value="05">05</option>
                                    <option value="06">06</option>
                                    <option value="07">07</option>
                                    <option value="08">08</option>
                                    <option value="09">09</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                </select>
                            </div>
                            
                                 <div id="AgeSelect7" style="display: none;">
                            <label>Child Age : 7</label>
                            <select name="children" id="child2" class="form-control">
                                    <option value="01">01</option>
                                    <option value="02">02</option>
                                    <option value="03">03</option>
                                    <option value="04">04</option>
                                    <option value="05">05</option>
                                    <option value="06">06</option>
                                    <option value="07">07</option>
                                    <option value="08">08</option>
                                    <option value="09">09</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                </select>
                            </div>
                            
                                 <div id="AgeSelect8" style="display: none;">
                            <label>Child Age : 8</label>
                            <select name="children" id="child2" class="form-control">
                                    <option value="01">01</option>
                                    <option value="02">02</option>
                                    <option value="03">03</option>
                                    <option value="04">04</option>
                                    <option value="05">05</option>
                                    <option value="06">06</option>
                                    <option value="07">07</option>
                                    <option value="08">08</option>
                                    <option value="09">09</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                </select>
                            </div>
                            
                                 <div id="AgeSelect9" style="display: none;">
                            <label>Child Age : 9</label>
                            <select name="children" id="child2" class="form-control">
                                    <option value="01">01</option>
                                    <option value="02">02</option>
                                    <option value="03">03</option>
                                    <option value="04">04</option>
                                    <option value="05">05</option>
                                    <option value="06">06</option>
                                    <option value="07">07</option>
                                    <option value="08">08</option>
                                    <option value="09">09</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                </select>
                            </div>
                            
                                 <div id="AgeSelect10" style="display: none;">
                            <label>Child Age : 10</label>
                            <select name="children" id="child2" class="form-control">
                                    <option value="01">01</option>
                                    <option value="02">02</option>
                                    <option value="03">03</option>
                                    <option value="04">04</option>
                                    <option value="05">05</option>
                                    <option value="06">06</option>
                                    <option value="07">07</option>
                                    <option value="08">08</option>
                                    <option value="09">09</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                </select>
                            </div>
                             </div>
                             
                            <div class="#">
                            <br><br><br><br>
                                <button type="submit" class="form-control btn roberto-btn" id="btnstyle" onclick="Search()" >Check Availability</button>
                            </div>
                           </div> 
                       
                    <!-- </form> -->
      <br><br>
      </div>
      <div class="backgroundhotel">
      <div id="showBOOKdata"></div>
      </div>
      <br><br>
      <div class="hero-image">
      </div>
      <br><br>
      
      <div style="background-color: #F5F5F5">
      
      <h1 style="text-align: center; ">Welcome To Our Hotel</h1>
      
      <p>
      When you get into a hotel room, you lock the door, and you know there is a secrecy, there is a luxury, there is fantasy. There is comfort. There is reassurance.
      I just want to stay in my hotel room, read my book. I enjoy that private time.
      When you come to a hotel room, you want it to be grand, functional and beautiful. But you don't want things that are not useful. Sometimes you go to hotels and there are all these frames and pictures of people you don't know, and you end up hiding everything in the drawer, and then housekeeping come and put it out again.
      If I go on summer vacation, I'd make a funny video about it for YouTube. For Instagram I'd show the gorgeous pictures. Snapchat is for the little side moments, like the hotel room, the food. Twitter is for whatever thoughts that come to mind about the vacation.
      </p>
      </div>
      
     
      <div>
      <h1 style='font-size:50px;color:red;text-align: center'><i>Hotel Facility</i></h1>
      <br><br>
     <i class="fas fa-swimming-pool"  style='font-size:100px;color:red;position: absolute;left: 300px;'></i>
<i class="fas fa-user-md" style='font-size:100px;color:red;position: absolute;left: 600px;'></i>
<i class="fas fa-fire-extinguisher" style='font-size:100px;color:red;position: absolute;left: 900px;'></i>
<br><br><br><br><br><br>
<label style='font-size:20px;color:red;position: absolute;left: 300px;'>Swimming Pool</label>
<label style='font-size:20px;color:red;position: absolute;left: 610px;'>Doctor</label>
<label style='font-size:20px;color:red;position: absolute;left: 900px;'>Fire Exit</label>
<br><br><br>
<i class="fas fa-dumbbell" style='font-size:100px;color:red;position: absolute;left: 300px;'></i>
<i class="fas fa-wifi" style='font-size:100px;color:red;position: absolute;left: 600px;'></i>
<i class="fas fa-broom" style='font-size:100px;color:red;position: absolute;left: 900px;'></i>
<br><br><br><br><br><br>
<label style='font-size:20px;color:red;position: absolute;left: 340px;'>GYM</label>
<label style='font-size:20px;color:red;position: absolute;left: 640px;'>WiFi</label>
<label style='font-size:20px;color:red;position: absolute;left: 900px;'>House Keeping</label>
      </div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  

<script type="text/javascript" src="validatemethod.js"></script>

<script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  </script>
  <script>
  $( function() {
    $( "#checkOut" ).datepicker();
  } );
  </script>
<!--  muliselect-->
  
  
</html>