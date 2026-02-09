# Proyecto: Sistema de Gestión de Empleados (MVP)

Hola! Bienvenido al equipo de desarrollo de **SoftInnovations**. 
Soy tu Tech Lead y seré tu mentor en este proyecto.

Nos ha llegado un requerimiento urgente de un cliente interno: el departamento de Recursos Humanos necesita modernizar su sistema de gestión de personal. Actualmente usan Excel y es un caos. Tu misión, si decides aceptarla, es construir el MVP (Producto Mínimo Viable) del nuevo **Sistema de Gestión de Empleados**.

## 1. Revisión Inicial del Entorno (Code Review)

Antes de empezar con la lógica de negocio, he revisado tu archivo de configuración (`pom.xml`) y he detectado un par de cosas que podrían causarnos problemas al compilar o ejecutar. Como buen desarrollador, primero aseguramos los cimientos.

### Observaciones:

1.  **Versión de Spring Boot:** Tienes puesta la versión 4.0.2. Actualmente, la versión estable más reciente es la serie 3.x (por ejemplo, 3.2.2). La versión 4 aún no existe.
2.  **Dependencia Web:** Estás usando `spring-boot-starter-webmvc`. Aunque no es incorrecto del todo, lo estándar para una aplicación web completa (que incluye el servidor Tomcat embebido) es usar `spring-boot-starter-web`.

**Tarea 1:** Por favor, corrige el `pom.xml` con estos cambios para que podamos arrancar el proyecto correctamente.

## 2. Requerimientos Funcionales (El Proyecto)

Una vez arreglado el `pom.xml`, el objetivo es crear una aplicación web sencilla usando Spring Boot y Thymeleaf (ya que veo que incluiste la dependencia).

### Entidad: Empleado 
Debe tener los siguientes datos:
*   **Id** (Long)
*   **Nombre** (String)
*   **Apellido** (String)
*   **Email** (String)
*   **Teléfono** (String)

### Funcionalidades (CRUD):

1.  **Listar:** Una página principal que muestre una tabla con todos los empleados.
2.  **Crear:** Un botón para ir a un formulario y agregar un nuevo empleado.
3.  **Guardar:** Procesar ese formulario y guardar el empleado.
4.  **(Opcional por ahora) Editar y Eliminar.**

**Nota Técnica:** Como no veo dependencias de base de datos (como H2 o MySQL) en tu `pom.xml`, para esta primera iteración implementaremos el almacenamiento en una **Lista en memoria** dentro de una clase `@Service`. Más adelante conectaremos una base de datos real.
