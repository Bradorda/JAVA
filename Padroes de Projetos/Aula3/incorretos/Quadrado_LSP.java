package org.example.incorretos;

public class Quadrado_LSP extends Retangulo_LSP {

    @Override
    public void setLargura(double largura) {
        this.largura = largura;
        this.altura = largura; // Mantém a propriedade do quadrado (altura = largura)
    }

    @Override
    public void setAltura(double altura) {
        this.largura = altura;
        this.altura = altura; // Mantém a propriedade do quadrado (altura = largura)
    }
}
