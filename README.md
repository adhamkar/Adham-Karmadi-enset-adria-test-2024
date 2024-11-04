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
    - H2
- **Other Technologies:**
    - Docker
    - Jenkins
    - Kubernetes 

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
### Visit other service via Gateway
### List of beneficaires

![img_1.png](img_1.png)

### List of Transferes

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

![img_44.png](img_44.png)

Implementation: 

![img_45.png](img_45.png)

![img_46.png](img_46.png)

Controller:

![img_47.png](img_47.png)

![img_48.png](img_48.png)

Application:

![img_17.png](img_17.png)

# Swagger test:

Get all

![img_32.png](img_32.png)

![img_33.png](img_33.png)

Get By Id

![img_34.png](img_34.png)

Post

![img_55.png](img_55.png)

![img_50.png](img_50.png)

Patch

![img_53.png](img_53.png) 

![img_54.png](img_54.png) 

Delete

![img_56.png](img_56.png)

![img_57.png](img_57.png)

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


## Documentation Swagger
![img_3.png](img_3.png)

![img_4.png](img_4.png)
# FRONT
## Project Structure
### Please note that i have service named "Prod Service", it's just a folder that i copied from i template and forgot to changes the name

![img_40.png](img_40.png)

### Routing

![img_41.png](img_41.png)

## Home Page

![img_38.png](img_38.png)

### Beneficaire

![img_39.png](img_39.png)

### Service

![img_42.png](img_42.png)

### Beneficaire TS

![img_43.png](img_43.png)