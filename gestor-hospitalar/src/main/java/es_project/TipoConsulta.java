package es_project;

import java.time.LocalDateTime;

public class TipoConsulta {
    private int id_tipo_consulta;
    private String descricao_tipo_consulta;
    private int duracao_media;
    private float valor_base;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    /* CONSTRUTOR */

    public TipoConsulta() {
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
    }

    /* GETTERS */
    
    public int getId_tipo_consulta() { return id_tipo_consulta; }

    public String getDescricao_tipo_consulta() { return descricao_tipo_consulta; }

    public int getDuracao_media() { return duracao_media; }

    public float getValor_base() { return valor_base; }

    public LocalDateTime getCreated_at() { return created_at; }

    public LocalDateTime getUpdated_at() { return updated_at; }

    /* SETTERS */

    public void setId_tipo_consulta(int id_tipo_consulta) { this.id_tipo_consulta = id_tipo_consulta; setUpdated_at();}

    public void setDescricao_tipo_consulta(String descricao_tipo_consulta) { 
        this.descricao_tipo_consulta = descricao_tipo_consulta; 
        setUpdated_at();
    }

    public void setDuracao_media(int duracao_media) { this.duracao_media = duracao_media; setUpdated_at();}

    public void setDescricao_relatorio(float valor_base) { this.valor_base = valor_base; setUpdated_at(); }

    private void setUpdated_at() {
        this.updated_at = LocalDateTime.now();
    }

    private void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    } 
}
