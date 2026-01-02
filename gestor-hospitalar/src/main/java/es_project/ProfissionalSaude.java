package es_project;

public class ProfissionalSaude {

    private int id_profissional;
    private String nome_profissional;
    private String especialidade;
    private boolean profissional_ativo;

    /* GETTERS */

    public int getId_profissional() {return id_profissional;}

    public String getNome_profissional() {return nome_profissional;}

    public String getEspecialidade() {return especialidade;}

    public boolean isProfissional_ativo() {return profissional_ativo;}
    
    /* SETTERS */

    public void setId_profissional(int id_profissional) {this.id_profissional = id_profissional;}

    public void setNome_profissional(String nome_profissional) {this.nome_profissional = nome_profissional;}

    public void setEspecialidade(String especialidade) {this.especialidade = especialidade;}

    public void setProfissional_ativo(boolean profissional_ativo) {
        this.profissional_ativo = profissional_ativo;
    }
}
