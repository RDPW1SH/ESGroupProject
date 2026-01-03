package es_project;

public class Medicamento {
    private int id_medicamento;
    private int id_tipo_medicamento;
    private String nome_medicamento;

    /* GETTERS */

    public int getId_medicamento() {
        return id_medicamento;
    }

    public int getId_tipo_consulta() {
        return id_tipo_medicamento;
    }

    public String getNome_medicamento() {
        return nome_medicamento;
    }

    /* SETTERS */

    public void setId_medicamento(int id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    public void setId_tipo_medicamento(int id_tipo_medicamento) {
        this.id_tipo_medicamento = id_tipo_medicamento;
    }

    public void setNome_medicamento(String nome_medicamento) {
        this.nome_medicamento = nome_medicamento;
    }
}
