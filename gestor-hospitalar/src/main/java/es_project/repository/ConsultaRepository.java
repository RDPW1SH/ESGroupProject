package es_project.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import es_project.model.Consulta;

public class ConsultaRepository {

    private final List<Consulta> consultas = new ArrayList<>();

    public ConsultaRepository() {
        carregarDadosTeste();
    }

    private void carregarDadosTeste() {

        Consulta c1 = new Consulta();
        c1.setId_consulta(1);
        c1.setId_tipo_consulta(10);
        c1.setId_paciente(100);
        c1.setId_medico(200);
        c1.setEstado_consulta("AGENDADA");
        c1.setData_inicio(LocalDateTime.now().plusDays(1));
        c1.setData_fim(LocalDateTime.now().plusDays(1).plusHours(1));

        Consulta c2 = new Consulta();
        c2.setId_consulta(2);
        c2.setId_tipo_consulta(11);
        c2.setId_paciente(101);
        c2.setId_medico(200);
        c2.setEstado_consulta("CONCLUIDA");
        c2.setData_inicio(LocalDateTime.now().minusDays(2));
        c2.setData_fim(LocalDateTime.now().minusDays(2).plusHours(1));

        consultas.add(c1);
        consultas.add(c2);
    }

    public Consulta save(Consulta consulta) {
        consultas.add(consulta);
        return consulta;
    }

    public Consulta findById(int idConsulta) {
        for (Consulta c : consultas) {
            if (c.getId_consulta() == idConsulta) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Consulta> getConsultasByPaciente(int idPaciente) {
        ArrayList<Consulta> consultaList = new ArrayList<Consulta>();
        for (Consulta c : consultas) {
            if (c.getId_consulta() == idPaciente) {
                consultaList.add(c);
            }
        }
        return consultaList;
    }

    public boolean medicoDisponivel(int idMedico, LocalDateTime inicio, LocalDateTime fim) {
        for (Consulta c : consultas) {
            if (c.getId_medico() == idMedico &&
                    c.getData_inicio().isBefore(fim) &&
                    c.getData_fim().isAfter(inicio)) {
                return false;
            }
        }
        return true;
    }
}
