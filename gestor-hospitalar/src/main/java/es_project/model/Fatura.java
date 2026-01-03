package es_project.model;

import java.time.LocalDateTime;

public class Fatura {
    private int id_fatura;
    private int id_consulta;
    private double valor_base;
    private double valor_seguro;
    private double valor_total;
    private LocalDateTime data_emissao;
    private String estado_fatura;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    /* CONSTRUTOR */

    public Fatura() {
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
    }

    /* GETTERS */

    public int getId_fatura() {
        return id_fatura;
    }

    public int getId_consulta() {
        return id_consulta;
    }

    public double getValor_base() {
        return valor_base;
    }

    public double getValor_seguro() {
        return valor_seguro;
    }

    public double getValor_total() {
        return valor_total;
    }

    public LocalDateTime getData_emissao() {
        return data_emissao;
    }

    public String getEstado_fatura() {
        return estado_fatura;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    /* SETTERS */

    public void setId_fatura(int id_fatura) {
        this.id_fatura = id_fatura;
        setUpdated_at();
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
        setUpdated_at();
    }

    public void setValor_base(double valor_base) {
        this.valor_base = valor_base;
        setUpdated_at();
    }

    public void setValor_seguro(double valor_seguro) {
        this.valor_seguro = valor_seguro;
        setUpdated_at();
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
        setUpdated_at();
    }

    public void setData_emissao(LocalDateTime data_emissao) {
        this.data_emissao = data_emissao;
        setUpdated_at();
    }

    public void setEstado_fatura(String estado_fatura) {
        this.estado_fatura = estado_fatura;
        setUpdated_at();
    }

    public void setUpdated_at() {
        this.updated_at = LocalDateTime.now();
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    /* METODOS */

    public double calcularValorBase() {
        return valor_base;
    }

    public double calcularValorFinal(SeguroSaude seguro) {
        return valor_total;
    }

    public void emitirFatura() {
    }

    public void marcarComoPago() {
    }
}
