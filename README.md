# 🧱 Microservicio de Productos — Práctica Básica con Spring Boot

Este proyecto es una práctica inicial para comprender **las nociones básicas de microservicios en Java** utilizando **Spring Boot**.  
El objetivo es crear un servicio REST que devuelva una lista de productos, estructurado en capas (Controller, Service, Model), y que se pueda ejecutar de forma independiente.

---

## 🚀 Objetivos de aprendizaje

- Comprender la arquitectura **microservicio**.
- Conocer la estructura típica de un proyecto **Spring Boot**.
- Aprender a usar **controladores REST** (`@RestController`).
- Separar la lógica en **capas**: `controller`, `service`, `model`.
- Probar endpoints con **Postman o navegador**.
- Ejecutar un microservicio de forma independiente.

---

## ⚙️ Requisitos previos

- **Java JDK 17 o superior**  
  Descargar desde [Adoptium Temurin](https://adoptium.net/temurin/releases/?version=17)

- **IntelliJ IDEA** (Community o Ultimate)  
  [Descargar aquí](https://www.jetbrains.com/idea/download/)

- **Gradle** (incluido automáticamente con el proyecto)


---

## 🧱 Descripción de las capas

| Capa | Descripción | Archivo |
|------|--------------|----------|
| **Controller** | Expone los endpoints REST y recibe las peticiones HTTP. | `ProductController.java` |
| **Service** | Contiene la lógica de negocio (procesamiento o reglas). | `ProductService.java` |
| **Model** | Define las estructuras de datos o entidades. | `Product.java` |
| **Main** | Punto de entrada del microservicio. | `Demo1Application.java` |

---

## 🧠 Conceptos clave

- **Spring Boot**: Framework que simplifica la creación de aplicaciones Java.
- **Microservicio**: Programa independiente que cumple una sola función.
- **REST API**: Interfaz que permite comunicar servicios usando HTTP.
- **Inyección de dependencias**: Spring crea y administra los objetos necesarios automáticamente.

---
##
