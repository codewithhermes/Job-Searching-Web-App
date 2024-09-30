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
- [Contributing](#contributing)


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
- **Thymeleaf** (optional): For rendering server-side views, if needed.
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
   git clone https://github.com/username/job-searching-web-app.git
