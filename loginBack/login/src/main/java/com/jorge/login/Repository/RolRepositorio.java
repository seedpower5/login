package com.jorge.login.Repository;
import com.jorge.login.Entity.Rol;
import com.jorge.login.Entity.TipoRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepositorio extends JpaRepository<Rol, Long> {

    // Método para buscar un rol específico por su nombre o tipo
    Optional<Rol> findByNombre(String nombre);

    // Método para buscar roles por tipo de rol
    Optional<Rol> findByTipoRol(TipoRol tipoRol);
}