package es_project;

import java.time.LocalDateTime;

public class Relatorio {

    private int id_relatorio;
    private int id_profissional;
    private String titulo_relatorio;
    private String descricao_relatorio;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    /* GETTERS */
    
    public int getId_relatorio() { return id_relatorio; }

    public int getId_profissional() { return id_profissional; }

    public String getTitulo_relatorio() { return titulo_relatorio; }

    public String getDescricao_relatorio() { return descricao_relatorio; }

    /* SETTERS */

    public void setId_relatorio(int id_relatorio) { this.id_relatorio = id_relatorio; }

    public void setId_profissional(int id_profissional) { this.id_profissional = id_profissional; }

    public void setTitulo_relatorio(int titulo_relatorio) { this.titulo_relatorio = titulo_relatorio; }

    public void setDescricao_relatorio(int descricao_relatorio) { this.descricao_relatorio = descricao_relatorio; }

    /* METODOS */
    
    public Relatorio encontrarRelatorioPorId(int id) {
        return null;
    }

    public void gerarRelatorio(Relatorio relatorio) {}
}
