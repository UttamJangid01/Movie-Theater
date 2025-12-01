<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
    <title>Home Page</title>
    <link rel="stylesheet" href="/css/home.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
</head>
<body>
    <div class="home-container">
        <h1>Welcome to Movie Portal</h1>
        <p>Select your page:</p>
        <div class="options">
            <a href="/admin/login" class="card">
                <i class="fa-solid fa-user-shield fa-3x"></i>
                <h2>Admin Page</h2>
                <p>Manage movies, users and more</p>
            </a>
            <a href="/movies/home" class="card">
                <i class="fa-solid fa-film fa-3x"></i>
                <h2>Movies Page</h2>
                <p>Check latest movies and showtimes</p>
            </a>
        </div>
    </div>
</body>
</html>
