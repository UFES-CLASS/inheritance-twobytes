# Library Management System

## Developed By

- Nada  
- Laraib  

## Course

Object-Oriented Programming

---

## Overview

This project is a console-based Library Management System developed using Java.  
It demonstrates core Object-Oriented Programming (OOP) concepts such as encapsulation, inheritance, method overriding, and method overloading.

The system simulates real-world library operations including adding books, registering members, borrowing and returning books, maintaining records, and searching for books.

---

## Features

- Add new books to the system
- Register library members
- Borrow books with availability validation
- Return books and update status
- Track borrowing records
- Search for books
- Display system execution summary

---

## OOP Concepts Used

- **Encapsulation**: Private attributes with public methods
- **Inheritance**: `Member` and `Librarian` extend `Person`
- **Polymorphism**:
  - Method Overriding (`displayRole()`)
  - Method Overloading (`addBook(...)`)
- **Abstraction**: Base class `Person`

---

## Project Structure

src/
└── library/
├── Book.java
├── Member.java
├── Librarian.java
├── BorrowRecord.java
├── Person.java
└── Main.java

---

## How to Run

1. Open the project in VS Code or any Java IDE  
2. Compile all `.java` files  
3. Run `Main.java`  

---

## System Scenarios

The system demonstrates the following scenarios:

1. Add Book  
2. Register Member  
3. Borrow Book  
4. Attempt to Borrow Unavailable Book  
5. Return Book  
6. Display Borrow Record  
7. Search Book  

---

## Sample Output

The system produces structured console output showing all operations and a final execution summary.

---

## Documentation

All classes include:

- Class-level comments  
- Method-level documentation for key methods  

This ensures clarity, maintainability, and professional coding standards.

---

## Conclusion

This project successfully applies object-oriented principles to model a real-world library system.  
The design is modular, readable, and easily extendable for future enhancements.

---
