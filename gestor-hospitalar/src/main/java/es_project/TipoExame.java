package es_project;

import java.time.LocalDateTime;

public class TipoExame {
    private int id_tipo_exame;
    private String descricao_tipo_exame;
    private int prazo_normal_dias_exame;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    /* GETTERS */
    
    public int getId_tipo_exame() { return id_tipo_exame; }

    public String getDescricao_tipo_exame() { return descricao_tipo_exame; }

    public int getPrazo_normal_dias_exame() { return prazo_normal_dias_exame; }

    /* SETTERS */

    public void setId_tipo_exame(int id_tipo_exame) { this.id_tipo_exame = id_tipo_exame; }

    public void setDescricao_tipo_exame(String descricao_tipo_exame) { 
        this.descricao_tipo_exame = descricao_tipo_exame; 
    }

    public void setPrazo_normal_dias_exame(int prazo_normal_dias_exame) { 
        this.prazo_normal_dias_exame = prazo_normal_dias_exame; 
    }
}