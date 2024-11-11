package com.jorge.login.Repository;

import com.jorge.login.Entity.TipoRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TipoRolRepositorio extends JpaRepository<TipoRol, Long> {

    // Método para buscar un tipo de rol específico por su nombre
    Optional<TipoRol> findByNombre(String nombre);
}
