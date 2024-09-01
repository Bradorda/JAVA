package org.example;


class SistemaDePagamento {
    public double realizarPagamento(double valorTotal, String formaPagamento) {
        double valorFinal = valorTotal;

        switch (formaPagamento.toLowerCase()) {
            case "pix":
                valorFinal *= 0.9;
                break;
            case "boleto":
                valorFinal *= 0.95;
                break;
            case "crédito":
                valorFinal *= 1.2394;
                break;
        }

        System.out.println("Pagamento realizado via " + formaPagamento + ". Valor final: R$ " + valorFinal);
        return valorFinal;
    }
}
