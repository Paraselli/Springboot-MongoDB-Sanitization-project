# 🚀 Spring Boot + MongoDB Sanitization Project

## 📌 Overview

This project demonstrates how to build a **secure Spring Boot application** with MongoDB by implementing **input sanitization and validation** to prevent common security vulnerabilities.

It focuses on protecting applications from:

* NoSQL Injection
* Malicious user inputs
* Data integrity issues

---

## 🧩 Architecture

Client → Spring Boot API → Sanitization Layer → MongoDB

* Incoming requests are sanitized before processing
* Ensures only safe and validated data is stored

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot
* Spring Data MongoDB
* MongoDB
* Maven

---

## 📂 Project Structure

```id="1jgqgp"
src/
├── controller/
├── service/
├── repository/
├── model/
├── config/
└── util/ (sanitization logic)
```

---

## ⚙️ Setup Instructions

### 🔹 1. Clone Repository

```id="0m1so1"
git clone https://github.com/<your-username>/Springboot-MongoDB-Sanitization-project.git
cd Springboot-MongoDB-Sanitization-project
```

---

### 🔹 2. Configure MongoDB

Update `application.properties`:

```id="q6cbfm"
spring.data.mongodb.uri=mongodb://localhost:27017/testdb
```

---

### 🔹 3. Run Application

```id="n2m2qi"
mvn spring-boot:run
```

---

## 🔐 Security Features

### ✅ Input Sanitization

* Removes harmful characters
* Prevents script injection
* Cleans user inputs before DB operations

### ✅ Validation

* Field-level validation
* Rejects invalid/malicious data

### ✅ NoSQL Injection Prevention

* Avoids dynamic query injection
* Uses safe query methods

---

## 🔄 API Endpoints (Example)

| Method | Endpoint | Description   |
| ------ | -------- | ------------- |
| POST   | /users   | Create user   |
| GET    | /users   | Get all users |

---

## ⚡ Example Sanitization

Input:

```json id="69a0jj"
{
  "name": "<script>alert('hack')</script>"
}
```

Sanitized Output:

```json id="nq37rs"
{
  "name": "alert('hack')"
}
```

---

## 🚀 Features

* Secure REST APIs
* MongoDB integration
* Input sanitization layer
* Clean architecture (Controller → Service → Repository)

---

## 📈 Future Improvements

* Add JWT Authentication
* Add rate limiting
* Add logging & monitoring
* Deploy to cloud (Azure/AWS)
* Add integration tests

---

## 💥 Author

Ram P

---

## ⭐ If you like this project, give it a star!
