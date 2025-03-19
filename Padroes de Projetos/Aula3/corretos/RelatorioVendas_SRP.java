package org.example.corretos;

import java.util.List;

public class RelatorioVendas_SRP {

    private List<String> dadosVendas;

    public RelatorioVendas_SRP(List<String> dadosVendas) {
        this.dadosVendas = dadosVendas;
    }

    public void gerarRelatorio() {
        System.out.println("Gerando relatório de vendas...");
        for (String venda : dadosVendas) {
            System.out.println(venda);
        }
    }

    public List<String> getDadosVendas() {
        return dadosVendas;
    }

}
