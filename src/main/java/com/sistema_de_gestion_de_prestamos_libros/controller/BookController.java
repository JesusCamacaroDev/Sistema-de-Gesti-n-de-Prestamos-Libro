package com.sistema_de_gestion_de_prestamos_libros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String getAllBooks() {
        return "books"; // This will resolve to books.html or books.jsp depending on your view resolver setup
    }
}
