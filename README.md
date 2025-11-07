# Student Management System – Spring Boot Web Application

## Overview

This project is a simple **Student Management System** built using the **Spring Boot framework**.  
It demonstrates basic **CRUD operations (Create, Read, Update, Delete)** through RESTful APIs and a lightweight **HTML + JavaScript** frontend.

The backend uses **Spring MVC**, **Dependency Injection**, and an **in-memory data structure**, making it fast to run and easy to understand — ideal for beginners exploring Spring Boot concepts.

---

## Features

- Built with **Spring Boot** (no external server setup required)  
- Exposes RESTful API endpoints for student management  
- Simple **HTML interface** using Fetch API for frontend  
- Fully functional **Create, Read, Delete** operations  
- In-memory storage (no database dependency)

---

## Technologies Used

| Technology | Purpose |
|-------------|----------|
| Java 17 | Core programming language |
| Spring Boot | Framework for REST API development |
| Maven | Build and dependency management |
| HTML, CSS, JavaScript | Frontend structure and styling |
| Embedded Tomcat | Web server (default in Spring Boot) |

---

## Project Structure

student-management-springboot/ 
│ 
├── src/main/java/com/example/studentapp/ 
│ ├── Student.java 
│ ├── StudentService.java 
│ ├── StudentController.java 
│ └── StudentAppApplication.java 
│ 
├── src/main/resources/ 
│ ├── static/ 
│ │ └── index.html 
│ └── application.properties 
│ 
├── pom.xml 
└── README.md 



---

## Endpoints

| HTTP Method | Endpoint | Description |
|--------------|-----------|--------------|
| `GET` | `/students` | Fetch all students |
| `GET` | `/students/{id}` | Fetch student by ID |
| `POST` | `/students` | Add a new student |
| `PUT` | `/students/{id}` | Update a student |
| `DELETE` | `/students/{id}` | Delete a student |

---

## How to Run the Project

### 1. Prerequisites
- Java 17 or higher  
- Maven installed (included via Spring Initializr)  
- VS Code or IntelliJ  

### 2. Clone the Repository
```bash
git clone https://github.com/YOUR_USERNAME/student-management-springboot.git
cd student-management-springboot
```
### 3. Run the application
```bash
./mvnw spring-boot:run
```
Server starts on:
```
http://localhost:8080
```
You’ll see a simple UI to view, add, and delete students on the browser.


### Future Improvements

- Add PUT (Update) functionality to edit student details.

- Connect to a MySQL database using Spring Data JPA.

- Improve frontend styling using Bootstrap or React.js.

- Containerize the app with Docker for easy deployment.

### Author

**Rakshit Bansal**
