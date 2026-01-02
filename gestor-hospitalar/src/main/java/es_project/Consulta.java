package es_project;

import java.time.LocalDateTime;

public class Consulta {
    private int id_consulta;
    private int id_tipo_consulta;
    private int id_medico;
    private String estado_consulta;
    private LocalDateTime data_inicio;
    private LocalDateTime data_fim;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    /* GETTERS */

    public int getId_consulta() {return id_consulta;}

    public int getId_tipo_consulta() {return id_tipo_consulta;}

    public int getId_medico() {return id_medico;}

    public String getEstado_consulta() {return estado_consulta;}

    public LocalDateTime getData_inicio() {return data_inicio;}

    public LocalDateTime getData_fim() {return data_fim;}

    /* SETTERS */
    
    public void setId_consulta(int id_consulta) {this.id_consulta = id_consulta;}

    public void setId_paciente(int id_tipo_consulta) {this.id_tipo_consulta = id_tipo_consulta;}

    public void setId_medico(int id_medico) {this.id_medico = id_medico;}

    public void setEstado_consulta(String estado_consulta) {this.estado_consulta = estado_consulta;}

    public void setData_inicio(LocalDateTime data_inicio) {this.data_inicio = data_inicio;}

    public void setData_fim(LocalDateTime data_fim) {this.data_fim = data_fim;}

    /* METODOS */

    public boolean alterarEstadoConsulta(String novoEstado) {
        return true;
    }
}
