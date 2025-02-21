# 📌 SMS Platform - Kafka & Spring Boot  
🚀 A **Spring Boot microservices** project for sending and processing SMS messages using **Kafka, Spring Boot, and MySQL**.  

---

## 🚀 **Features**
✔️ **Customer API** → Accepts SMS requests and publishes to Kafka  
✔️ **Kafka Consumer** → Listens for messages and processes them  
✔️ **Backend Processor** → Scheduled task for handling SMS queue  
✔️ **Telecom API** → Simulates an SMS service provider  

---

# 📌 2️⃣ Kafka Setup

**Start Zookeeper & Kafka:**
cd C:\kafka_2.13-3.9.0\bin\windows
zookeeper-server-start.bat ..\..\config\zookeeper.properties

.\kafka-server-start.bat ..\..\config\server.properties

**Create Kafka Topic (user-topic):**
.\kafka-topics.bat --create --topic user-topic --bootstrap-server localhost:9092

**Test Kafka:**
.\kafka-console-producer.bat --topic user-topic --bootstrap-server localhost:9092

.\kafka-console-consumer.bat --topic user-topic --from-beginning --bootstrap-server localhost:9092
---

# 📌 Test SMS API

(http://localhost:8080/telco/sendmsg?accountId=3&username=user1&password=password1&mobile=9876543210&message=firstMessage)

**✅ Response:**

**STATUS: ACCEPTED~~ID:1**

----
# 🔗 Tech Stack
**Spring Boot (REST API, JPA, Scheduling)**
**Apache Kafka (Messaging system)**
**MySQL  (Database)**
**Maven (Build tool)**
