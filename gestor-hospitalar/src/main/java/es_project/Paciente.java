package es_project;

import java.time.LocalDate;

public class Paciente extends Utilizador {

    private int id_paciente;
    private int id_seguro;
    private LocalDate data_nascimento;
    private String genero_paciente;
    private int contacto_telemovel;
    private String morada_paciente;

    /* GETTERS */

    public int getId_paciente() {
        return id_paciente;
    }

    public int getId_seguro() {
        return id_seguro;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public String getGenero_paciente() {
        return genero_paciente;
    }

    public int getContacto_telemovel() {
        return contacto_telemovel;
    }

    public String getMorada_paciente() {
        return morada_paciente;
    }

    /* SETTERS */

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
        setUpdated_at();
    }

    public void setId_seguro(int id_seguro) {
        this.id_seguro = id_seguro;
        setUpdated_at();
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
        setUpdated_at();
    }

    public void setGenero_paciente(String genero_paciente) {
        this.genero_paciente = genero_paciente;
        setUpdated_at();
    }

    public void setContacto_telemovel(int contacto_telemovel) {
        this.contacto_telemovel = contacto_telemovel;
        setUpdated_at();
    }

    public void setMorada_paciente(String morada_paciente) {
        this.morada_paciente = morada_paciente;
        setUpdated_at();
    }

}
