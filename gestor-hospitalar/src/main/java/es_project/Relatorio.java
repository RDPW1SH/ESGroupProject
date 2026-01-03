package es_project;

import java.time.LocalDateTime;

public class Relatorio {

    private int id_relatorio;
    private int id_profissional;
    private String titulo_relatorio;
    private String descricao_relatorio;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    /* CONSTRUTOR */

    public Relatorio() {
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
    }

    /* GETTERS */

    public int getId_relatorio() {
        return id_relatorio;
    }

    public int getId_profissional() {
        return id_profissional;
    }

    public String getTitulo_relatorio() {
        return titulo_relatorio;
    }

    public String getDescricao_relatorio() {
        return descricao_relatorio;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    /* SETTERS */

    public void setId_relatorio(int id_relatorio) {
        this.id_relatorio = id_relatorio;
    }

    public void setId_profissional(int id_profissional) {
        this.id_profissional = id_profissional;
    }

    public void setTitulo_relatorio(String titulo_relatorio) {
        this.titulo_relatorio = titulo_relatorio;
    }

    public void setDescricao_relatorio(String descricao_relatorio) {
        this.descricao_relatorio = descricao_relatorio;
    }

    protected void setUpdated_at() {
        this.updated_at = LocalDateTime.now();
    }

    private void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    /* METODOS */

    public Relatorio encontrarRelatorioPorId(int id) {
        return null;
    }

    public void gerarRelatorio(Relatorio relatorio) {
    }
}
