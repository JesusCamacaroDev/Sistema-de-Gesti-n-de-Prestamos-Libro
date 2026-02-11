package com.sistema_de_gestion_de_prestamos_libros.repository;

import com.sistema_de_gestion_de_prestamos_libros.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface userRepository extends JpaRepository<User,Integer> {

    private Integer idUser() {
        return null;
    }
}


/*
* public interface CrudRepository<T, ID extends Serializable>
    extends Repository<T, ID> {
                                                                                                                       (1)
    <S extends T> S save(S entity);
                                                                                                                       (2)
    T findOne(ID primaryKey);
                                                                                                                       (3)
    Iterable<T> findAll();

    Long count();
                                                                                                                       (4)
    void delete(T entity);
                                                                                                                       (5)
    boolean exists(ID primaryKey);
                                                                                                                       (6)
    // … more functionality omitted.
}*/