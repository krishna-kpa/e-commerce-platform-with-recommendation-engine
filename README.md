# E Commerce Platform with Recommendation Engine
1.  Built a scalable e-commerce platform with features like product management, user roles, search, and AI-powered product recommendations
2.  Implemented microservices architecture for user, product, order, and payment services
3.  Tools Used: AngularJs, Spring Boot, Redis, Kafka, TensorFlow, Docker, Kubernetes


# Config Server
## Overview

The Spring Cloud Config Server provides centralized external configuration management for applications in a distributed system. By centralizing the management of configuration properties, it simplifies the maintenance and evolution of the application infrastructure, making it easier to achieve consistency and control.

## Responsibilities

### 1. Centralized Configuration Management
The Config Server centralizes the management of configuration properties for multiple microservices and applications. It stores configuration files in a Git repository (or other supported storage backends) and serves these configurations to client applications.

### 2. Dynamic Configuration Updates
The Config Server supports dynamic updates of configuration properties without the need for restarting client applications. By monitoring the configuration repository for changes, it ensures that clients can always access the latest configurations.

### 3. Environment-Specific Configurations
The Config Server allows for the management of environment-specific configurations, such as `development`, `staging`, and `production`. This enables applications to load different configurations based on the environment in which they are deployed.

### 4. Configuration Versioning
The use of a Git repository (or other version-controlled storage) allows for versioning of configuration properties. This makes it easy to track changes, roll back to previous configurations, and ensure that the configuration history is well-documented.

### 5. Secure Configuration Management
The Config Server supports the encryption and decryption of sensitive configuration properties, such as passwords and API keys. This ensures that sensitive information is securely managed and transmitted to client applications.

### 6. High Availability and Scalability
The Config Server can be deployed in a highly available and scalable manner to ensure that it can handle the configuration management needs of large and distributed systems.

### 7. Integration with Client Applications
The Config Server seamlessly integrates with Spring Boot applications, making it easy for client applications to retrieve configurations. By using the Spring Cloud Config Client, applications can automatically bind configuration properties to Spring-managed beans.

## Getting Started

1. **Set Up Config Server**: Follow the instructions in the main class to enable the Config Server.
2. **Create Configuration Repository**: Set up a Git repository (or other supported storage) to store your configuration files.
3. **Configure Client Applications**: Update your client applications to point to the Config Server and retrieve configurations.

## Example Configuration

Here is an example configuration file (`application.properties`) stored in the Config Server repository:

```properties
message:
  greeting: "Hello from the Config Server!"

