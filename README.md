#. Discovery Server [Eureka]
- All applications will be registered here
- Docker configuration file
- Kubernetes configuration file

#. Department Service
- Rest service which lists all departments
- Docker configuration file
- Kubernetes configuration file
- Zipkin for Trace analysis
- Cloud config for configuration server
- Eureka client
- Lombok for bean methods
- Zipkin Server

#. User Service
- Rest Service which list all users with departments
- Docker configuration file
- Kubernetes configuration file
- Zipkin For Trace Analysis
- Cloud Config for Configuration Server
- Eureka client
- Lombok for bean methods
- Zipkin Server

#. Gateway Server 
- Eureka client
- Cloud Config for Configuration Server
- Resilience4j as Circuit Breaker

#. Config Server
- Eureka client
- Cloud Config for Configuration Server

# Spring Boot
- Rest Service
- Dev Tools
- Actuator
- Spring Profiling
