<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>display flights</title>
</head>
<body>
<h2>Display flight details: </h2>
<table>
<tr>
<th>Airlines</th>
<th>Departure city</th>
<th>Arrival city</th>
<th>Departure time</th>
</tr>

<c:forEach items="${flights}" var="flight">
<tr>
<td>${flight.operatingAirlines}</td>
<td>${flight.departureCity}</td>
<td>${flight.arrivalCity}</td>
<td>${flight.estimatedDepartureTime}</td>
<td><a href="showReservations?flightId=${flight.id}">Select</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>