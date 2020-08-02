<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>complete reservation</title>
</head>
<body>
<h2>Complete Reservation</h2>
Departure City: ${flight.departureCity}<br/>
Arrival City: ${flight.arrivalCity}<br/>
Airlines: ${flight.operatingAirlines}<br/>

<form action="" method="post">
<pre>
<h3>Passenger details:</h3>
First Name: <input type="text" name="passengerFirstName" />
Last Name: <input type="text" name="passengerLastName" />
Email: <input type="text" name="passengerEmail" />
Phone: <input type="text" name="passengerPhone" />

<h3>Card details:</h3>
Name on card: <input type="text" name="nameOnTheCard" />
Card number: <input type="text" name="cardNumber" />
Expiry Date: <input type="text" name="expirationDate" />
Three digit Code: <input type="text" name="securityCode" />

<input type="hidden" name="flightId" value="${flight.id}" />
<input type="submit" value="confirm"/>
</pre>
</form>
</body>
</html>