# Sistema de Gestión de Préstamos (LibroSaaS)

¡Hola! Qué bueno tenerte por acá. En **"ByteFlow Solutions"** (nuestra empresa ficticia) nos especializamos en modernizar sistemas para pequeñas y medianas empresas.

Actualmente, tenemos un cliente que gestiona una **Biblioteca Comunitaria** y todavía usa hojas de Excel para anotar quién se lleva qué libro. Esto es un caos: se pierden libros, no saben quién los tiene y no hay control de fechas.

Aquí tienes tu primer "Ticket" de trabajo.

---

## 📋 Proyecto: Sistema de Gestión de Préstamos (LibroSaaS)

### El Problema

El cliente necesita una **API REST** básica para gestionar su inventario de libros y los préstamos a los usuarios. No necesitamos interfaz gráfica por ahora, solo el "backend" para que ellos puedan probar los flujos desde herramientas como Postman.

### Requerimientos Técnicos (Tu "Stack")

* **Lenguaje:** Java 17+.
* **Framework:** Spring Boot 3.x.
* **Base de Datos:** H2 (en memoria) o MySQL para persistencia.
* **Dependencias sugeridas:** Spring Web, Spring Data JPA, Lombok.

---

### 🛠️ Tareas a realizar (Sprints)

#### 1. Modelado de Datos

Debes crear las entidades principales. Imagina la estructura de la base de datos así:

* **Libro (Book):** ID, título, autor, ISBN, y un estado (DISPONIBLE o PRESTADO).
* **Usuario (User):** ID, nombre, email.
* **Préstamo (Loan):** ID, fecha de inicio, fecha de devolución, relación con Libro y Usuario.

#### 2. Desarrollo de Endpoints (API)

Necesitamos que expongas los siguientes servicios:

* `GET /libros`: Listar todos los libros.
* `POST /libros`: Registrar un nuevo libro.
* `POST /prestamos`: Crear un préstamo (debe cambiar el estado del libro a PRESTADO).
* `GET /prestamos/usuario/{id}`: Ver qué libros tiene un usuario específico.

#### 3. Regla de Negocio (El toque profesional)

* **Validación:** Un usuario no puede pedir prestado un libro que ya está marcado como "PRESTADO". Si lo intenta, la API debe devolver un error claro (por ejemplo, un código 400 Bad Request).

---

### 💡 Tips de "Compañero de Trabajo"

* **Usa DTOs:** No devuelvas la entidad directamente a la API; usa objetos de transferencia de datos para practicar buenas arquitecturas.
* **Manejo de Errores:** Usa un `@RestControllerAdvice` para que los errores se vean limpios y no lancen un "stacktrace" gigante al cliente.
* **Clean Code:** Mantén tus controladores delgados y pon la lógica pesada en los **Services**.
