<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Create Hotel-Here</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker.min.css" rel="stylesheet"/>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"></head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="validatemethod.js"></script>


<style>
    .hero{
        background-color: azure;
    }

</style>

</head>


<body>
<jsp:include page="header.jsp"></jsp:include>
  <div class="jumbotron text-center">
  <h1>Create Hotel</h1>
  <p>Come aboard India's No. 1 travel company & unfold infinite possibilities of growth.</p>
</div>
    <div class="hero">


<table align="center">
    
        <input type="hidden" name="hotelid" id="hotelid">
    <tr>
    <td>
                <div class="form-group">
                    <label for="HotelName">Hotel Name:</label>
                    <input type="text" class="form-control" id="hotelname" name="hotelname">
                </div>
    </td>
    </tr>



     <tr>
    <td>
                <div class="form-group">
                    <label for="City">City:</label>
                    <select class="form-control" name="city" id="city">
                    <option>Please Select </option>
                    <option value="jalgov"> jalgov</option>
                    <option value="mumbai">Mumbai </option>
                    <option value="nashik">Nashik </option>
                    <option value="nagpur">Nagpur </option>
                    <option value="pune">Pune </option>
                   
                    </select>

                </div>
    </td>
    </tr>



     <tr>
    <td>
                <div class="form-group">
                    <label for="Room">Room:</label>
                    <input type="text" class="form-control" id="room" name="room">
                </div>
    </td>
    </tr>



     <tr>
    <td>
                <div class="form-group">
                    <label for="price">Price:</label>
                    <input type="text" class="form-control" id="price" name="price">
                </div>
    </td>
    </tr>


    <tr>
    <td>


                              <main class="container">
                                <div class="form-group">
                                        <label>Issue Date : </label>
                                        <input data-date-format="dd/mm/yyyy" class="form-control" id="datepicker" name="datepicker">
                                </div>
                            </main>

        </td>
        <td>




                           <main class="container">
                             <div class="form-group">
                                    <label>Expire Date : </label>
                                    <input data-date-format="dd/mm/yyyy" class="form-control" id="datepicker1" name="datepicker1">
                            </div>
                            </main>


    </td>
    </tr>



        <tr>
        <td>
        
        <button type="submit" class="btn btn-primary mb-2" onclick="return HCreate()">Create Hotel</button>
        </td>
        </tr>
    

</table>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<!-- <script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  </script>
  <script>
  $( function() {
    $( "#datepicker1" ).datepicker();
  } );
  </script> -->


 <style type="text/css">
        // solution 1:
        .datepicker {
            font-size: 0.875em;
        }
        /* solution 2: the original datepicker use 20px so replace with the following:*/

        .datepicker td, .datepicker th {
            width: 1.5em;
            height: 1.5em;
        }

    </style>
<script type="text/javascript">
    $('#datepicker').datepicker({
        weekStart: 1,
        daysOfWeekHighlighted: "6,0",
        autoclose: true,
        todayHighlight: true,
    });
    $('#datepicker').datepicker("setDate", new Date());
</script>



    <style type="text/css">
        // solution 1:
        .datepicker1 {
            font-size: 0.875em;
        }
        /* solution 2: the original datepicker use 20px so replace with the following:*/

        .datepicker1 td, .datepicker th {
            width: 1.5em;
            height: 1.5em;
        }

    </style>
<script type="text/javascript">
    $('#datepicker1').datepicker({
        weekStart: 1,
        daysOfWeekHighlighted: "6,0",
        autoclose: true,
        todayHighlight: true,
    });
    $('#datepicker1').datepicker("setDate", new Date());
</script> 

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>