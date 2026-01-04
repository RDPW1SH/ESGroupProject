package es_project.repository;

import java.util.ArrayList;

import es_project.model.SeguroSaude;

public class SeguroService {

    private final ArrayList<SeguroSaude> seguros = new ArrayList<>();

    public SeguroService() {
        carregarDadosPlaceholder();
    }

    private void carregarDadosPlaceholder() {

        SeguroSaude s1 = new SeguroSaude();
        s1.setId_seguro(1);
        s1.setNome_seguradora("Medicare");
        s1.setPercentagem_comparticipada(10);

        SeguroSaude s2 = new SeguroSaude();
        s2.setId_seguro(2);
        s2.setNome_seguradora("Cofidis");
        s2.setPercentagem_comparticipada(20);

        seguros.add(s1);
        seguros.add(s2);

    }

    public SeguroSaude save(SeguroSaude seguroSaude) {
        seguros.add(seguroSaude);
        return seguroSaude;
    }

    public SeguroSaude findById(int idSeguro) {
        for (SeguroSaude s : seguros) {
            if (s.getId_seguro() == idSeguro) {
                return s;
            }
        }
        return null;
    }

}
