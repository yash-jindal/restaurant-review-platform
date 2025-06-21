# 🍽️ Restaurant Review Platform

A backend service built with **Spring Boot** for managing restaurants and user-submitted reviews. This RESTful API allows users to create, search, update, and delete restaurants, as well as post and manage reviews. Designed with scalability, searchability, and clean architecture in mind.

---

## 🚀 Features

- **Create Restaurants** with name, cuisine, contact, address, operating hours, and photos
- **Create Reviews** with content, rating, and optional photos
- **Search Restaurants** by:
  - Name or keyword (`query`)
  - Minimum rating
  - Geo-distance (via `latitude`, `longitude`, `radius`)
- **List Reviews** by:
  - Ascending or descending order on the basis of Date Posted
  - Ascending or descending order on the basis of rating
- **CRUD operations** for restaurants
- **CRUD operations** for reviews
- **Error Handling** via centralized error controller
- **Authentication** using Keycloak (OAuth2 / OpenID Connect)
- **Search and indexing** powered by Elasticsearch

---

## 🛠️ Tech Stack

- **Spring Boot**
- **Spring Security + Keycloak**
- **Elasticsearch** for storing and querying restaurant data
- **Docker**
- **RESTful APIs**
- **Java 17+**
- **Maven** for dependency management

---

## 📦 API Endpoints

### Restaurant APIs

- `POST /api/restaurants` – Create a new restaurant
- `GET /api/restaurants` – Search restaurants by query, rating, location
- `GET /api/restaurants/{id}` – Get restaurant details
- `PUT /api/restaurants/{id}` – Update a restaurant
- `DELETE /api/restaurants/{id}` – Delete a restaurant

### Review APIs

- `POST /api/restaurants/{restaurantId}/reviews` – Add a review to a restaurant
- `GET /api/restaurants/{restaurantId}/reviews` – List reviews by sorting based on date posted and rating
- `GET /api/restaurants/{restaurantId}/reviews/{reviewId}` – Get review details
- `PUT /api/restaurants/{restaurantId}/reviews/{reviewId}` – Update a review
- `DELETE /api/restaurants/{restaurantId}/reviews/{reviewId}` – Delete a review

---

## 🔐 Authentication

Authentication is handled using **Keycloak**.

- Secured endpoints require a valid **JWT token** in the `Authorization` header:
