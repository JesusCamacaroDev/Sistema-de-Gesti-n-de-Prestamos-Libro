


1. @ManyToOne (Muchos a Uno)
   Define la cardinalidad de la relación.
   • Significado: "Muchos" registros de esta entidad (ej. muchos Préstamos) pueden estar asociados a "Un" solo registro de la otra entidad (Book).
   • En la práctica: Un libro puede ser prestado muchas veces (en diferentes momentos o por diferentes personas), pero un préstamo específico pertenece a un solo libro.
2. @JoinColumn(name = "libro_id")
   Define cómo se conectan las tablas en la base de datos (la estructura física).
   • Foreign Key (Clave Foránea): Indica a JPA que en la tabla de esta entidad (ej. tabla loans) debe crearse una columna llamada libro_id.
   • Función: Esta columna libro_id guardará el valor de la clave primaria (ID) del libro asociado.
3. private Book libro;
   Es la representación en Java de esa relación.
   • A diferencia de SQL, donde solo guardas el ID (int o long), en JPA declaras el objeto completo (Book).
   • Ventaja: Esto te permite acceder a los datos del libro directamente desde el préstamo sin escribir consultas SQL manuales.
   ◦ Ejemplo: prestamo.getLibro().getTitulo()
   Resumen Visual
   Tabla loans (Préstamos) | id | fecha_prestamo | ... | libro_id (FK) | |----|----------------|-----|-------------------| | 1 | 2023-10-01 | ... | 101 | | 2 | 2023-10-05 | ... | 101 |
   Tabla books (Libros) | id (PK) | titulo | autor | |-------------|--------|-------| | 101 | El Quijote | Cervantes |
   El código conecta el libro_id de la primera tabla con el id de la segunda.