package org.example.corretos;

public class ExportadorPDF_SRP {

    public void exportar(RelatorioVendas_SRP relatorio) {
        System.out.println("Exportando relatório para PDF...");
        for (String venda : relatorio.getDadosVendas()) {
            System.out.println("PDF: " + venda);
        }
    }
}
