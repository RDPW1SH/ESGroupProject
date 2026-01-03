package es_project.model;

import java.time.LocalDateTime;

public class EscalaProfissional {
    private int id_escala;
    private int id_profissional;
    private LocalDateTime data_inicio;
    private LocalDateTime data_fim;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    /* CONSTRUTOR */

    public EscalaProfissional() {
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
    }

    /* GETTERS */

    public int getId_escala() {
        return id_escala;
    }

    public int getId_profissional() {
        return id_profissional;
    }

    public LocalDateTime getData_inicio() {
        return data_inicio;
    }

    public LocalDateTime getData_fim() {
        return data_fim;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    /* SETTERS */

    public void setId_escala(int id_escala) {
        this.id_escala = id_escala;
        setUpdated_at();
    }

    public void setId_profissional(int id_profissional) {
        this.id_profissional = id_profissional;
        setUpdated_at();
    }

    public void setData_inicio(LocalDateTime data_inicio) {
        this.data_inicio = data_inicio;
        setUpdated_at();
    }

    public void setData_fim(LocalDateTime data_fim) {
        this.data_fim = data_fim;
        setUpdated_at();
    }

    private void setUpdated_at() {
        this.updated_at = LocalDateTime.now();
    }

    private void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

}
