package com.sistema_de_gestion_de_prestamos_libros.repository;

import com.sistema_de_gestion_de_prestamos_libros.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAllBook();
    Book saveBook(Book book);
}
