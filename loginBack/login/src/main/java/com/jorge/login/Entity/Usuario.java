package com.jorge.login.Entity;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String password;

    private String email;

    // Relación con los roles de usuario (Admin o User)
    @Enumerated(EnumType.STRING)
    private Rol rol;

    // Relación de un usuario con sus publicaciones (si las hay)
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Pregunta> posts = new HashSet<>();

    // Relación de un usuario con los comentarios que hace en el foro
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Comentario> comments = new HashSet<>();

    // Relación de un usuario con las respuestas a preguntas
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Pregunta> answers = new HashSet<>();

    // Constructor sin parámetros (necesario para JPA)
    public Usuario() {}

    // Constructor con parámetros (opcional)
    public Usuario(String nombre, String password, String email, Rol rol) {
        this.nombre = nombre;
        this.password = password;
        this.email = email;
        this.rol = rol;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Set<Pregunta> getPosts() {
        return posts;
    }

    public void setPosts(Set<Pregunta> posts) {
        this.posts = posts;
    }

    public Set<Comentario> getComments() {
        return comments;
    }

    public void setComments(Set<Comentario> comments) {
        this.comments = comments;
    }

    public Set<Pregunta> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Pregunta> answers) {
        this.answers = answers;
    }
}
