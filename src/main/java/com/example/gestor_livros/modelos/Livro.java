package com.example.gestor_livros.modelos;

import java.util.UUID;

public class Livro {
private UUID id;
private String titulo , autor , editora;
private int paginas;

    public Livro( String titulo, String autor, String editora, int paginas) {
        this.id = UUID.randomUUID();
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.paginas = paginas;
    }

    public UUID getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getPaginas() {
        return paginas;
    }
}
