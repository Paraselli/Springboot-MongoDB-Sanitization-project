# 🚀 Spring Boot + MongoDB Sanitization Project

## 📌 Overview

This project demonstrates how to build a **secure Spring Boot application** using MongoDB with a focus on **input sanitization and validation**.

It helps prevent:

* NoSQL Injection
* Malicious user inputs
* Data integrity issues

---

## 🧩 Architecture

Client → Spring Boot API → Sanitization Layer → MongoDB

* All incoming requests are sanitized before processing
* Ensures only clean and safe data is stored

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot
* Spring Data MongoDB
* MongoDB
* Maven

---

## 📂 Project Structure

```id="k1y2zd"
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

### 🔹 Clone Repository

```id="rdxwsi"
git clone https://github.com/Paraselli/Springboot-MongoDB-Sanitization-project.git
cd Springboot-MongoDB-Sanitization-project
```

### 🔹 Configure MongoDB

```id="7k3f66"
spring.data.mongodb.uri=mongodb://localhost:27017/testdb
```

### 🔹 Run Application

```id="g28o31"
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
* Rejects invalid or malicious data

### ✅ NoSQL Injection Prevention

* Avoids unsafe query construction
* Uses secure repository methods

---

## 🔄 API Endpoints (Example)

| Method | Endpoint | Description   |
| ------ | -------- | ------------- |
| POST   | /users   | Create user   |
| GET    | /users   | Get all users |

---

## ⚡ Example

### Input:

```json id="v2p2xr"
{
  "name": "<script>alert('hack')</script>"
}
```

### Sanitized Output:

```json id="d90qj3"
{
  "name": "alert('hack')"
}
```

---

## 🚀 Features

* Secure REST APIs
* MongoDB integration
* Input sanitization layer
* Clean layered architecture

---

## 📈 Future Improvements

* JWT Authentication
* Rate limiting
* Logging & monitoring
* Docker & Kubernetes deployment
* Cloud deployment (Azure/AWS)

---

## 💥 Author

Ram P

---

## 🔗 Connect with me

🔗 linkedin.com/in/ram-paraselli
💻 github.com/Paraselli

---

## ⭐ If you like this project, give it a star!
