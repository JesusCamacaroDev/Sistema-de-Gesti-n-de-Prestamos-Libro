package com.sistema_de_gestion_de_prestamos_libros.exception;

//Excepción para cuando el libro ya está prestado (409 Conflict)
public class BookAlreadyBorrowedException extends RuntimeException{
    public BookAlreadyBorrowedException(String message){
        super(message);
    }
}
