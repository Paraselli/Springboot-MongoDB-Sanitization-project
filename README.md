# 🛡️ Spring Boot MongoDB Sanitization Project

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge\&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green?style=for-the-badge\&logo=springboot)
![MongoDB](https://img.shields.io/badge/MongoDB-NoSQL-47A248?style=for-the-badge\&logo=mongodb)
![Security](https://img.shields.io/badge/Security-Input_Sanitization-red?style=for-the-badge\&logo=datadog)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge\&logo=apachemaven)

### 🔐 Secure Spring Boot application demonstrating MongoDB input sanitization & secure data handling

</div>

---

## 📌 Overview

This project is a **secure Spring Boot + MongoDB backend application** designed to demonstrate **input sanitization**, **secure request handling**, and **MongoDB protection techniques** against malicious payloads such as:

* NoSQL Injection
* Script Injection
* Malicious Input Payloads
* Unsafe User Data Storage
* MongoDB Query Manipulation

It showcases how to build **secure backend APIs** by sanitizing incoming request payloads before persisting them in MongoDB.

---

## 🏗️ Architecture

```text
                    +----------------------+
                    |      Client/API      |
                    +----------+-----------+
                               |
                               v
                    +----------------------+
                    |   REST Controller    |
                    +----------+-----------+
                               |
                               v
                    +----------------------+
                    |   Service Layer      |
                    | Input Sanitization   |
                    +----------+-----------+
                               |
                               v
                    +----------------------+
                    | Mongo Repository     |
                    +----------+-----------+
                               |
                               v
                    +----------------------+
                    |      MongoDB         |
                    +----------------------+
```

---

## ✨ Features

* ✅ Spring Boot REST API
* ✅ MongoDB integration
* ✅ Input sanitization before persistence
* ✅ Protection against NoSQL injection
* ✅ Secure request validation
* ✅ Clean layered architecture
* ✅ Portfolio-ready security project

---

## 🛠️ Tech Stack

| Technology          | Purpose           |
| ------------------- | ----------------- |
| Java 17             | Core language     |
| Spring Boot         | Backend framework |
| MongoDB             | NoSQL database    |
| Spring Data MongoDB | Data access layer |
| Maven               | Build tool        |

---

## 📂 Project Structure

```bash
Springboot-MongoDB-Sanitization-project/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── repository/
│   │   │       ├── service/
│   │   │       ├── util/
│   │   │       └── DemoApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│
│── pom.xml
└── README.md
```

---

## ⚙️ Setup & Run

### 1️⃣ Clone Repository

```bash
git clone https://github.com/Paraselli/Springboot-MongoDB-Sanitization-project.git
cd Springboot-MongoDB-Sanitization-project
```

### 2️⃣ Configure MongoDB

Make sure MongoDB is running locally on:

```bash
mongodb://localhost:27017
```

### 3️⃣ Run Application

```bash
mvn spring-boot:run
```

Application runs on:

```bash
http://localhost:8080
```

---

## 📬 API Flow

### Example Request

```http
POST /users
```

### Incoming Payload

```json
{
  "name": "<script>alert('xss')</script>",
  "email": "test@example.com"
}
```

### Sanitized Output Stored in MongoDB

```json
{
  "name": "alert('xss')",
  "email": "test@example.com"
}
```

---

## 🔐 Security Focus

This project demonstrates protection against:

* NoSQL Injection
* XSS-style payload injection
* Script-based malicious inputs
* Unsafe MongoDB persistence
* Malformed request data

Sanitization ensures that only safe, cleaned input is persisted.

---

## 🔁 Request Flow

1. Client sends request
2. Controller receives payload
3. Service sanitizes input
4. Clean data sent to repository
5. Repository stores sanitized data in MongoDB

---

## 🎯 Why This Project Matters

This project demonstrates real-world **backend security engineering** concepts:

* Secure API design
* Input sanitization
* MongoDB protection
* Clean layered architecture
* Security-first backend development

Perfect for:

* Backend security portfolio
* Resume project
* Spring Boot security interviews
* Secure coding demonstrations

---

## 👨‍💻 Author

---

### Ram Paraselli

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Profile-0A66C2?style=for-the-badge\&logo=linkedin)](https://www.linkedin.com/in/ram-paraselli/)

[![GitHub](https://img.shields.io/badge/GitHub-Profile-181717?style=for-the-badge\&logo=github)](https://github.com/Paraselli)

---

## ⭐ Support

If this project helped you, consider giving it a **star** ⭐ on GitHub.
