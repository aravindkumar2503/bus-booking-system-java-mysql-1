# java-project # Bus Booking System using Java and MySQL
# Java Bus Booking System 🚍

A simple **Java console-based Bus Booking System** with **JDBC and MySQL database integration**.

---

## 📌 Features

- Book tickets by entering passenger name, bus number, and travel date
- Check bus capacity before booking
- Store booking data in MySQL database
- Object-oriented design using classes (`bus`, `booking`)
- Simple and clean console UI

---

## 💻 Technologies Used

- Java
- JDBC (Java Database Connectivity)
- MySQL
- OOP (Object-Oriented Programming)

---

## 🗃️ Database Setup

1. Create a MySQL database named: `bus_db`
2. Create a table named: `booking`

```sql
CREATE DATABASE bus_db;

USE bus_db;

CREATE TABLE booking (
  passenger_name VARCHAR(50),
  bus_no INT,
  travel_date DATE
);


## 🧾 Output


![Screenshot 2025-05-04 223838](https://github.com/user-attachments/assets/3ee7c18f-040f-4f3a-87cc-7c4338408ba6)



