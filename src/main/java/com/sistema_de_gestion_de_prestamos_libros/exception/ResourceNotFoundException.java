package com.sistema_de_gestion_de_prestamos_libros.exception;


// Excepción para cuando no se encuentra algo (404)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }

}
