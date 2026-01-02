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

    public float calcularValorBase() {
        return valor_base;
    }

    public float calcularValorFinal(SeguroSaude seguro) {
        return valor_total;
    }

    public void emitirFatura() {}

    public void marcarComoPago() {}
}
