package es_project;

import java.time.LocalDateTime;

public class Utilizador {
    private int id_utilizador;
    private String nome_utilizador;
    private String email_utilizador;
    private int idade_utilizador;
    private String password_utilizador;
    private int telemovel_utilizador;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    /* CONSTRUTOR */

    public Utilizador() {
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
    }

    /* GETTERS */

    public int getId_utilizador() {
        return id_utilizador;
    }

    public String getNome_utilizador() {
        return nome_utilizador;
    }

    public String getEmail_utilizador() {
        return email_utilizador;
    }

    public int getIdade_utilizador() {
        return idade_utilizador;
    }

    public String getPassword_utilizador() {
        return password_utilizador;
    }

    public int getTelemovel_utilizador() {
        return telemovel_utilizador;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    /* SETTERS */

    public void setId_utilizador(int id_utilizador) {
        this.id_utilizador = id_utilizador;
        setUpdated_at();
    }

    public void setNome_utilizador(String nome_utilizador) {
        this.nome_utilizador = nome_utilizador;
        setUpdated_at();
    }

    public void setEmail_utilizador(String email_utilizador) {
        this.email_utilizador = email_utilizador;
        setUpdated_at();
    }

    public void setIdade_utilizador(int idade_utilizador) {
        this.idade_utilizador = idade_utilizador;
        setUpdated_at();
    }

    public void setPassword_utilizador(String password_utilizador) {
        this.password_utilizador = password_utilizador;
        setUpdated_at();
    }

    public void setTelemovel_utilizador(int telemovel_utilizador) {
        this.telemovel_utilizador = telemovel_utilizador;
        setUpdated_at();
    }

    protected void setUpdated_at() {
        this.updated_at = LocalDateTime.now();
    }

    private void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    /* METODOS */

    public boolean login(String email, String password) {
        return true;
    }

    public void logout() {

    }

    public boolean atualizarDados(Utilizador utilizador) {
        setUpdated_at();
        return true;
    }
}
