package es_project.controller;

import es_project.model.Consulta;
import es_project.repository.ConsultaRepository;
import es_project.repository.TipoConsultaRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ConsultaController {

    private final ConsultaRepository consultaRepository;
    private final TipoConsultaRepository tipoConsultaRepository;

    public ConsultaController(
            ConsultaRepository consultaRepository,
            TipoConsultaRepository tipoConsultaRepository) {
        this.consultaRepository = consultaRepository;
        this.tipoConsultaRepository = tipoConsultaRepository;
    }

    public Consulta criarConsulta(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    public Consulta obterConsultaPorId(int idConsulta) {
        return consultaRepository.findById(idConsulta);
    }

    public ArrayList<Consulta> obterConsultas(int idPaciente) {
        return consultaRepository.getConsultasByPaciente(idPaciente);
    }

    public double obterPrecoConsulta(int idTipoConsulta) {
        return tipoConsultaRepository.getPreco(idTipoConsulta);
    }

    public boolean verificarDisponibilidade(
            int idMedico,
            LocalDateTime dataInicio,
            LocalDateTime dataFim) {
        return consultaRepository.medicoDisponivel(idMedico, dataInicio, dataFim);
    }

    public boolean alterarEstadoConsulta(int idConsulta, String novoEstado) {
        Consulta c = consultaRepository.findById(idConsulta);
        if (c == null) {
            return false;
        }
        c.setEstado_consulta(novoEstado);
        return true;
    }

}
