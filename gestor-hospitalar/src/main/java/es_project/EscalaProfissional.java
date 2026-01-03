package es_project;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EscalaProfissional {
    private int id_escala;
    private LocalDate data_inicio;
    private LocalDate data_fim;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    /* CONSTRUTOR */

    public EscalaProfissional() {
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
    }

    /* GETTERS */

    public int getId_escala() {return id_escala;}

    public LocalDate getData_inicio() {return data_inicio;}
    
    public LocalDate getData_fim() {return data_fim;}

    public LocalDateTime getCreated_at() {return created_at;}

    public LocalDateTime getUpdated_at() {return updated_at;}

    /* SETTERS */

    public void setId_escala(int id_escala) {this.id_escala = id_escala; setUpdated_at();}

    public void setData_inicio(LocalDate data_inicio) {this.data_inicio = data_inicio; setUpdated_at();}

    public void setData_fim(LocalDate data_fim) {this.data_fim = data_fim; setUpdated_at();}

    private void setUpdated_at() {
        this.updated_at = LocalDateTime.now();
    }

    private void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    /* METODOS */

    public boolean criarEscala(int profissionalId, LocalDate inicio, LocalDate fim, String turno) {
        return true;
    }

    public boolean encontrarConflitos() {
        return false;
    }

    public void atualizarEscala() {}

    public void removerEscala(int id) {}
}
