package es_project.controller;

import es_project.model.Consulta;
import es_project.model.Paciente;
import es_project.repository.ConsultaRepository;
import es_project.repository.PacienteRepository;
import es_project.repository.SeguroService;
import es_project.repository.TipoConsultaRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ConsultaController {

    private final ConsultaRepository consultaRepository;
    private PacienteRepository pacienteRepository = new PacienteRepository();
    private TipoConsultaRepository tipoConsultaRepository = new TipoConsultaRepository();

    public ConsultaController(
            ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;

    }

    public Consulta criarConsulta(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    public Consulta obterConsultaPorId(int idConsulta) {
        return consultaRepository.findById(idConsulta);
    }

    public ArrayList<Consulta> obterConsultas(int idUser) {
        Paciente paciente = pacienteRepository.getPacienteByUserId(idUser);
        ArrayList<Consulta> consultas = new ArrayList<Consulta>();
        if (paciente != null) {
            return consultaRepository.getConsultasByPaciente(paciente.getId_paciente());
        }
        return consultas;

    }

    public ArrayList<Consulta> obterConsultasPaciente(int idPaciente) {
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
