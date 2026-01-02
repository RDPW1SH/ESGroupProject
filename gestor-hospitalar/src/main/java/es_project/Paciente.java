package es_project;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Paciente {

    private int id_paciente;
    private int id_seguro;
    private LocalDate data_nascimento;
    private String genero_paciente;
    private int contacto_telemovel;
    private String morada_paciente;
    private SeguroSaude seguro_paciente;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    /* GETTERS */

    public int getId_paciente() {return id_paciente;}

    public int getId_seguro() {return id_seguro;}

    public LocalDate getData_nascimento() {return data_nascimento;}

    public String getGenero_paciente() {return genero_paciente;}

    public int getContacto_telemovel() {return contacto_telemovel;}

    public String getMorada_paciente() {return morada_paciente;}

    public SeguroSaude getSeguro_paciente() {return seguro_paciente;}

    public LocalDateTime getCreated_at() {return created_at;}

    public LocalDateTime getUpdated_at() {return updated_at;}

    /* SETTERS */

    public void setId_paciente(int id_paciente) {this.id_paciente = id_paciente;}

    public void setId_seguro(int id_seguro) {this.id_seguro = id_seguro;}

    public void setData_nascimento(LocalDate data_nascimento) {this.data_nascimento = data_nascimento;}

    public void setGenero_paciente(String genero_paciente) {this.genero_paciente = genero_paciente;}

    public void setContacto_telemovel(int contacto_telemovel) {this.contacto_telemovel = contacto_telemovel;}

    public void setMorada_paciente(String morada_paciente) {this.morada_paciente = morada_paciente;}

    public void setSeguro_paciente(SeguroSaude seguro_paciente) {this.seguro_paciente = seguro_paciente;}

    public void setCreated_at(LocalDateTime created_at) {this.created_at = created_at;}

    public void setUpdated_at(LocalDateTime updated_at) {this.updated_at = updated_at;}
}
