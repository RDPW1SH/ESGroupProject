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

    public boolean alterarEstadoConsulta(String novoEstado) {
        return true;
    }
}
