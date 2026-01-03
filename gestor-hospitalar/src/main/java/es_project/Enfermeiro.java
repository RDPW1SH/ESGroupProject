package es_project;

import java.util.List;

public class Enfermeiro extends ProfissionalSaude {

    private String tipo_enfermeiro;

    /* GETTERS */

    public String getTipo_enfermeiro() {
        return tipo_enfermeiro;
    }

    /* SETTERS */

    public void setTipo_enfermeiro(String tipo_enfermeiro) {
        this.tipo_enfermeiro = tipo_enfermeiro;
    }

    /* METODOS */

    public List<Exame> acompanharExames(int pacienteId) {
        return null;
    }
}
