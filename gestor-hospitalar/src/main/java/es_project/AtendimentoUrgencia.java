package es_project;

public class AtendimentoUrgencia {
    private int id_sala_urgencia;
    private boolean sala_urgencia_ocupada;

    /* GETTERS */
    
    public int getId_sala_urgencia() { return id_sala_urgencia; }

    public boolean isSala_urgencia_ocupada() { return sala_urgencia_ocupada; }

    /* SETTERS */

    public void setId_sala_urgencia(int id_sala_urgencia) { this.id_sala_urgencia = id_sala_urgencia; }

    public void setIsSala_urgencia_ocupada(boolean sala_urgencia_ocupada) { 
        this.sala_urgencia_ocupada = sala_urgencia_ocupada; 
    }

    /* METODOS */

    public void alterarEstadoSala(int salaId) {}
}
