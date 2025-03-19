package org.example.corretos;

public class Quadrado_LSP implements Forma_LSP{

    private double lado;

    public Quadrado_LSP(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
