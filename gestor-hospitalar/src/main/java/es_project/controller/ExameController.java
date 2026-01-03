package es_project.controller;

import es_project.model.Exame;
import es_project.repository.ExameRepository;
import es_project.repository.TipoExameRepository;

import java.util.List;

public class ExameController {

    private final ExameRepository exameRepository;
    private final TipoExameRepository tipoExameRepository;

    public ExameController(
            ExameRepository exameRepository,
            TipoExameRepository tipoExameRepository) {
        this.exameRepository = exameRepository;
        this.tipoExameRepository = tipoExameRepository;
    }

    public Exame criarExame(Exame exame) {
        return exameRepository.save(exame);
    }

    public Exame obterExamePorId(int idExame) {
        return exameRepository.findById(idExame);
    }

    public String obterTipoExame(int idTipoExame) {
        return tipoExameRepository.getTipo_exame(idTipoExame);
    }

    public String obterEstadoExame(int idExame) {
        return exameRepository.obterEstado(idExame);
    }

    public boolean atualizarResultadoExame(int idExame, String resultado) {
        Exame e = exameRepository.findById(idExame);
        if (e == null) {
            return false;
        }
        e.setEstado_resultado(resultado);
        return true;
    }

    public List<Exame> listarExamesPorConsulta(int idConsulta) {
        return exameRepository.findByConsulta(idConsulta);
    }
}
