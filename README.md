# 📚 BroskiesHub Java Internship - Task 6

This is **Task 6** of the BroskiesHub Java Internship Program.

## 📝 Task Description

A Java console-based application that performs basic **CRUD operations (Create, Read)** on a **MySQL database** using **JDBC**. It allows users to:

- Insert new users
- Retrieve all users
- Retrieve a user by ID

This task demonstrates key concepts of **JDBC**, **database connectivity**, **resource management**, and **exception handling** in Java.

---

## 🎯 Objective

To understand and implement:
- **JDBC (Java Database Connectivity)**
- **Database connection management**
- **SQL operations using Java**
- **Prepared Statements** to prevent SQL injection
- **Scanner for console input**
- **Structured exception handling**

---

## 🧠 Concepts Covered

- JDBC and MySQL integration
- CRUD operations using Java
- Try-Catch-Finally for error handling
- Usage of `PreparedStatement` and `ResultSet`
- Resource cleanup using `finally`
- User interaction through CLI (Command Line Interface)

---

## ⚙️ Technologies Used

- Java
- MySQL
- JDBC
- OOP (Object-Oriented Programming)
- Exception Handling
- Prepared Statements
- Terminal
- IDE: VS Code

---

## 🛠️ Setup Instructions

1. Make sure MySQL is installed and running.
2. Create a database and table:
   ```plaintext
   CREATE DATABASE your_db_name;
   USE your_db_name;
   CREATE TABLE user (
    id INT,
    name VARCHAR(30),
    email VARCHAR(30)
   );
   ```
3. Update the database credentials in DriverConnection.java:
   ```plaintext
   private static final String USERNAME = "your_username", PASSWORD = "your_password", URL = "jdbc:mysql://localhost:your_port_id/your_db_name";
   ```
4. Compile and run the project using your IDE or terminal.

