package es_project.model;

import java.time.LocalDateTime;

public class Exame {
    private int id_exame;
    private int id_tipo_exame;
    private int id_consulta;
    private LocalDateTime data_pedido;
    private LocalDateTime data_realizado;
    private LocalDateTime data_resultado;
    private String estado_resultado;
    private String exame_resultado;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    /* CONSTRUTOR */

    public Exame() {
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
    }

    /* GETTERS */

    public int getId_exame() {
        return id_exame;
    }

    public int getId_tipo_exame() {
        return id_tipo_exame;
    }

    public int getId_consulta() {
        return id_consulta;
    }

    public LocalDateTime getData_pedido() {
        return data_pedido;
    }

    public LocalDateTime getData_realizado() {
        return data_realizado;
    }

    public LocalDateTime getData_resultado() {
        return data_resultado;
    }

    public String getEstado_resultado() {
        return estado_resultado;
    }

    public String getExame_resultado() {
        return exame_resultado;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    /* SETTERS */

    public void setId_exame(int id_exame) {
        this.id_exame = id_exame;
        setUpdated_at();
    }

    public void setId_tipo_exame(int id_tipo_exame) {
        this.id_tipo_exame = id_tipo_exame;
        setUpdated_at();
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
        setUpdated_at();
    }

    public void setData_pedido(LocalDateTime data_pedido) {
        this.data_pedido = data_pedido;
        setUpdated_at();
    }

    public void setData_realizado(LocalDateTime data_realizado) {
        this.data_realizado = data_realizado;
        setUpdated_at();
    }

    public void setData_resultado(LocalDateTime data_resultado) {
        this.data_resultado = data_resultado;
        setUpdated_at();
    }

    public void setEstado_resultado(String estado_resultado) {
        this.estado_resultado = estado_resultado;
        setUpdated_at();
    }

    public void setExame_resultado(String exame_resultado) {
        this.exame_resultado = exame_resultado;
        setUpdated_at();
    }

    private void setUpdated_at() {
        this.updated_at = LocalDateTime.now();
    }

    private void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }
}
