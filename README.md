# Banking Transfer Management System

## Table of Contents
- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Architecture](#architecture)
- [Microservices](#microservices)
    - [Beneficiary Service](#beneficiary-service)
    - [Transfer Service](#transfer-service)
    - [Chatbot Service](#chatbot-service)
    - [Gateway Service](#gateway-service)
    - [Discovery Service](#discovery-service)
    - [Config Service](#config-service)
- [Installation](#installation)
- [Usage](#usage)
- [Testing](#testing)
- [Future Work](#future-work)
- [Contributing](#contributing)
- [License](#license)
- [Screen Shots](#screen-shots)

## Introduction
This project is a proof of concept for a banking transfer management system. It is built using a microservices architecture to facilitate web and mobile transactions for banking clients. The application consists of several microservices that manage beneficiaries, bank transfers, and user interactions through an AI-powered chatbot.

## Technologies Used
- **Backend:**
    - Spring Boot
    - Spring Cloud
    - OpenFeign
    - Spring AI (or Python Langchain for Chatbot)
- **Frontend:**
    - Angular or React
- **Database:**
    - [Specify the database used, e.g., MySQL, PostgreSQL, MongoDB, etc.]
- **Other Technologies:**
    - Docker
    - Jenkins
    - Kubernetes (optional for deployment)

## Architecture
The application follows a microservices architecture with the following components:
- Beneficiary Service
- Transfer Service
- Gateway Service
- Discovery Service
- Config Service

![Architecture Diagram](link_to_your_architecture_diagram.png)

## Microservices

### Beneficiary Service
This microservice manages beneficiaries' information, including their name, RIB, and type (physical or moral). It provides RESTful endpoints to create, read, update, and delete beneficiaries.

### Transfer Service
This service handles bank transfers, allowing users to initiate transactions. It maintains transfer records, including details such as the amount, source RIB, beneficiary ID, and transfer type (normal or instant).

### Chatbot Service
The AI-powered chatbot assists users in querying banking services and processes inquiries based on provided documents (e.g., PDF). It utilizes a generative AI model (e.g., GPT-4 or LLaMA 3) with a Retrieval-Augmented Generation (RAG) system.

### Gateway Service
This service acts as an API gateway, routing requests to the appropriate microservices and handling authentication and authorization.

### Discovery Service
The discovery service facilitates service registration and discovery within the microservices architecture, using Eureka or Consul.

### Config Service
This service manages application configuration settings for the microservices, enabling dynamic configuration updates.

## Installation
To set up the project locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/yourrepository.git

## Screen Shots
### Discovery Service

![img.png](img.png)

### Gateway

![img_1.png](img_1.png)

![img_2.png](img_2.png)

### Config Service

![img_29.png](img_29.png)

![img_30.png](img_30.png)

![img_31.png](img_31.png)

### Beneficaire Service
### Project Structure
![img_8.png](img_8.png)

Entity:

![img_7.png](img_7.png)

Enums:

![img_9.png](img_9.png)

Dtos:

![img_10.png](img_10.png)

Mapper (Modal Mapper):

![img_11.png](img_11.png)

Mapper config:

![img_12.png](img_12.png)

Repo:

![img_13.png](img_13.png)

Service:

![img_14.png](img_14.png)

Implementation: 

![img_15.png](img_15.png)

Controller:

![img_16.png](img_16.png)

Application:

![img_17.png](img_17.png)

# Swagger test:

Get all

![img_32.png](img_32.png)

![img_33.png](img_33.png)

Get By Id

![img_34.png](img_34.png)

### virement Service
### Project Structure

![img_18.png](img_18.png)

Entity:

![img_19.png](img_19.png)

Enums:

![img_20.png](img_20.png)

Repo:

![img_21.png](img_21.png)

Open Feign:

![img_22.png](img_22.png)

Service:

![img_23.png](img_23.png)

Implementation:

![img_24.png](img_24.png)

Controller:

![img_25.png](img_25.png)

Application:

![img_26.png](img_26.png)

# Swagger test:

![img_35.png](img_35.png)

Get all

![img_36.png](img_36.png)

![img_37.png](img_37.png)

Get By Id

## Documentation Swagger
![img_3.png](img_3.png)

![img_4.png](img_4.png)
## FRONT
![img_5.png](img_5.png)

![img_6.png](img_6.png)