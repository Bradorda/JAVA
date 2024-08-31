package org.example;

public class ItemsComposicaoSimples extends Items {

    public ItemsComposicaoSimples(String nome, Float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public void mostrarItems() {
        System.out.println("Item: " + this.nome + " - Preço: " + this.valor);
    }
}

