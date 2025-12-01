<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
    <title>Home Page</title>
    <link rel="stylesheet" href="/css/pages/home.css">
</head>
<body>

    <!-- NAVBAR -->
    <nav class="navbar">
        <h2>Hacker Movie Theater</h2>
    </nav>

	<!-- BACK BUTTON -->
	<div class="back-container">
		<a href="/home" class="back-btn">Back</a>
	</div>

    <!-- PAGE TITLE -->
    <div class="page-header">
        <h3>Now Showing</h3>
        <div class="line"></div>
    </div>

    <!-- FILTER BAR -->
    <div>
        <form action="/movies/filter" method="get" class="filter-bar">
            <select name="type">
                <option value="today">Today Movies</option>
                <option value="upcoming">Upcoming Movies</option>
            </select>
            <button type="submit" class="btn-blue">Filter</button>
        </form>
    </div>

    <!-- MOVIE GRID -->
    <div class="movie-container">
        <c:forEach var="movie" items="${movies}">
            <div class="movie-card">
                <h3>${movie.name}</h3>
                <p><strong>Language:</strong> ${movie.language}</p>
                <p><strong>Date:</strong> ${movie.date}</p>
                <p><strong>Start:</strong> ${movie.start}</p>
                <p><strong>End:</strong> ${movie.end}</p>
                <a href="/movies/theater?id=${movie.id}"><button class="btn">Book Ticket</button></a>
            </div>
        </c:forEach>
    </div>

</body>
</html>
