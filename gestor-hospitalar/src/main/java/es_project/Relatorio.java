package es_project;

import java.time.LocalDateTime;

public class Relatorio {
    private int id_relatorio;
    private int id_profissional;
    private int tipo_relatorio;
    private String descricao_relatorio;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public Relatorio encontrarRelatorioPorId(int id) {
        return null;
    }

    public void gerarRelatorio(Relatorio relatorio) {}
}
