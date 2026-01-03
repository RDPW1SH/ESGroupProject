package es_project.model;

public class TipoMedicamento {
    private int id_tipo_medicamento;
    private String nome_tipo_medicamento;
    private String descricao_tipo_medicamento;

    /* GETTERS */

    public int getId_tipo_medicamento() {
        return id_tipo_medicamento;
    }

    public String getNome_tipo_medicamento() {
        return nome_tipo_medicamento;
    }

    public String getDescricao_tipo_medicamento() {
        return descricao_tipo_medicamento;
    }

    /* SETTERS */

    public void setId_tipo_medicamento(int id_tipo_medicamento) {
        this.id_tipo_medicamento = id_tipo_medicamento;
    }

    public void setNome_tipo_medicamento(String nome_tipo_medicamento) {
        this.nome_tipo_medicamento = nome_tipo_medicamento;
    }

    public void setDescricao_tipo_medicamento(String descricao_tipo_medicamento) {
        this.descricao_tipo_medicamento = descricao_tipo_medicamento;
    }
}