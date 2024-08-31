package org.example;

public class WithdrawHandler implements TransactionHandler {
    private TransactionHandler proximo;

    public WithdrawHandler() {
        super();
    }

    @Override
    public void definirProximo(TransactionHandler proximo) {
        this.proximo = proximo;
    }

    @Override
    public void processarTransacao(TipoTransacao tipo, Conta contaOrigem, Conta contaDestino, double valor) throws Exception {
        if (tipo == TipoTransacao.SAQUE) {
            if (contaOrigem.getSaldo() >= valor) {
                contaOrigem.sacar(valor);
                System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            } else {
                throw new Exception("Saldo insuficiente para saque!");
            }
        } else if (proximo != null) {
            proximo.processarTransacao(tipo, contaOrigem, contaDestino, valor);
        } else {
            throw new Exception("Transação não processada: Tipo de transação inválido!");
        }
    }
}