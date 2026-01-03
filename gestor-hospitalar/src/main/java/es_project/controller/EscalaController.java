package es_project.controller;

import es_project.model.EscalaProfissional;
import es_project.repository.EscalaRepository;

import java.util.ArrayList;

public class EscalaController {

    private final EscalaRepository escalaRepository;

    public EscalaController(EscalaRepository escalaRepository) {
        this.escalaRepository = escalaRepository;
    }

    public EscalaProfissional criarEscala(EscalaProfissional escala) {
        return escalaRepository.save(escala);
    }

    public ArrayList<EscalaProfissional> obterEscalasPorProfissional(int idProfissional) {
        return escalaRepository.findByProfissional(idProfissional);
    }

    public String removerEscalaPorId(int idEscala) {
        return escalaRepository.eliminarEscalaPorId(idEscala);
    }

    public ArrayList<EscalaProfissional> listarEscalas() {
        return escalaRepository.findAll();
    }
}
