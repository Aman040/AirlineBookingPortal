<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Get Avilable Flights</title>
</head>
<body>
<fieldset style="background-color: powderblue;" >
<legend style="text-align: center; "><h1>Flight Details</h1></h2></legend>
<form method="post" action="AvilableFlights">
<label style="font-size: 40px;">Select Airline</label>
<select id="airline" name="airline" style="max-width: 80%">
<option style="font: bold;">Airlines -  Price</option>
<option value="1"><p>AirIndia -</p><p> 5000.00</p></option>
<option value="2"><p>SpiceJet -</p><p> 5500.00</p></option>
<option value="3"><p>GoAir    -</p><p> 4000.00</p></option>
<option value="4"><p>Indigo   -</p><p> 4500.00</p></option>
<option value="5"><p>Vistara  -</p><p> 7000.00</p></option>
<option value="6"><p>AirAsia  -</p><p> 4800.00</p></option>

</select>
<button value="submit">Submit</button>
</form>
</fieldset>
</body>
</html>