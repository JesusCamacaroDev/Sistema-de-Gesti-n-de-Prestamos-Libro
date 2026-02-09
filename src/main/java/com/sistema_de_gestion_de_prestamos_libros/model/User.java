/*
1. @Data: Esta anotación de Lombok genera automáticamente los métodos getters, setters, toString, equals y hashCode.
2. @Entity: Anotación de JPA que marca la clase como una entidad que se puede persistir en una base de datos.
3. @AllArgsConstructor: Genera un constructor que incluye todos los campos de la clase.
4. @NoArgsConstructor: Genera un constructor vacío, que es requerido por JPA.
5. @Id: Marca el campo id como la clave primaria de la entidad.
6. @GeneratedValue(strategy = GenerationType.IDENTITY): Configura la forma en que se genera el valor de la clave primaria, en este caso, de forma autoincremental por la base de datos.
7. He corregido la importación de @Id para que sea jakarta.persistence.Id en lugar de org.springframework.data.annotation.Id.
*/

package com.sistema_de_gestion_de_prestamos_libros.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;

}

