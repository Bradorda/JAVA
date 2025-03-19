package org.example.corretos;

public class Retangulo_LSP implements Forma_LSP {
    private double largura;
    private double altura;

    public Retangulo_LSP(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
