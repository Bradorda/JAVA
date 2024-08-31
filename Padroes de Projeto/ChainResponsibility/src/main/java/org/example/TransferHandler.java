package org.example;

public class TransferHandler implements TransactionHandler {
    private TransactionHandler proximo;

    public TransferHandler() {
        super();
    }

    @Override
    public void definirProximo(TransactionHandler proximo) {
        this.proximo = proximo;
    }

    @Override
    public void processarTransacao(TipoTransacao tipo, Conta contaOrigem, Conta contaDestino, double valor) throws Exception {
        if (tipo == TipoTransacao.TRANSFERENCIA) {
            if (contaOrigem.getSaldo() >= valor) {
                contaOrigem.sacar(valor);
                contaDestino.depositar(valor);
                System.out.println("Transferência de R$ " + valor + " realizada com sucesso!");
            } else {
                throw new Exception("Saldo insuficiente para transferência!");
            }
        } else if (proximo != null) {
            proximo.processarTransacao(tipo, contaOrigem, contaDestino, valor);
        } else {
            throw new Exception("Transação não processada: Tipo de transação inválido!");
        }
    }
}