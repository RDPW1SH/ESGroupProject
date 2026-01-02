package es_project;

import java.time.LocalDateTime;

public class StockMedicamento {
    private int id_medicamento;
    private int quantidade_atual;
    private LocalDateTime updated_at;

    public boolean alterarQuantidade(boolean aumentarStock, int quant) {

        if(aumentarStock) {
            this.quantidade_atual += quant
        }
        return true;
    }
}
