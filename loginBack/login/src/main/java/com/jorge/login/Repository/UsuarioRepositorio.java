package com.jorge.login.Repository;
import com.jorge.login.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

    // Método para buscar un usuario por su nombre
    Optional<Usuario> findByNombre(String nombre);

    // Método para buscar un usuario por su email
    Optional<Usuario> findByEmail(String email);

    // Método para verificar si existe un usuario con un nombre específico
    boolean existsByNombre(String nombre);

    // Método para verificar si existe un usuario con un email específico
    boolean existsByEmail(String email);
}