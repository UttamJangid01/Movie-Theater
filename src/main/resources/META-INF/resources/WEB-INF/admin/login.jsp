<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
    <title>Admin Login</title>
    <link rel="stylesheet" href="/css/admin/login.css">
</head>
<body>
    <div class="login-card">
        <h2>Admin Login</h2>
        <form action="/admin/login" method="post">
            <input type="text" name="name" placeholder="Username" required>
            <input type="password" name="password" placeholder="Password" required>
            <input type="submit" value="Login">
        </form>
    </div>
</body>
</html>
