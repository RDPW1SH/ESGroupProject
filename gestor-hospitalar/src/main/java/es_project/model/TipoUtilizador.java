package es_project.model;

import java.time.LocalDateTime;

public class TipoUtilizador {
    private int id_tipo_utilizador;
    private String nome_tipo_utilizador;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    /* CONSTRUTOR */

    public TipoUtilizador() {
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
    }

    /* GETTERS */

    public int getId_tipo_utilizador() {
        return id_tipo_utilizador;
    }

    public String getNome_tipo_utilizador() {
        return nome_tipo_utilizador;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    /* SETTERS */

    public void setId_tipo_utilizador(int id_tipo_utilizador) {
        this.id_tipo_utilizador = id_tipo_utilizador;
        setUpdated_at();
    }

    public void setNome_tipo_utilizador(String nome_tipo_utilizador) {
        this.nome_tipo_utilizador = nome_tipo_utilizador;
        setUpdated_at();
    }

    private void setUpdated_at() {
        this.updated_at = LocalDateTime.now();
    }

    private void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }
}