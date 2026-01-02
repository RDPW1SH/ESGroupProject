package es_project;

import java.time.LocalDateTime;

public class Fatura {
    private int id_fatura;
    private int id_consulta;
    private float valor_base;
    private float valor_seguro;
    private float valor_total;
    private float estado_fatura;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    /* GETTERS */
    
    public int getId_fatura() { return id_fatura; }

    public int getId_consulta() { return id_consulta; }

    public float getValor_base() { return valor_base; }

    public float getValor_seguro() { return valor_seguro; }

    public float getValor_total() { return valor_total; }

    public float getEstado_fatura() { return estado_fatura; }

    public LocalDateTime getCreated_at() { return created_at; }

    public LocalDateTime getUpdated_at() { return updated_at; }

    /* SETTERS */

    public void setId_fatura(int id_fatura) { this.id_fatura = id_fatura; }

    public void setId_consulta(int id_consulta) { this.id_consulta = id_consulta; }

    public void setValor_base(float valor_base) { this.valor_base = valor_base; }

    public void setValor_seguro(float valor_seguro) { this.valor_seguro = valor_seguro; }

    public void setValor_total(float valor_total) { this.valor_total = valor_total; }

    public void setEstado_fatura(float estado_fatura) { this.estado_fatura = estado_fatura; }

    public void setCreated_at(LocalDateTime created_at) { this.created_at = created_at; }

    public void setUpdated_at(LocalDateTime updated_at) { this.updated_at = updated_at; }

    /* METODOS */

    public float calcularValorBase() {
        return valor_base;
    }

    public float calcularValorFinal(SeguroSaude seguro) {
        return valor_total;
    }

    public void emitirFatura() {}

    public void marcarComoPago() {}
}
