<p align="center">
  <img src="https://img.shields.io/badge/Bank%20Management%20System-Java%20Swing%20%7C%20MySQL-blue?style=for-the-badge" />
</p>

<h1 align="center">🏦 Bank Management System (ATM Simulation)</h1>

<p align="center">
A desktop-based ATM banking application developed using <b>Java, Swing, JDBC, and MySQL</b>.
</p>

---

## 🚀 Project Overview

This project is a **Java Swing–based Bank Management System** that simulates real-world ATM operations.  
It allows users to create accounts, log in securely using a PIN, and perform banking operations such as deposits, withdrawals, balance enquiries, and transaction tracking.

This project demonstrates:
- Core Java & OOP concepts
- Swing GUI development
- JDBC-based MySQL connectivity
- CRUD operations with real database persistence

---

## ✅ Features

- User Login with PIN authentication  
- Multi-step Account Registration  
- Deposit Money  
- Withdraw Money  
- Fast Cash Withdrawal  
- Balance Enquiry  
- Mini Statement (Recent Transactions)  
- PIN Change Facility  
- Transaction History  
- Swing-based GUI with icons  
- MySQL database integration using JDBC  

---

## 📂 Project Structure
src/
├── bank/
│   ├── db/
│   │   └── Conn.java
│   │
│   ├── ui/
│   │   ├── Login.java
│   │   ├── SignupOne.java
│   │   ├── SignupTwo.java
│   │   ├── SignupThree.java
│   │   ├── Transactions.java
│   │   ├── Deposit.java
│   │   ├── Withdraw.java
│   │   ├── FastCash.java
│   │   ├── BalanceEnquiry.java
│   │   ├── MiniStatement.java
│   │   └── PinChange.java
│   │
│   └── model/
│       └── Transaction.java
│
└── resources/
    └── icons/
        ├── atm.jpg
        └── logo.jpg



---

## 🏷️ Tech Stack

- **Programming Language:** Java  
- **GUI:** Java Swing  
- **Database:** MySQL  
- **Database Connectivity:** JDBC  
- **IDE:** Eclipse / IntelliJ IDEA  

---

## 🔧 How to Run the Project

1. Clone the repository  
2. Open the project in **Eclipse** or **IntelliJ IDEA**  
3. Create a MySQL database (example name: `bankmanagementsystem`)  
4. Import required tables manually or via SQL script  
5. Update database credentials in `Conn.java`  
6. Add MySQL Connector JAR to project classpath  
7. Run `Login.java`  

---

## 📸 Screenshots

<img width="985" height="613" alt="login" src="https://github.com/user-attachments/assets/5c20991d-a8a8-464a-a63d-1d5947f034a9" />
<img width="1042" height="988" alt="signupone" src="https://github.com/user-attachments/assets/57817e89-385b-411b-a3bd-1d4a5b321269" />
<img width="1042" height="983" alt="signuptwo" src="https://github.com/user-attachments/assets/9ee8f55b-d9aa-44d2-8afd-e61898cca9d3" />
<img width="1123" height="1017" alt="transaction" src="https://github.com/user-attachments/assets/bee61f55-1287-4d72-802f-0e93d76a1347" />
<img width="1105" height="1010" alt="withdrawl" src="https://github.com/user-attachments/assets/4b3c8a4e-3458-48d4-9131-508de0821b72" />


  

---

## 📌 Future Enhancements

- PIN encryption using hashing algorithms  
- Admin dashboard  
- JavaFX-based modern UI  
- PDF/Excel export for transactions  
- Improved exception handling  
- MVC architecture implementation  

---

## 📘 Resume / GitHub Description

> Developed a Java Swing–based Bank Management System with MySQL using JDBC. Implemented secure user authentication, multi-step account registration, deposit and withdrawal operations, fast cash, balance enquiry, PIN change, and transaction tracking with real-time database persistence.

---

## ⚠️ Disclaimer

This project is intended for **educational purposes** to demonstrate Java desktop application development and database connectivity.  
It is **not intended for real banking use**.


