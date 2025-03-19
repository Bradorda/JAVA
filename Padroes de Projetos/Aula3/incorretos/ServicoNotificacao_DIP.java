package org.example.incorretos;

public class ServicoNotificacao_DIP {

    private EmailNotificador_DIP emailNotificador;

    public ServicoNotificacao_DIP() {
        this.emailNotificador = new EmailNotificador_DIP();
    }

    public void notificar(String mensagem) {
        emailNotificador.enviarEmail(mensagem);
    }
}
