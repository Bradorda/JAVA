package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Caixa {
    private List<ItemsComposicaoSimples> itensDisponiveis;
    private Random random = new Random();

    public Caixa() {
        this.itensDisponiveis = new ArrayList<>();
        inicializarItens();
    }

    private void inicializarItens() {
        itensDisponiveis.add(new ItemsComposicaoSimples("Quadrinhos", 15f));
        itensDisponiveis.add(new ItemsComposicaoSimples("Chaveiros", 5f));
        itensDisponiveis.add(new ItemsComposicaoSimples("Bustos", 10f));
        itensDisponiveis.add(new ItemsComposicaoSimples("Adesivos", 1f));
        itensDisponiveis.add(new ItemsComposicaoSimples("Poster", 25f));
        itensDisponiveis.add(new ItemsComposicaoSimples("Camisa", 25f));
        itensDisponiveis.add(new ItemsComposicaoSimples("Caneta", 3f));
        itensDisponiveis.add(new ItemsComposicaoSimples("Miniaturas", 20f));
    }

    public ItemsComposicao gerarCaixa(String tipo) {
        ItemsComposicao caixa = new ItemsComposicao();
        int numeroDeItens = obterNumeroDeItens(tipo);

        for (int i = 0; i < numeroDeItens; i++) {
            ItemsComposicaoSimples item = itensDisponiveis.get(random.nextInt(itensDisponiveis.size()));
            caixa.addItems(item);
        }

        caixa.mostrarItems();
        System.out.println("Valor da caixa " + tipo + ": " + caixa.getValor());
        return caixa;
    }

    private int obterNumeroDeItens(String tipo) {
        switch (tipo.toLowerCase()) {
            case "bronze":
                return 3;
            case "prata":
                return 5;
            case "ouro":
                return 7;
            case "platina":
                return 10;
            default:
                throw new IllegalArgumentException("Tipo de caixa inválido.");
        }
    }
}
