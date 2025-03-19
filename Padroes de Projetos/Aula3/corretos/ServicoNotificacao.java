package org.example.corretos;

public class ServicoNotificacao {

    private Notificador_DIP notificador;

    // Injeção de dependência via construtor
    public ServicoNotificacao(Notificador_DIP notificador) {
        this.notificador = notificador;
    }

    public void notificar(String mensagem) {
        notificador.enviar(mensagem);
    }
}
