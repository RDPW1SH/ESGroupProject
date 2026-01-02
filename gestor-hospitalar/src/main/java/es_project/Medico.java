package es_project;

import java.util.List;

public class Medico extends ProfissionalSaude{

    private String nome_especialidade;

    /* GETTERS */

    public String getNome_especialidade() {return nome_especialidade;}

    /* SETTERS */

    public void setNome_especialidade(int nome_especialidade) {this.nome_especialidade = nome_especialidade;}

    /* METODOS */

    public Consulta consultarProcessoClinico(int pacienteId) {
        return List.of(Consulta);
    }

    public void passarPrescricao(int pacienteId, List<ItemPrescricao> itens) {}

    public Exame solicitarExame(int pacienteId, int idTipoExame) {
        return null;
    }
}
