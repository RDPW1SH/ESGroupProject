package es_project;

import java.time.LocalDateTime;

public class Consulta {
    private int id_consulta;
    private int id_tipo_consulta;
    private int id_paciente;
    private int id_medico;
    private String estado_consulta;
    private LocalDateTime data_inicio;
    private LocalDateTime data_fim;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    /* CONSTRUTOR */

    public Consulta() {
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
    }

    /* GETTERS */

    public int getId_consulta() {return id_consulta;}

    public int getId_tipo_consulta() {return id_tipo_consulta;}

    public int getId_paciente() {return id_paciente;}

    public int getId_medico() {return id_medico;}

    public String getEstado_consulta() {return estado_consulta;}

    public LocalDateTime getData_inicio() {return data_inicio;}

    public LocalDateTime getData_fim() {return data_fim;}

    public LocalDateTime getCreated_at() {return created_at;}

    public LocalDateTime getUpdated_at() {return updated_at;}

    /* SETTERS */
    
    public void setId_consulta(int id_consulta) {this.id_consulta = id_consulta; setUpdated_at();}

    public void setId_tipo_consulta(int id_tipo_consulta) {this.id_tipo_consulta = id_tipo_consulta; setUpdated_at();}

    public void setId_paciente(int id_paciente) {this.id_paciente = id_paciente; setUpdated_at();}

    public void setId_medico(int id_medico) {this.id_medico = id_medico; setUpdated_at();}

    public void setEstado_consulta(String estado_consulta) {this.estado_consulta = estado_consulta; setUpdated_at();}

    public void setData_inicio(LocalDateTime data_inicio) {this.data_inicio = data_inicio; setUpdated_at();}

    public void setData_fim(LocalDateTime data_fim) {this.data_fim = data_fim; setUpdated_at();}

    private void setUpdated_at() {
        this.updated_at = LocalDateTime.now();
    }

    private void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    /* METODOS */

    public boolean alterarEstadoConsulta(String novoEstado) {
        this.estado_consulta = novoEstado;
        setUpdated_at();
        return true;
    }
}
