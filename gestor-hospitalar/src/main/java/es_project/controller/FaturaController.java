package es_project.controller;

import es_project.model.Fatura;
import es_project.model.Paciente;
import es_project.model.Consulta;
import es_project.model.SeguroSaude;
import es_project.model.TipoConsulta;
import es_project.repository.FaturaRepository;
import es_project.repository.PacienteRepository;
import es_project.repository.SeguroService;
import es_project.repository.TipoConsultaRepository;
import es_project.repository.ConsultaRepository;

import java.util.ArrayList;

public class FaturaController {

    private final FaturaRepository faturaRepository;
    private ConsultaRepository consultaRepository = new ConsultaRepository();
    private SeguroService seguroService = new SeguroService();
    private PacienteRepository pacienteRepository = new PacienteRepository();
    private TipoConsultaRepository tipoConsultaRepository = new TipoConsultaRepository();

    public FaturaController(FaturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
    }

    public Fatura criarFatura(Fatura fatura) {
        return faturaRepository.save(fatura);
    }

    public double calcularValorConsulta(int idConsulta) {

        Consulta dadosConsulta = consultaRepository.findById(idConsulta);
        if (dadosConsulta == null) {
            System.out.print("Null em consulta");
            return 0.0;
        }

        TipoConsulta dadosTipoConsulta = tipoConsultaRepository.findById(dadosConsulta.getId_tipo_consulta());
        if (dadosTipoConsulta == null) {
            System.out.print("Null em tipoconsulta");
            return 0.0;
        }

        double valorBase = dadosTipoConsulta.getValor_base();

        Paciente dadosPaciente = pacienteRepository.findById(dadosConsulta.getId_paciente());
        if (dadosPaciente == null) {
            System.out.print("Null em paciente");
            return valorBase;
        }

        SeguroSaude dadosSeguro = seguroService.findById(dadosPaciente.getId_seguro());

        if (dadosSeguro == null) {
            System.out.print("Null em consulta");
            return valorBase;
        }

        double desconto = valorBase * dadosSeguro.getPercentagem_comparticipada() / 100;

        return valorBase - desconto;
    }

    public String marcarFaturaComoPaga(int idConsulta) {
        return faturaRepository.marcarFaturaComoPaga(idConsulta);
    }

    public Fatura obterFaturaPorConsulta(int idConsulta) {
        return faturaRepository.findByConsulta(idConsulta);
    }

    public ArrayList<Fatura> obterFaturasPorPaciente(int idPaciente) {
        return faturaRepository.findByPacienteId(idPaciente);
    }

    public ArrayList<Fatura> listarFaturas() {
        return faturaRepository.findAll();
    }
}
