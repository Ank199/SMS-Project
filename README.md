#📌 SMS Platform - Kafka & Spring Boot
A Spring Boot microservices project for sending and processing SMS messages using Kafka, Spring Boot, and MySQL.

#🚀 Features
✅ Customer API → Accepts SMS requests and publishes to Kafka
✅ Kafka Consumer → Listens for messages and processes them
✅ Backend Processor → Scheduled task for handling SMS queue
✅ Telecom API → Simulates an SMS service provider

#📌 2️⃣ Kafka Setup
Start Zookeeper & Kafka:

cd C:\kafka_2.13-3.9.0\bin\windows
zookeeper-server-start.bat ..\..\config\zookeeper.properties

.\kafka-server-start.bat ..\..\config\server.properties

Create Kafka Topic (user-topic):
.\kafka-topics.bat --create --topic user-topic --bootstrap-server localhost:9092

Test Kafka:
.\kafka-console-producer.bat --topic user-topic --bootstrap-server localhost:9092
.\kafka-console-consumer.bat --topic user-topic --from-beginning --bootstrap-server localhost:9092

#📌 3️⃣ SQL Database Setup
Modify application.properties in all microservices:

spring.datasource.url=jdbc:mysql://localhost:3306/sms_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
Create the database (sms_db):

sql
#CREATE DATABASE sms_db;
📌 4️⃣ Start Spring Boot Microservices
cd customer-api && mvn spring-boot:run
cd kafka-consumer && mvn spring-boot:run
cd backend-processor && mvn spring-boot:run
cd telecom-api && mvn spring-boot:run

#📌 5️⃣ Test SMS API

http://localhost:8080/telco/sendmsg?accountId=3&username=user1&password=password1&mobile=9876543210&message=firstMessage
✅ Response:

STATUS: ACCEPTED~~ID:1

📌 6️⃣ Summary of Commands
Step	Command
Start Zookeeper	zookeeper-server-start.bat ..\..\config\zookeeper.properties
Start Kafka	.\kafka-server-start.bat ..\..\config\server.properties
Create Kafka Topic	.\kafka-topics.bat --create --topic user-topic --bootstrap-server localhost:9092
Start Kafka Producer	.\kafka-console-producer.bat --topic user-topic --bootstrap-server localhost:9092
Start Kafka Consumer	.\kafka-console-consumer.bat --topic user-topic --from-beginning --bootstrap-server localhost:9092
Start Customer API	cd customer-api && mvn spring-boot:run
Start Kafka Consumer	cd kafka-consumer && mvn spring-boot:run
Start Backend Processor	cd backend-processor && mvn spring-boot:run
Start Telecom API	cd telecom-api && mvn spring-boot:run
🔗 Tech Stack
Spring Boot (REST API, JPA, Scheduling)
Apache Kafka (Messaging system)
MySQL  (Database)
Maven (Build tool)
