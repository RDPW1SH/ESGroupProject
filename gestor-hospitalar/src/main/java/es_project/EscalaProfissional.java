package es_project;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EscalaProfissional {
    private int id_escala;
    private LocalDate data_inicio;
    private LocalDate data_fim;
    private int id_servico;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public boolean criarEscala(int profissionalId, LocalDate inicio, LocalDate fim, String turno) {
        return true;
    }

    public boolean encontrarConflitos() {
        return false;
    }

    public void atualizarEscala() {}

    public void removerEscala(int id) {}
}
