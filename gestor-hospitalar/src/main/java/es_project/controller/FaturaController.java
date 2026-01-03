package es_project.controller;

import es_project.model.Fatura;
import es_project.model.SeguroSaude;
import es_project.repository.FaturaRepository;

import java.util.ArrayList;

public class FaturaController {

    private final FaturaRepository faturaRepository;

    public FaturaController(FaturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
    }

    public Fatura criarFatura(Fatura fatura) {
        return faturaRepository.save(fatura);
    }

    public double calcularValorConsulta(double valorBase, SeguroSaude seguro) {
        if (seguro != null) {
            double desconto = valorBase * seguro.getPercentagem_comparticipada() / 100;
            return valorBase - desconto;
        }
        return valorBase;
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
