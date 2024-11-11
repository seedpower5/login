package com.jorge.login.Repository;
import com.jorge.login.Entity.Comentario;
import com.jorge.login.Entity.Pregunta;
import com.jorge.login.Entity.Respuesta;
import com.jorge.login.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComentarioRepositorio extends JpaRepository<Comentario, Long> {

    // Método para encontrar todos los comentarios asociados a una pregunta específica
    List<Comentario> findByPregunta(Pregunta pregunta);

    // Método para encontrar todos los comentarios asociados a una respuesta específica
    List<Comentario> findByRespuesta(Respuesta respuesta);

    // Método para encontrar todos los comentarios realizados por un usuario específico
    List<Comentario> findByAuthor(Usuario autor);

    // Método para obtener los comentarios más recientes, ordenados por fecha de creación
    List<Comentario> findAllByOrderByFechaCreacionDesc();
}