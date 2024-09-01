package org.example;


class SistemaDeHotel {
    public double reservarQuarto(String tipoQuarto, int numPessoas) {
        double valorBase = 200.0;
        double valorFinal = valorBase * numPessoas;

        switch (tipoQuarto.toLowerCase()) {
            case "executivo":
                valorFinal *= 1.5;
                break;
            case "suíte presidencial":
                valorFinal *= 4.5;
                break;
        }

        System.out.println("Quarto reservado: Tipo " + tipoQuarto + " para " + numPessoas + " pessoas");
        return valorFinal;
    }
}