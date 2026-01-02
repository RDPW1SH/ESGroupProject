package es_project;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EscalaProfissional {
    private int id_escala;
    private LocalDate data_inicio;
    private LocalDate data_fim;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    /* GETTERS */

    public int getId_escala() {return id_escala;}

    public LocalDate getData_inicio() {return data_inicio;}
    
    public LocalDate getData_fim() {return data_fim;}

    /* SETTERS */

    public void setId_escala(int id_escala) {this.id_escala = id_escala;}

    public void setData_inicio(LocalDate data_inicio) {this.data_inicio = data_inicio;}

    public void setData_fim(LocalDate data_fim) {this.data_fim = data_fim;}

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
