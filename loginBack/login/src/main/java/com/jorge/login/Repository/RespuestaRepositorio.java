package com.jorge.login.Repository;

import com.jorge.login.Entity.Respuesta;
import com.jorge.login.Entity.Pregunta;
import com.jorge.login.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RespuestaRepositorio extends JpaRepository<Respuesta, Long> {

    // Método para encontrar todas las respuestas asociadas a una pregunta específica
    List<Respuesta> findByPregunta(Pregunta pregunta);

    // Método para encontrar todas las respuestas realizadas por un usuario específico
    List<Respuesta> findByAuthor(Usuario autor);

    // Método para encontrar respuestas recientes (ordenadas por fecha de creación)
    List<Respuesta> findAllByOrderByFechaCreacionDesc();
}