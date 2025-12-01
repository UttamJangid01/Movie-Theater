🎬 Movie Theater Booking System – Spring Boot Project

A complete Movie Theater Booking System built using Spring Boot, JPA/Hibernate, JSP, and MySQL.
This project supports Admin movie management, User bookings, seat selection, and ticket generation.

🚀 Features
👨‍💼 Admin Panel

Add new movies

Update movie details

Delete movies

Manage Today’s & Upcoming movies

All movie data stored in MySQL

🎟️ User Panel

Filter movies based on:

Today's Movies

Upcoming Movies

Select seats from theater layout

Book multiple seats

Make payment

Generate ticket after payment

🧾 Ticket Includes:

Movie details

Date & time

Selected seats

Total price

🗄️ Technologies Used
Technology	Purpose
Java	Backend development
Spring Boot	Application framework
Spring MVC	Handling requests & views
JPA / Hibernate	Database ORM
MySQL	Database
JSP + JSTL	Frontend views
HTML / CSS	UI design

🗃️ Database (MySQL)
Tables Used:

movies – stores all movie details

booking – stores user seat bookings

payment – stores payment details

users (optional, if implemented)

All bookings, seats, movies, and payments are stored in the database.

▶️ How to Run the Project
1️⃣ Clone the project
git clone https://github.com/UttamJangid01/Movie-Theater.git

2️⃣ Open in IntelliJ / VS Code / Eclipse
3️⃣ Setup MySQL database

Create a database:

CREATE DATABASE theater;


Configure in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/Movietheater
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

4️⃣ Run the project
mvn spring-boot:run

5️⃣ Visit in browser
http://localhost:8080/

🎥 Watch the full video here:
https://www.linkedin.com/posts/uttam-jangid-a3093a277_i-built-a-complete-movie-theater-booking-activity-7401231282225217536-bxPu?utm_source=share&utm_medium=member_desktop&rcm=ACoAAEOXmEQBQe-4mvioNevqAH3ZEWW2xcgUWfA

🤝 Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

📬 Contact

If you want to collaborate or discuss improvements, feel free to connect.

LinkedIn: [https://www.linkedin.com/in/YOUR-LINKEDIN](https://www.linkedin.com/in/uttam-jangid-a3093a277/)

GitHub: [https://github.com/YOUR-GITHUB](https://github.com/UttamJangid01)
