<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
    <title>Theater</title>
    <link rel="stylesheet" href="/css/pages/theater.css">
</head>
<body>
<div class="container">
    <!-- Movie Name -->
    <h2 class="movie-title">${movie.name}</h2>


    <!-- Platinum -->
    <div class="section">
        <h3 class="section-title">Platinum</h3>
        <div class="rows">
            <c:forEach var="seat" items="${platinumSeats}">
				<form action="/seats/booking" method="post">
					<input type="hidden" name="movieId" value="${movie.id}">
					<input type="hidden" name="category" value="platinum"/>
                	<button class="seat" name="seatNo" value="${seat}">${seat}</button>
				</form>
            </c:forEach>
        </div>
    </div>
    <!-- Gold -->
    <div class="section">
        <h3 class="section-title">Gold</h3>
        <c:forEach var="row" items="${goldSeats}">
            <div class="rows">
                <c:forEach var="seat" items="${row}">
                	<form action="/seats/booking" method="post">
						<input type="hidden" name="movieId" value="${movie.id}">
						<input type="hidden" name="category" value="gold"/>
                		<button class="seat" name="seatNo" value="${seat}">${seat}</button>
					</form>
                </c:forEach>
            </div>
        </c:forEach>
    </div>
    <!-- Silver -->
    <div class="section">
        <h3 class="section-title">Silver</h3>
        <c:forEach var="row" items="${silverSeats}">
            <div class="rows">
                <c:forEach var="seat" items="${row}">
					<form action="/seats/booking" method="post">
						<input type="hidden" name="movieId" value="${movie.id}">
						<input type="hidden" name="category" value="silver"/>
                		<button class="seat" name="seatNo" value="${seat}">${seat}</button>
					</form>
                </c:forEach>
            </div>
        </c:forEach>
    </div>
	
	<div class="button-row">
	    <a href="/home" class="btn-custom btn-yellow">Back</a>
	    <a href="/seats/pay" class="btn-custom btn-blue">Pay</a>
	</div>

	
    <!-- Screen -->
    <div class="screen">SCREEN</div>
</div>
</body>
</html>
.