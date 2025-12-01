<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <title>Golden Movie Ticket</title>
    <link rel="stylesheet" href="/css/pages/pay.css">
</head>

<body>

    <div class="ticket">

        <div class="inner">
            <div class="title">MOVIE TICKET</div>

            <div class="row">
                <div class="label">Movie</div>
                <div class="value">${sessionScope.movie.name}</div>
            </div>

            <!-- Seat Table -->
            <div class="seat-box">
                <table class="seat-table">
                    <thead>
                        <tr>
                            <th>Category</th>
                            <th>Seat</th>
							<th>Price</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="s" items="${seat}">
                            <tr>
                                <td>${s.category}</td>
                                <td>${s.seatNo}</td>
								<td>${s.price}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>

            <div class="row">
                <div class="label">Date</div>
                <div class="value">${sessionScope.movie.date}</div>
            </div>

            <div class="row">
                <div class="label">Time</div>
                <div class="value">${sessionScope.movie.start} To ${sessionScope.movie.end}</div>
            </div>

            <div class="row">
                <div class="label">Price</div>
                <div class="value" style="font-weight:bold; font-size:20px;">₹${price}</div>
            </div>

            <div class="cut-line"></div>

            <div class="row" style="font-size:18px;">
                <div class="label">Total</div>
                <div class="value" style="font-weight:bold; font-size:20px;">₹${total}</div>
            </div>

            <div class="footer">Admit One • Scan at Entrance</div>
        </div>
    </div>

</body>
</html>
