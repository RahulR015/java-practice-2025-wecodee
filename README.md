# java-practice-2025-wecodee
# Project NO:1 Bank Account Management (Java)

This is a simple Java program to demonstrate object-oriented programming (OOP) concepts like encapsulation and method overloading.
It allows you to create a bank account, deposit money (both double and String formats), withdraw money, and check your balance.

# 🚀 Features

Create a bank account with an account number and initial balance

Deposit money using either:

deposit(double amount)

deposit(String amount)

Withdraw money from the account

Display the account balance and account number

# 📝 Code Structure
Main.java
BankAccount.java


Main.java – contains the main() method to execute the program

BankAccount.java – contains the BankAccount class with fields and methods for deposit, withdraw, and account details

# 📊 Sample Output

AccountNumber: 1789654321
Deposited: $1000.0
Deposited: 7000
Balance: 9000.0
Balance: 8000.0

# 📝 Concepts Covered

**Encapsulation** – private fields with public getters/setters

**Method Overloading** – deposit method overloaded for double and String types

**Basic I/O** – System.out for output


# Project NO:2 Bus Booking System (Java)

This is a **console-based Java application** that simulates a simple bus booking system.
It allows users to view available buses, book tickets for a specific date, and ensures seat availability before confirming a booking.

---

## 🚀 Features

* Display all available buses with details such as:

  * Bus number
  * AC availability
  * Seat capacity
* Book tickets for a specific bus on a chosen date
* Prevent overbooking by checking seat availability
* Handle multiple bookings efficiently

---

## 📝 How It Works

1. The program initializes a list of buses with predefined capacity and AC details.
2. Users can view all buses and their details.
3. Users are prompted to enter their name, select a bus, and specify a travel date.
4. The system checks if seats are available on the chosen bus and date.
5. If seats are available, the booking is confirmed; otherwise, the user is informed to choose another date or bus.


## 📊 Sample Output

* Display list of buses with bus number, AC availability, and capacity
* Success or failure messages for booking attempts
* Updated seat availability for selected buses


# 📝 Concepts Covered

* **Object-Oriented Programming (OOP)**

  * Classes (`Bus`, `Booking`)
  ***Encapsulation** (private fields with public methods)
* **ArrayList usage** for dynamic storage of buses and bookings
* **Date handling** using `SimpleDateFormat`
* **Method design** for checking availability



