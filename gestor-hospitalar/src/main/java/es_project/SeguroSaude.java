package es_project;

public class SeguroSaude {

    private int id_seguro;
    private String nome_seguradora;
    private int percentagem_comparticipada;

    /* GETTERS*/ 
    
    public int getId_seguro() {return id_seguro;}

    public String getNome_seguradora() {return nome_seguradora;}

    public double getPercentagem_comparticipada() {return percentagem_comparticipada;}
    
    /* SETTERS */
    
    public void setId_seguro(int id_seguro) {this.id_seguro = id_seguro;}

    public void setNome_seguradora(String nome_seguradora) {this.nome_seguradora = nome_seguradora;}

    public void setPercentagem_comparticipada(int percentagem_comparticipada) {
        this.percentagem_comparticipada = percentagem_comparticipada;
    }

    public boolean validarComparticipacao(float valor) {
        return true;
    }
}
