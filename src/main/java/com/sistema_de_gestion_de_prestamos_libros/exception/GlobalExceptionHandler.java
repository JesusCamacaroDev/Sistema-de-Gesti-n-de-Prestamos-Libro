package com.sistema_de_gestion_de_prestamos_libros.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;




@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
        public ResponseEntity<ErrorResponse> handlerResourceNotFound(ResourceNotFoundException ex, WebRequest request) {
            ErrorResponse error = new ErrorResponse(
                    HttpStatus.NOT_FOUND.value(),
                    "Not Found",
                    ex.getMessage(),
                    request.getDescription(false).replace("uri=", "")
            );
            return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BookAlreadyBorrowedException.class)
        public ResponseEntity<ErrorResponse> handlerBookAlreadyBorrowed(BookAlreadyBorrowedException ex, WebRequest request) {
            ErrorResponse error = new ErrorResponse(
                    HttpStatus.CONFLICT.value(),
                    "Conflict",
                    ex.getMessage(),
                    request.getDescription(false).replace("uri=", "")
            );
            return new ResponseEntity<>(error, HttpStatus.CONFLICT);}
}

/*
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String, String>> handlerResourceNotFound(ResourceNotFoundException ex, Map<String, String> error){
        Map<String,String> map = new HashMap<>();
        error.put("error", ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(BookAlreadyBorrowedException.class)
    public ResponseEntity<Map<String, String>> handlerBookAlreadyBorrowed(BookAlreadyBorrowedException ex, Map<String, String> error){
        Map<String,String> map = new HashMap<>();
        error.put("error", ex.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(error);
}
*/