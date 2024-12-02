# README: User Validation with CSV File Assignment

## Overview
In this assignment, you will create a simple Java console application that simulates a user login system. The application will validate user credentials (username and password) by reading a file (`data.txt`) containing user data. The program will check if the inputted username and password match the data and provide feedback based on the result.

## What You Will Learn
### 1. **Reading Data from a File**
   - How to read user data from a file (in this case, `data.txt`).
   - Parsing data and storing it in an Array of Java objects.

### 2. **Using POJOs (Plain Old Java Objects)**
   - How to design a POJO class to store data (such as `username`, `password`, and `name`).
   - Understanding the principles of object-oriented programming by using POJOs to manage user data.

### 3. **User Input and Validation**
   - Using the `Scanner` class to collect user input.
   - Implementing logic to validate usernames and passwords by checking the input against stored data.
   - Handling case-sensitive and case-insensitive comparisons.

### 4. **Control Flow and Looping**
   - Creating a controlled flow for user login attempts (with a maximum of 5 attempts).
   - Implementing loops to handle retries and track login attempts.
   - Implementing a lock-out system after a set number of failed attempts.

### 5. **Error Handling**
   - Providing feedback to the user when the login is unsuccessful.
   - Outputting appropriate messages when the login limit is reached and locking the user out.

### 6. **Service Layer Architecture**
   - Organizing your program with a service class to handle user validation and file reading.
   - Structuring the program using multiple classes for readability and maintainability.

## How to Use This Project
### 1. **Download and Setup**
   - Download the `data.txt` file, which contains a list of users, from the provided link.
   - Ensure that `data.txt` is in the correct location relative to your Java project.

### 2. **Running the Program**
   - Compile and run the Java program.
   - The program will prompt for a username and password.
   - It will validate the login credentials against the user data and allow a maximum of 5 attempts before locking the user out.

### 3. **Program Logic**
   - The program will first prompt for a username and password.
   - It will check the inputted username and password against the data in the `data.txt` file.
   - If a match is found, the program will print a welcome message with the user's name.
   - If the credentials do not match, the program will allow up to 5 attempts before locking the user out and terminating the program.

### 4. **Sample Use Cases**
   - **Case 1: Too Many Failed Logins**
     - The user inputs incorrect credentials multiple times and gets locked out after 5 failed attempts.

     ```
     Enter your email:
     test@test.com
     Enter your password:
     asdfasdf
     Invalid login, please try again

     Enter your email:
     test@test.com
     Enter your password:
     asdfasdf
     Invalid login, please try again

     Enter your email:
     test@test.com
     Enter your password:
     asdfasdf
     Invalid login, please try again

     Enter your email:
     test@test.com
     Enter your password:
     asdfasdf
     Too many failed login attempts, you are now locked out.
     ```

   - **Case 2: Successful Login**
     - The user inputs correct credentials and is welcomed by name.

     ```
     Enter your email:
     john.doe@mydomain.net
     Enter your password:
     Hdk398jf!
     Welcome: John Doe
     ```

### Key Deliverables
1. **User POJO Class:**
   - A simple class with properties: `username`, `password`, and `name`.
   - Methods for accessing and updating these properties.

2. **UserService Class:**
   - A service class to handle the loading of users from the `data.txt` file.
   - A method to validate the username and password against the stored data.

3. **UserLoginApplication Class:**
   - The main class containing the `public static void main` method to drive the application logic.
   - Collects user input and interacts with the `UserService` class to validate the login.

### Expected Output
- When a user provides incorrect credentials, the program will print a message saying "Invalid login, please try again."
- If a user successfully logs in, the program will print a welcome message with their name: `Welcome: {User's Name}`.
- If a user fails 5 consecutive login attempts, they will be locked out with the message: `Too many failed login attempts, you are now locked out.`

## Skills Gained
- **File I/O**: Reading from external files and parsing data in Java.
- **String Matching and Validation**: Handling case-sensitive and case-insensitive matches.
- **Program Flow Management**: Managing loops, conditions, and limiting attempts.
- **POJO Design and Service Layer**: Using Java classes to structure the program.
- **Basic User Authentication**: Simulating a basic login system.

## Extensions and Challenges
- **Encryption**: You can implement a simple password hashing or encryption mechanism to secure the stored passwords.
- **GUI**: Add a graphical user interface (GUI) to simulate a more real-world login screen using JavaFX or Swing.
- **File Formats**: Experiment with reading from and writing to different file formats (e.g., CSV or JSON).
