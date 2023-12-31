# Mini cinema online application

## Content
* [ Description](#description)
* [ Features](#features)
* [ Technologies ](#technologies)
* [ Application run ](#application-run)
* [ Project structure ](#project-structure)

---

## *Description*

This is application for on-line cinema ticket booking.
As admin, you can add movies/cinema-halls/movie-sessions, also you can edit or delete movie-session
Register as user, and you can search for cinema-halls/movies/ available sessions/order Tickets.

---
## *Features*
- customer registration;
- customer authentication;
- created, update and remove movies;
- created, update and remove movie sessions;
- created, update and remove customers;
- roles for personal and customers (different permissions)
- display list of all movies;
- display list of all orders;
- display list of all cinema halls;
- give all info about orders by user;
- give all info about active movie sessions on requirement date;
- register your user and save their mails for further advertising companies.

---

## *Technologies*
- JDK 17
- Spring MVC
- Spring Security
- Hibernate 
- MySQL   v8.0.29
- TomCat  v9.0.75
- Maven
- GIT

---

## *Application run*
- Clone the project to your IDE from GitHub.
- Download/install MySQL 8.0.29 and TomCat v9.0.75.
- Create schema in MySQL workbench.
- Fill the db.properties file in resources folder.
- Build the project using Maven.
- Add Local Tomcat Server into run configuration
(click Fix -> taxi-service:war exploded -> set "/" in Deployment/Application context ).

---

## *Project structure*

![](cinema.png)