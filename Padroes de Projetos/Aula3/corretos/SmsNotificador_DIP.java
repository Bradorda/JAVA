package org.example.corretos;

public class SmsNotificador_DIP implements Notificador_DIP{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
