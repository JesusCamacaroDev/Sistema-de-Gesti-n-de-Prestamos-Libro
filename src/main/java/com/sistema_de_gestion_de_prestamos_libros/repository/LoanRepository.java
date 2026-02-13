package com.sistema_de_gestion_de_prestamos_libros.repository;

import com.sistema_de_gestion_de_prestamos_libros.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {

    Loan save(Loan loan);



}