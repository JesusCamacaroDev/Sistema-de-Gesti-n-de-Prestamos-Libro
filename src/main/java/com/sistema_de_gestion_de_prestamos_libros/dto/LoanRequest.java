package com.sistema_de_gestion_de_prestamos_libros.dto;



public class LoanRequest {

 private Long bookId;
 private Long userId;

    public Long getBookId() { return bookId; }
    public void setBookId(Long bookId) { this.bookId = bookId; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
}
