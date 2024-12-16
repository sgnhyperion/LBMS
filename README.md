# Library Management System Documentation

## Introduction
The Library Management System (LMS) is a software application designed to streamline and automate library operations. It provides functionalities for managing books, patrons, and lending records effectively.

## Features
1. *Book Management:*
   - Create, retrieve, update, and delete book details.
   - Search books by title, author, or genre.

2. *Patron Management:*
   - Add, update, and delete patron records.
   - List all books borrowed by a specific patron.
   -   (NOT SURE IF THIS IS IMPLEMENTED)

3. *Lending Management:*
   - Check-out and check-in books.
   - View all active lendings.

## Technology Stack
- *Framework:* Spring Boot
- *Database:* MySQL
- *ORM:* Hibernate
- *API Architecture:* RESTful

## Models
1. *Book:*
   - Attributes: ID (Auto Increment), title, author, genre, publication date, ISBN.

2. *Author:*
   - Attributes: ID (Auto Increment), name, List of Genres, List of Books

3. *Genre:*
   - Attributes: enum name.

4. *Patron:*
   - Attributes: patron ID, name, email, registration date.

5. *Lending:*
   - Attributes: lending ID, book ID, patron ID, date borrowed, due date.

## Cardinality Rules
- *Book - Author:* Many-to-One (Many books can have the same author).
- *Book - Genre:* Many-to-One (Many books can belong to the same genre).
- *Lending - Book:* Many-to-One (Many lendings can involve the same book).
- *Lending - Patron:* Many-to-One (Many lendings can be associated with the same patron).

## Implementation Details
- *CRUD Operations:* Implemented for Book, Patron, and Lending models.
- *Search Functionality:* Implemented for searching books by title, author, or genre.
- *Logging:* Logging is added for each CRUD operation to aid in debugging and monitoring.
- *Database Interaction:* Hibernate ORM is used for database interaction to ensure data integrity and simplify CRUD operations.

## Setup Instructions
1. Clone the repository.
2. Configure MySQL database settings in application.properties.
3. Run the application using Spring Boot.

## API Endpoints
1. *Books:*
   - GET /books
   - GET /books/title/{title}
   - GET /books/author/{name}
   - GET /books/genre/{genre}
   - POST /api/books/
   - PUT /api/books/{id}
   - DELETE /api/books/{id}
   - GET /api/books/search?title={title}&author={author}&genre={genre}

2. *Patrons:*
   - GET /api/patrons
   - GET /api/patrons/{id}
   - POST /api/patrons
   - PUT /api/patrons/{id}
   - DELETE /api/patrons/{id}
   - GET /api/patrons/{id}/books

3. *Lendings:*
   - GET /api/lendings
   - GET /api/lendings/{id}
   - POST /api/lendings
   - PUT /api/lendings/{id}
   - DELETE /api/lendings/{id}


## Conclusion
The Library Management System is a robust and efficient solution for managing library operations. With its user-friendly interface and comprehensive features, it enhances the efficiency and effectiveness of library management processes.
