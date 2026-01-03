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

    /* CONSTRUTOR */

    public Fatura() {
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
    }

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

    public void setId_fatura(int id_fatura) { this.id_fatura = id_fatura; setUpdated_at();}

    public void setId_consulta(int id_consulta) { this.id_consulta = id_consulta; setUpdated_at();}

    public void setValor_base(float valor_base) { this.valor_base = valor_base; setUpdated_at();}

    public void setValor_seguro(float valor_seguro) { this.valor_seguro = valor_seguro; setUpdated_at();}

    public void setValor_total(float valor_total) { this.valor_total = valor_total; setUpdated_at();}

    public void setEstado_fatura(float estado_fatura) { this.estado_fatura = estado_fatura; setUpdated_at(); }

    public void setUpdated_at() { 
        this.updated_at = LocalDateTime.now(); 
    }

    public void setCreated_at(LocalDateTime created_at) { 
        this.created_at = created_at; 
    }

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
