package org.example;

public class Main {
    public static void main(String[] args) {
        ChainCharacteres login = new CharMaiusculo();
        login.setNext(new CharMinusculo());
        login.setNext(new CharEspecial());
        login.setNext(new CharNumerico());
        login.setNext(new CharSequencial());
        login.setNext(new CharMinimo());
        login.setNext(new CharMaximo());

        try {
            login.addUsers();

            // Testando senhas
            login.efetuarLogin("Gabriel", "Dezesset3@");
            login.efetuarLogin("Rayslla", "Agatinh4#");
            login.efetuarLogin("Jonas", "rupturA4#");
            login.efetuarLogin("Bruno", "Larxen3$");

            // Testando senhas inválidas
            login.efetuarLogin("Bruno", "Laxen$"); // Falha sem número
            login.efetuarLogin("Italo", "abigail"); // Falha
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
