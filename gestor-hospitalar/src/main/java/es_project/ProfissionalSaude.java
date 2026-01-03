package es_project;

import java.util.List;

public class ProfissionalSaude extends Utilizador {

    private int id_profissional;
    private boolean profissional_ativo;

    /* GETTERS */

    public int getId_profissional() {
        return id_profissional;
    }

    public boolean isProfissional_ativo() {
        return profissional_ativo;
    }

    /* SETTERS */

    public void setId_profissional(int id_profissional) {
        this.id_profissional = id_profissional;
        setUpdated_at();
    }

    public void setProfissional_ativo(boolean profissional_ativo) {
        this.profissional_ativo = profissional_ativo;
        setUpdated_at();
    }

    /* METODOS */

    public List<EscalaProfissional> consultarEscala() {
        return null;
    }
}
