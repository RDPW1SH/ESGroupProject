package es_project;

import java.util.List;

public class Enfermeiro {

    private String tipo_enfermeiro;

    /* GETTERS */
    
    public int getTipo_enfermeiro() { return tipo_enfermeiro; }

    /* SETTERS */

    public void setTipo_enfermeiro(int tipo_enfermeiro) { this.tipo_enfermeiro = tipo_enfermeiro; }

    /* METODOS */

    public List<Exame> acompanharExames(int pacienteId) {
        return List.of();
    }
}
