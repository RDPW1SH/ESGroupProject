package es_project.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import es_project.model.EscalaProfissional;

public class EscalaRepository {

    private final List<EscalaProfissional> escalas = new ArrayList<>();

    // Formatter para dd-MM-yyyy
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public EscalaRepository() {
        carregarDadosPlaceholder();
    }

    private void carregarDadosPlaceholder() {

        EscalaProfissional e1 = new EscalaProfissional();
        e1.setId_escala(1);
        e1.setId_profissional(100);
        e1.setData_inicio(parseInicio("01-01-2026"));
        e1.setData_fim(parseFim("10-01-2026"));

        EscalaProfissional e2 = new EscalaProfissional();
        e2.setId_escala(2);
        e2.setId_profissional(100);
        e2.setData_inicio(parseInicio("15-01-2026"));
        e2.setData_fim(parseFim("20-01-2026"));

        EscalaProfissional e3 = new EscalaProfissional();
        e3.setId_escala(3);
        e3.setId_profissional(200);
        e3.setData_inicio(parseInicio("05-01-2026"));
        e3.setData_fim(parseFim("12-01-2026"));

        escalas.add(e1);
        escalas.add(e2);
        escalas.add(e3);
    }

    // ===== Métodos auxiliares =====

    private LocalDateTime parseInicio(String data) {
        return LocalDate.parse(data, FORMATTER).atStartOfDay();
    }

    private LocalDateTime parseFim(String data) {
        return LocalDate.parse(data, FORMATTER).atTime(23, 59);
    }

    // ===== CRUD =====

    public String save(EscalaProfissional escala) {

        escalas.add(escala);
        return "A escala foi criada com sucesso";
    }

    public boolean verificarDisponibilidadeId(EscalaProfissional escala) {
        for (EscalaProfissional e : escalas) {
            if (e.getId_profissional() == escala.getId_escala()) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<EscalaProfissional> findAll() {
        return new ArrayList<>(escalas);
    }

    public ArrayList<EscalaProfissional> findByProfissional(int idProfissional) {
        ArrayList<EscalaProfissional> resultado = new ArrayList<>();
        for (EscalaProfissional e : escalas) {
            if (e.getId_profissional() == idProfissional) {
                resultado.add(e);
            }
        }
        return resultado;
    }

    public String eliminarEscalaPorId(int idEscala) {
        for (EscalaProfissional e : escalas) {
            if (e.getId_escala() == idEscala) {
                escalas.remove(e);
                return "A escala foi eliminada com sucesso";
            }
        }
        return "A escala que está a tentar eliminar não existe";
    }

    // ===== Disponibilidade =====

    public boolean isProfissionalDisponivel(int idProfissional, LocalDateTime dataHora) {
        for (EscalaProfissional e : escalas) {
            if (e.getId_profissional() == idProfissional &&
                    !dataHora.isBefore(e.getData_inicio()) &&
                    !dataHora.isAfter(e.getData_fim())) {
                return true;
            }
        }
        return false;
    }
}
