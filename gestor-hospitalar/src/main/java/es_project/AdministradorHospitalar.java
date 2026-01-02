package es_project;

import java.time.LocalDateTime;
import java.util.List;

public class AdministradorHospitalar {
    private int id_profissional;
    private boolean profissional_ativo;
    private boolean motivo_inatividade;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public List<EscalaProfissional> consultarEscala() {
        return List.of();
    }
}
