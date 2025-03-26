# Task Manager API

## Overview
The **Task Manager API** is a RESTful API built using Java and Spring Boot that allows users to manage tasks efficiently. It provides endpoints for creating, updating, deleting, and retrieving tasks, enabling seamless task management for individuals or teams.

## Features
- User authentication and authorization (if implemented)
- CRUD operations for tasks (Create, Read, Update, Delete)
- Task categorization and prioritization
- Search and filtering capabilities
- API documentation (Swagger, if available)

## Technologies Used
- **Java**
- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **Hibernate**
- **MySQL (or other database)**
- **Maven**
- **JWT Authentication (if implemented)**
- **Swagger (if implemented)**

## Installation and Setup
### Prerequisites
- Java 17 or later
- Maven
- MySQL (or preferred database)

### Steps to Run the Project
1. Clone the repository:
   ```sh
   git clone https://github.com/David7557/taskmanager_api.git
   cd taskmanager_api
   ```
2. Configure the database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/taskmanager_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```
3. Build the project:
   ```sh
   mvn clean install
   ```
4. Run the application:
   ```sh
   mvn spring-boot:run
   ```
5. The API will be available at: `http://localhost:8080`

## API Endpoints
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/tasks` | Get all tasks |
| GET | `/tasks/{id}` | Get task by ID |
| POST | `/tasks` | Create a new task |
| PUT | `/tasks/{id}` | Update a task |
| DELETE | `/tasks/{id}` | Delete a task |

## Contributing
Contributions are welcome! If you find any issues or have feature requests, feel free to create a pull request or open an issue.

## License
This project is licensed under the [MIT License](LICENSE).

---
### Author
**David**

For any queries, reach out via [GitHub Issues](https://github.com/David7557/taskmanager_api/issues).
