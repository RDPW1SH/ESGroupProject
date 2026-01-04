package es_project.controller;

import es_project.repository.*;

import java.util.ArrayList;
import java.util.List;

import es_project.model.Consulta;
import es_project.model.EscalaProfissional;
import es_project.model.Exame;
import es_project.model.Fatura;

public class HospitalController {

    private ConsultaController consultaController;
    private EscalaController escalaController;
    private FaturaController faturaController;
    private ExameController exameController;
    private NotificacoesManager notificacoesManager;

    public HospitalController() {

        ConsultaRepository consultaRepository = new ConsultaRepository();
        TipoConsultaRepository tipoConsultaRepository = new TipoConsultaRepository();
        ExameRepository exameRepository = new ExameRepository();
        TipoExameRepository tipoExameRepository = new TipoExameRepository();
        FaturaRepository faturaRepository = new FaturaRepository();
        EscalaRepository escalaRepository = new EscalaRepository();

        this.consultaController = new ConsultaController(consultaRepository, tipoConsultaRepository);
        this.escalaController = new EscalaController(escalaRepository);
        this.faturaController = new FaturaController(faturaRepository);
        this.exameController = new ExameController(exameRepository, tipoExameRepository);
        this.notificacoesManager = new NotificacoesManager();
    }

    /* ---------------- CONSULTAS ---------------- */

    public boolean marcarConsulta(Consulta consulta) {
        boolean disponivel = consultaController.verificarDisponibilidade(
                consulta.getId_medico(),
                consulta.getData_inicio(),
                consulta.getData_fim());

        if (!disponivel) {
            return false;
        }

        consultaController.criarConsulta(consulta);
        notificacoesManager.notificarConsultaConfirmada(consulta.getId_consulta());
        return true;
    }

    public ArrayList<Consulta> consultarProcessoClinico(int idPaciente) {
        return consultaController.obterConsultas(idPaciente);
    }

    public boolean alterarEstadoConsulta(int idConsulta, String novoEstado) {
        boolean sucesso = consultaController.alterarEstadoConsulta(idConsulta, novoEstado);
        if (sucesso) {
            notificacoesManager.enviarNotificacao(
                    "Paciente",
                    "Estado da consulta alterado para: " + novoEstado);
        }
        return sucesso;
    }

    /* ---------------- ESCALA ---------------- */

    public String criarEscala(EscalaProfissional escala) {
        return escalaController.criarEscala(escala);
    }

    public ArrayList<EscalaProfissional> listarEscalasPorProfissional(int idProfissional) {
        return escalaController.obterEscalasPorProfissional(idProfissional);
    }

    public ArrayList<EscalaProfissional> listarAllEscalas() {
        return escalaController.listarEscalas();
    }

    public String removerEscala(int idEscala) {
        return escalaController.removerEscalaPorId(idEscala);
    }

    /* ---------------- FATURA ---------------- */

    public String marcarComoPago(int idConsulta) {
        return faturaController.marcarFaturaComoPaga(idConsulta);
    }

    public ArrayList<Fatura> obterFaturasPorPaciente(int idPaciente) {
        return faturaController.obterFaturasPorPaciente(idPaciente);
    }

    public ArrayList<Fatura> listarAllFaturas() {
        return faturaController.listarFaturas();
    }

    public double calcularValorConsulta(int idConsulta) {
        return faturaController.calcularValorConsulta(idConsulta);
    }

    /* ---------------- EXAME ---------------- */

    public Exame criarExame(Exame exame) {
        return exameController.criarExame(exame);
    }

    public boolean atualizarResultadoExame(int idExame, String resultado) {
        boolean sucesso = exameController.atualizarResultadoExame(idExame, resultado);
        if (sucesso) {
            notificacoesManager.notificarResultadoExame(idExame);
        }
        return sucesso;
    }

    public String consultarEstadoExame(int idExame) {
        return exameController.consultarEstadoExame(idExame);
    }

    public List<Exame> listarExamesPorConsulta(int idConsulta) {
        return exameController.listarExamesPorConsulta(idConsulta);
    }
}
