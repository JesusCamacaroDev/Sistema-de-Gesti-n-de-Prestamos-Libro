package com.sistema_de_gestion_de_prestamos_libros.repository;

import com.sistema_de_gestion_de_prestamos_libros.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
