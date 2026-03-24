package com.sistema_de_gestion_de_prestamos_libros.services;


import com.sistema_de_gestion_de_prestamos_libros.model.BooKStatus;
import com.sistema_de_gestion_de_prestamos_libros.model.Book;
import com.sistema_de_gestion_de_prestamos_libros.model.Loan;
import com.sistema_de_gestion_de_prestamos_libros.model.User;
import com.sistema_de_gestion_de_prestamos_libros.repository.BookRepository;
import com.sistema_de_gestion_de_prestamos_libros.repository.LoanRepository;
import com.sistema_de_gestion_de_prestamos_libros.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class LibraryService {

    @Autowired private BookRepository bookRepository;
    @Autowired private LoanRepository loanRepository;
    @Autowired private UserRepository userRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public Loan createLoan(Long bookId, Long UserId) {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(()-> new RuntimeException("Book not found"));
        User user = userRepository.findById(UserId)
                .orElseThrow(()-> new RuntimeException("User not found"));


        if (book.getStatus() == BooKStatus.prestado){
            throw new RuntimeException("Book status: prestado");
        }

        book.setStatus(BooKStatus.prestado);
        bookRepository.save(book);

        Loan loan = new Loan();
        loan.setBook(book);
        loan.setUser(user);
        loan.setFechaInit(LocalDate.now());
        return  loanRepository.save(loan);
    }

    public List<Loan> getLoanByUser(Long userId){
        return loanRepository.findByUserId(userId);
    }


}
