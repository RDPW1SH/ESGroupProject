package es_project.repository;

import java.util.ArrayList;
import java.util.List;

import es_project.model.TipoExame;

public class TipoExameRepository {

    private final List<TipoExame> tipos = new ArrayList<>();

    public TipoExameRepository() {

        TipoExame t1 = new TipoExame();
        t1.setId_tipo_exame(1);
        t1.setDescricao_tipo_exame("exame geral");
        t1.setPrazo_normal_dias_exame(14);

        TipoExame t2 = new TipoExame();
        t2.setId_tipo_exame(2);
        t2.setDescricao_tipo_exame("exame Raio-x");
        t2.setPrazo_normal_dias_exame(10);

        tipos.add(t1);
        tipos.add(t2);
    }

    public String getTipo_exame(int idTipoExame) {
        for (TipoExame t : tipos) {
            if (t.getId_tipo_exame() == idTipoExame) {
                return "Descrição exame: " + t.getDescricao_tipo_exame();
            }
        }
        return "Tipo de exame não encontrado";
    }
}
