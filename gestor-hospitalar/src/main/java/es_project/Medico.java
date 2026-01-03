package es_project;

import java.util.List;

public class Medico extends ProfissionalSaude {

    private String nome_especialidade;

    /* GETTERS */

    public String getNome_especialidade() {
        return nome_especialidade;
    }

    /* SETTERS */

    public void setNome_especialidade(String nome_especialidade) {
        this.nome_especialidade = nome_especialidade;
    }

    /* METODOS */

    public List<Consulta> consultarProcessoClinico(int pacienteId) {
        return null;
    }

    public void passarPrescricao(int pacienteId, List itens) {

    }

    public Exame solicitarExame(int pacienteId, int idTipoExame) {
        return null;
    }
}
