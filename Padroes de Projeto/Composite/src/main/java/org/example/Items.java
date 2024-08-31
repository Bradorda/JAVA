package org.example;

public abstract class Items {
    protected String nome;
    protected Float valor;


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return this.valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public abstract void mostrarItems();
}
