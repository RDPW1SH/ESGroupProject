package es_project.controller;

import java.util.ArrayList;
import java.util.List;

public class NotificacoesManager {

    private List<String> notificacoes = new ArrayList<>();

    public void enviarNotificacao(String destinatario, String mensagem) {
        notificacoes.add("Para: " + destinatario + " | Mensagem: " + mensagem);
    }

    public void notificarConsultaConfirmada(int idConsulta) {
        enviarNotificacao("Paciente", "Consulta " + idConsulta + " confirmada.");
    }

    public void notificarResultadoExame(int idExame) {
        enviarNotificacao("Paciente", "Resultado do exame " + idExame + " disponível.");
    }
}
