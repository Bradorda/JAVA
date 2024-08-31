package org.example;

public class DepositHandler implements TransactionHandler {
    private TransactionHandler proximo;

    public DepositHandler() {
        super();
    }

    @Override
    public void definirProximo(TransactionHandler proximo) {
        this.proximo = proximo;
    }

    @Override
    public void processarTransacao(TipoTransacao tipo, Conta contaOrigem, Conta contaDestino, double valor) throws Exception {
        if (tipo == TipoTransacao.DEPOSITO) {
            if (valor > 0) {
                contaOrigem.depositar(valor);
                System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
            } else {
                throw new Exception("Valor de depósito inválido!");
            }
        } else if (proximo != null) {
            proximo.processarTransacao(tipo, contaOrigem, contaDestino, valor);
        } else {
            throw new Exception("Transação não processada: Tipo de transação inválido!");
        }
    }
}