package org.example;

class SistemaDeAluguelCarro {
    public double reservarCarro(String tipoCarro) {
        double valorBase = 150.0;
        double valorFinal = valorBase;

        switch (tipoCarro.toLowerCase()) {
            case "executivo":
                valorFinal *= 2.0;
                break;
            case "luxo":
                valorFinal *= 4.0;
                break;
        }

        System.out.println("Carro reservado: Tipo " + tipoCarro);
        return valorFinal;
    }
}
