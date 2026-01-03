package es_project.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import es_project.model.Exame;

public class ExameRepository {

    private final List<Exame> exames = new ArrayList<>();

    public ExameRepository() {
        carregarDadosPlaceholder();
    }

    private void carregarDadosPlaceholder() {

        Exame e1 = new Exame();
        e1.setId_exame(1);
        e1.setId_tipo_exame(10);
        e1.setId_consulta(100);
        e1.setData_pedido(LocalDateTime.now().minusDays(5));
        e1.setEstado_resultado("PENDENTE");

        Exame e2 = new Exame();
        e2.setId_exame(2);
        e2.setId_tipo_exame(11);
        e2.setId_consulta(100);
        e2.setData_pedido(LocalDateTime.now().minusDays(3));
        e2.setEstado_resultado("CONCLUIDO");
        e2.setExame_resultado("Normal");
        e2.setData_resultado(LocalDateTime.now().minusDays(1));

        Exame e3 = new Exame();
        e3.setId_exame(3);
        e3.setId_tipo_exame(12);
        e3.setId_consulta(200);
        e3.setData_pedido(LocalDateTime.now().minusDays(2));
        e3.setEstado_resultado("PENDENTE");

        exames.add(e1);
        exames.add(e2);
        exames.add(e3);
    }

    public Exame save(Exame exame) {
        exames.add(exame);
        return exame;
    }

    public Exame findById(int idExame) {
        for (Exame e : exames) {
            if (e.getId_exame() == idExame) {
                return e;
            }
        }
        return null;
    }

    public String obterEstado(int idExame) {
        for (Exame e : exames) {
            if (e.getId_exame() == idExame) {
                if (e.getEstado_resultado() == "Em espera") {
                    return "Os resultados do exame ainda estão em espera";
                } else {
                    return "Resultados do exame: " + e.getExame_resultado();
                }
            }
        }
        return null;
    }

    public List<Exame> findByConsulta(int idConsulta) {
        List<Exame> resultado = new ArrayList<>();
        for (Exame e : exames) {
            if (e.getId_consulta() == idConsulta) {
                resultado.add(e);
            }
        }
        return resultado;
    }
}
