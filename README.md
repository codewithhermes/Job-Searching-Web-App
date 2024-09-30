# Job Searching Web Application

This is a Spring Boot-based web application designed to provide a platform where job seekers can search for jobs and employers can post job listings. The project follows a RESTful architecture, utilizing various layers for data access, service logic, and web interactions.

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [API Endpoints](#api-endpoints)
- [Running the Application](#running-the-application)
  - [Option 1: Running the Application Using Maven](#option-1-running-the-application-using-maven)
  - [Option 2: Running the Application as a Standalone JAR](#option-2-running-the-application-as-a-standalone-jar)
  - [Accessing the H2 Database Console](#accessing-the-h2-database-console)
  - [Example API Request](#example-api-request)
  - [Troubleshooting](#troubleshooting)
- [Contributing](#contributing)
- [License](#license)

## Project Overview

The Job Searching Web Application allows users to:
- View available job postings.
- Create, update, and delete job posts (for employers).
- Search for job postings based on criteria.

The application follows a standard MVC (Model-View-Controller) design pattern with service and repository layers.

## Features

- **RESTful API**: Exposes endpoints for managing job posts.
- **CRUD operations**: Employers can Create, Read, Update, and Delete job posts.
- **Search functionality**: Job seekers can search for jobs based on specific criteria.
- **Layered architecture**: Separates concerns between controller, service, and repository layers.

## Technologies Used

- **Java 11**: Primary programming language.
- **Spring Boot**: Backend framework for building RESTful APIs.
- **Maven**: Dependency and project management.
- **H2 Database** (or other databases): Default in-memory database for development purposes.
- **JUnit 5**: For unit testing.

## Getting Started

### Prerequisites

To run this project, you'll need:

- **Java 11+**
- **Maven**
- An IDE like IntelliJ IDEA or Eclipse.

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/codewithhermes/job-searching-web-app.git
   ```
2. Navigate to the project directory:
   ```bash
   cd job-searching-web-app
   ```
3. Install dependencies:
   ```bash
   mvn clean install
   ```

### Project Structure

```
JobSearchingWebApp/
│
├── src/main/java/com/ashu/JobPortalWebApp/
│   ├── JobPortalWebAppApplication.java      # Main application entry point
│   ├── JobRestController.java               # REST API controller
│   ├── model/
│   │   └── JobPost.java                     # Job post model class
│   ├── repo/
│   │   └── JobRepo.java                     # Data access layer for job posts
│   └── service/
│       └── JobService.java                  # Service layer for job management
│
├── src/main/resources/
│   └── application.properties               # Application configuration
│
├── pom.xml                                  # Maven project file
├── README.md                                # Project documentation
└── HELP.md                                  # Additional help information
```

## API Endpoints

| Method | Endpoint                  | Description               |
|--------|---------------------------|---------------------------|
| GET    | `/api/jobs`                | Retrieve all job posts    |
| POST   | `/api/jobs`                | Create a new job post     |
| GET    | `/api/jobs/{id}`           | Get a job post by ID      |
| PUT    | `/api/jobs/{id}`           | Update a job post by ID   |
| DELETE | `/api/jobs/{id}`           | Delete a job post by ID   |

## Running the Application

### Option 1: Running the Application Using Maven

Follow these steps to run the project directly using Maven:

1. **Clone the Repository**:  
   First, you need to clone the GitHub repository of the project to your local machine:
   ```bash
   git clone https://github.com/username/job-searching-web-app.git
   cd job-searching-web-app
   ```

2. **Install Dependencies**:  
   Use Maven to clean the project and install all necessary dependencies:
   ```bash
   mvn clean install
   ```

3. **Run the Application**:  
   Start the application using the Spring Boot Maven plugin:
   ```bash
   mvn spring-boot:run
   ```

4. **Access the Application**:  
   The application will start on the default port **8080**. Open your web browser and visit:
   ```
   http://localhost:8080
   ```

5. **Verify API Endpoints**:  
   You can interact with the REST API at:
   ```
   http://localhost:8080/api/jobs
   ```

   To confirm that the application is running, try the following cURL command:
   ```bash
   curl -X GET http://localhost:8080/api/jobs
   ```

### Option 2: Running the Application as a Standalone JAR

You can also package the application into a JAR file and run it independently of Maven.

1. **Build the JAR**:  
   Use Maven to build the project and generate a JAR file:
   ```bash
   mvn clean package
   ```

2. **Locate the JAR File**:  
   After the build process is complete, the JAR file will be available in the `target` directory:
   ```bash
   target/job-searching-web-app-0.0.1-SNAPSHOT.jar
   ```

3. **Run the JAR**:  
   Run the JAR file using the Java command:
   ```bash
   java -jar target/job-searching-web-app-0.0.1-SNAPSHOT.jar
   ```

4. **Access the Application**:  
   As with the Maven approach, the application will be accessible on:
   ```
   http://localhost:8080
   ```

### Accessing the H2 Database Console

By default, the application uses an H2 in-memory database for development purposes. To access the H2 database console:

1. Open a browser and navigate to:
   ```
   http://localhost:8080/h2-console
   ```

2. Enter the following credentials:
   - **JDBC URL**: `jdbc:h2:mem:testdb`
   - **Username**: `sa`
   - **Password**: *(leave blank)*

This console allows you to run SQL queries and inspect the current state of the database.

### Example API Request

To test the API, you can use tools like `curl` or Postman. Below is an example of creating a new job post:

```bash
curl -X POST http://localhost:8080/api/jobs      -H "Content-Type: application/json"      -d '{
           "title": "Software Engineer",
           "description": "Develop and maintain web applications.",
           "location": "Remote",
           "salary": "100000"
         }'
```

This will create a new job post in the application.

### Troubleshooting

- **Port Conflict**:  
  If the application fails to start due to a port conflict, you can change the port in the `application.properties` file, located in `src/main/resources/`:
  ```properties
  server.port=8081
  ```

- **Dependency Issues**:  
  If Maven fails to resolve dependencies, try running:
  ```bash
  mvn clean install -U
  ```

## Contributing

If you'd like to contribute, please fork the repository and make changes as you'd like. Pull requests are warmly welcome.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
