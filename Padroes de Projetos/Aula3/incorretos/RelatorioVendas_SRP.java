package org.example.incorretos;

import java.util.List;


public class RelatorioVendas_SRP {

    private List<String> dadosVendas;

    public RelatorioVendas_SRP(List<String> dadosVendas) {
        this.dadosVendas = dadosVendas;
    }

    public void gerarRelatorio() {
        System.out.println("Gerando relatorio de vendas...");
        for (String venda : dadosVendas) {
            System.out.println(venda);
        }
    }

    //violação do principio de responsabilidade unica.
    public void exportarParaPDF() {
        System.out.println("Exportando relatorio para PDF...");
        for (String venda : this.dadosVendas) {
            System.out.println("PDF: " + venda);
        }
    }

}

