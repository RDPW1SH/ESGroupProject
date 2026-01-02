package es_project;

import java.time.LocalDateTime;
import java.util.List;

public class AdministradorHospitalar {
    private int id_profissional;
    private boolean profissional_ativo;
    private String motivo_inatividade;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    /* GETTERS */
    
    public int getId_profissional() { return id_profissional; }

    public boolean isProfissional_ativo() { return profissional_ativo; }

    public int getmMotivo_inatividade() { return motivo_inatividade; }

    /* SETTERS */

    public void setId_tipo_exame(int id_profissional) { this.id_profissional = id_profissional; }

    public void setProfissional_ativo(boolean profissional_ativo) { 
        this.profissional_ativo = profissional_ativo; 
    }

    public void setMotivo_inatividade(String motivo_inatividade) { 
        this.motivo_inatividade = motivo_inatividade; 
    }
}
