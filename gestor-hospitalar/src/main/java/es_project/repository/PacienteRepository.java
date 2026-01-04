package es_project.repository;

import java.time.LocalDate;
import java.util.ArrayList;

import es_project.model.Paciente;

public class PacienteRepository {
    private final ArrayList<Paciente> pacientes = new ArrayList<>();

    public PacienteRepository() {
        carregarDadosPlaceholder();
    }

    private void carregarDadosPlaceholder() {

        Paciente p1 = new Paciente();
        p1.setId_utilizador(1);
        p1.setId_tipo_utilizador(1); // Paciente
        p1.setNome_utilizador("joao");
        p1.setEmail_utilizador("joao.silva@email.com");
        p1.setIdade_utilizador(30);
        p1.setPassword_utilizador("1234");
        p1.setTelemovel_utilizador(912345678);
        p1.setId_paciente(1);
        p1.setId_seguro(1);
        p1.setData_nascimento(LocalDate.of(1993, 6, 12));
        p1.setGenero_paciente("Masculino");
        p1.setMorada_paciente("Rua Saúde, 10");

        pacientes.add(p1);

    }

    public Paciente save(Paciente paciente) {
        pacientes.add(paciente);
        return paciente;
    }

    public Paciente findById(int idPaciente) {
        for (Paciente p : pacientes) {
            if (p.getId_paciente() == idPaciente) {
                return p;
            }
        }
        return null;
    }

    public Paciente getPacienteByUserId(int idUser) {
        for (Paciente p : pacientes) {
            if (p.getId_paciente() == idUser) {
                return p;
            }
        }
        return null;
    }
}
