package es_project.model;

import java.time.LocalDateTime;

public class StockMedicamento {
    private int id_medicamento;
    private int quantidade_atual;
    private LocalDateTime updated_at;

    /* GETTERS */

    public int getId_medicamento() {
        return id_medicamento;
    }

    public int getQuantidade_atual() {
        return quantidade_atual;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    /* SETTERS */

    public void setId_medicamento(int id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    public void setQuantidade_atual(int quantidade_atual) {
        this.quantidade_atual = quantidade_atual;
    }

    public void setUpdated_at() {
        this.updated_at = LocalDateTime.now();
    }

}
