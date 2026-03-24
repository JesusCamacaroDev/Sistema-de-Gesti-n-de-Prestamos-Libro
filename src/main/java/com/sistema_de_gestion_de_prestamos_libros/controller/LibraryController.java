package com.sistema_de_gestion_de_prestamos_libros.controller;

import com.sistema_de_gestion_de_prestamos_libros.dto.LoanRequest;
import com.sistema_de_gestion_de_prestamos_libros.model.Book;
import com.sistema_de_gestion_de_prestamos_libros.model.Loan;
import com.sistema_de_gestion_de_prestamos_libros.services.LibraryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryController {

    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }


    @GetMapping("/book")
    public List<Book> getAllBook(){
        return libraryService.getAllBooks();
    }

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book){
        return libraryService.saveBook(book);
    }

    @GetMapping("/loans/user/{id}")
    public List<Loan> userLoans(@PathVariable Long id){
        return libraryService.getLoanByUser(id);
    }

    @PostMapping("/loans")

//    public Loan addLoan(@RequestBody Loan loan) {
//        return libraryService.createLoan(loan.getBook().getId(), loan.getUser().getId());
//    }
    /*JSON requerido:
    {
     "book": {
       "id": 1
      },
     "user": {
       "id": 1
      }
    } */

    public Loan addLoan(@RequestBody LoanRequest loanRequest){
        return libraryService.createLoan(loanRequest.getBookId(), loanRequest.getUserId());
    }

//    {
//        "bookId": 3,
//        "userId": 3
//    }

}
