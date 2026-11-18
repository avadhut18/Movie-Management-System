# Movie Management System

A simple console-based Java application for managing a collection of movies. It demonstrates object-oriented programming and CRUD (Create, Read, Update, Delete) operations using an `ArrayList`.

## Features

- Add a movie with an ID, name, genre, and rating
- View all movies in the current session
- Update a movie by its ID
- Delete a movie by its ID
- Menu-driven command-line interface

## Project Structure

```text
Movie-Management-System/
├── MovieManagemant/
│   ├── Main.java
│   ├── Movie.java
│   └── MovieService.java
├── .gitignore
└── README.md
```

## Requirements

- Java JDK 8 or later

## Run the Application

Open a terminal in the repository root and run:

```bash
javac MovieManagemant/*.java
java MovieManagemant.Main
```

## Data Storage

Movies are stored in an in-memory `ArrayList`. The data is available only while the application is running and is not saved to a database or file.

## Concepts Demonstrated

- Classes, objects, constructors, and encapsulation
- Getters and setters
- Java collections (`ArrayList`)
- Loops, conditionals, and switch statements
- Console input with `Scanner`

## License

No license has been specified for this project.