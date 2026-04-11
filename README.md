# Spring Boot + MongoDB Sanitization Example

## Features
- MongoDB integration
- Input sanitization (prevents $ and . injection)
- REST APIs

## Run
1. Start MongoDB
2. mvn spring-boot:run

## API
POST /api/users
{
  "username": "test$user",
  "age": 25
}
