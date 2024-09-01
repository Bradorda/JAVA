package org.example;


class SistemaDePassagemAerea {
    public double reservarPassagem(String classeVoo, String assento) {
        double valorBase = 500.0;
        double valorFinal = valorBase;

        switch (classeVoo.toLowerCase()) {
            case "executiva":
                valorFinal *= 2.5;
                break;
            case "1a classe":
                valorFinal *= 4.0;
                break;
        }

        System.out.println("Passagem reservada: Classe " + classeVoo + ", Assento " + assento);
        return valorFinal;
    }
}

