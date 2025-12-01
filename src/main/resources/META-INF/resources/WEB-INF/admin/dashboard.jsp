<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
    <title>Dashboard Home Page</title>
    <link rel="stylesheet" href="/css/admin/dashboard.css">
</head>
<body>

    <div class="container">
        <form action="/admin/addMovie" method="post" class="form-card">

            <h2>Movie Details</h2>
			
			<input type="hidden" name="id" value="${movie.id}"/>

            <label>Name</label>
            <input type="text" name="name" value="${movie.name}" required>

            <label>Language</label>
            <input type="text" name="language" value="${movie.language}" required>

            <label>Date</label>
            <input type="date" name="date" value="${movie.date}" required/>

            <label>Starting Time</label>
            <input type="time" name="start" value="${movie.start}" required>

            <label>Ending Time</label>
            <input type="time" name="end" value="${movie.end}" required>

			<c:choose>
				<c:when test="${movie.id != null}"><button type="submit" class="btn">Update Movie</button></c:when>
				<c:otherwise><button type="submit" class="btn">Add Movie</button></c:otherwise>
			</c:choose>
        </form>
    </div>

    <div class="button-group">
        <a href="/home" class="btn-secondary">Home Page</a>
        <a href="/admin/movies" class="btn-secondary">View Movies</a>
    </div>

</body>
</html>
