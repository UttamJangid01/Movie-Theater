<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
    <title>Movies Page</title>
    <link rel="stylesheet" href="/css/admin/movies.css">
</head>
<body>

    <div class="header">
        <h2>Movies List</h2>
    </div>

    <div class="container">

        <form action="/admin/filter" method="get" class="filter-bar">
            <select name="type">
                <option value="all">All Movies</option>
                <option value="today">Today Movies</option>
                <option value="upcoming">Upcoming Movies</option>
            </select>

            <button type="submit" class="btn btn-blue">Filter</button>
        </form>

        <table class="movie-table">
            <thead>
                <tr>
                    <th>S no.</th>
                    <th>Movie Name</th>
                    <th>Language</th>
                    <th>Date</th>
                    <th>Starting Time</th>
                    <th>Ending Time</th>
					<th></th>
					<th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="movie" items="${movies}" varStatus="loop">
                    <tr>
						<td>${loop.index + 1}</td>
                        <td>${movie.name}</td>
                        <td>${movie.language}</td>
                        <td>${movie.date}</td>
                        <td>${movie.start}</td>
                        <td>${movie.end}</td>
						<td>
							<a href="/admin/dashboard?id=${movie.id}">
								<button>Update</button>
							</a>
						</td>
						<td>
							<a href="/admin/delete?id=${movie.id}">
								<button>Delete</button>
							</a>
						</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        <div class="button-group">
            <a href="/admin/dashboard" class="btn btn-green">Back to Dashboard</a>
        </div>
    </div>

</body>
</html>
