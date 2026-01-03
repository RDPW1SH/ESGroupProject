package es_project.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import es_project.model.Fatura;

public class FaturaRepository {

    private final List<Fatura> faturas = new ArrayList<>();

    public FaturaRepository() {
        carregarDadosTeste();
    }

    private void carregarDadosTeste() {
        Fatura f1 = new Fatura();
        f1.setId_fatura(1);
        f1.setId_consulta(1);
        f1.setValor_base(50.0);
        f1.setValor_total(50.0);
        f1.setData_emissao(LocalDateTime.now().minusDays(1));
        f1.setEstado_fatura("PENDENTE");

        Fatura f2 = new Fatura();
        f2.setId_fatura(2);
        f2.setId_consulta(2);
        f2.setValor_base(80.0);
        f2.setValor_total(80.0);
        f2.setData_emissao(LocalDateTime.now().minusDays(2));
        f2.setEstado_fatura("PAGA");

        faturas.add(f1);
        faturas.add(f2);
    }

    public Fatura save(Fatura fatura) {
        faturas.add(fatura);
        return fatura;
    }

    public Fatura findByConsulta(int idConsulta) {
        for (Fatura f : faturas) {
            if (f.getId_consulta() == idConsulta) {
                return f;
            }
        }
        return null;
    }

    public ArrayList<Fatura> findByPacienteId(int idPaciente) {
        ArrayList<Fatura> minhasFaturas = new ArrayList<Fatura>();
        for (Fatura f : faturas) {
            if (f.getId_consulta() == idPaciente) {
                minhasFaturas.add(f);
            }
        }
        return minhasFaturas;
    }

    public String marcarFaturaComoPaga(int idConsulta) {
        for (Fatura f : faturas) {
            if (f.getId_consulta() == idConsulta) {
                if (f.getEstado_fatura() == "Por pagar") {
                    f.setEstado_fatura("Paga");
                    return "A fatura foi paga";
                } else {
                    return "A fatura já foi paga anteriormente";
                }
            }
        }
        return "Ocorreu um erro, tente mais tarde";
    }

    public ArrayList<Fatura> findAll() {
        return new ArrayList<>(faturas);
    }
}
