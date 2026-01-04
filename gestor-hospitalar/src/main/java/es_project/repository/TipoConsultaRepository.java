package es_project.repository;

import java.util.ArrayList;
import java.util.List;

import es_project.model.TipoConsulta;

public class TipoConsultaRepository {

    private final List<TipoConsulta> tipos = new ArrayList<>();

    public TipoConsultaRepository() {

        TipoConsulta t1 = new TipoConsulta();
        t1.setId_tipo_consulta(1);
        t1.setDescricao_tipo_consulta("Geral");
        /* Minutos */
        t1.setDuracao_media(30);
        /* Euros */
        t1.setValor_base(20.0);

        TipoConsulta t2 = new TipoConsulta();
        t2.setId_tipo_consulta(2);
        t2.setDescricao_tipo_consulta("Fisioterapia");
        /* Minutos */
        t2.setDuracao_media(45);
        /* Euros */
        t2.setValor_base(30.0);

        tipos.add(t1);
        tipos.add(t2);
    }

    public TipoConsulta findById(int idTipoConsulta) {
        for (TipoConsulta t : tipos) {
            if (t.getId_tipo_consulta() == idTipoConsulta) {
                return t;
            }
        }
        return null;
    }

    public double getPreco(int idTipoConsulta) {
        for (TipoConsulta t : tipos) {
            if (t.getId_tipo_consulta() == idTipoConsulta) {
                return t.getValor_base();
            }
        }
        return 0.0;
    }
}
