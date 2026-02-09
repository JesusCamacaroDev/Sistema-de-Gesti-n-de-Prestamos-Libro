package com.sistema_de_gestion_de_prestamos_libros.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date fechaInit;
    private Date fechaDev;

    // RELACIONES

    /**
     * The book associated with this loan.
     */
    @ManyToOne
    @JoinColumn(name = "libro_id")
    private Book libro;

    /**
     * The user who borrowed the book.
     */
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private User usuario;


}
