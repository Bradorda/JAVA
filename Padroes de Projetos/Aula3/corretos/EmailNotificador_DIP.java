package org.example.corretos;

public class EmailNotificador_DIP implements Notificador_DIP{

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}
