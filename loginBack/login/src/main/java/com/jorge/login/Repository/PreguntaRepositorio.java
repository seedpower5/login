package com.jorge.login.Repository;

import com.jorge.login.Entity.Pregunta;
import com.jorge.login.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PreguntaRepositorio extends JpaRepository<Pregunta, Long> {

    // Método para encontrar todas las preguntas realizadas por un usuario específico
    List<Pregunta> findByAuthor(Usuario autor);

    // Método para buscar preguntas que contengan una palabra clave en el título
    List<Pregunta> findByTituloContaining(String keyword);

    // Método para buscar preguntas recientes (ordenadas por fecha de creación)
    List<Pregunta> findAllByOrderByFechaCreacionDesc();
}