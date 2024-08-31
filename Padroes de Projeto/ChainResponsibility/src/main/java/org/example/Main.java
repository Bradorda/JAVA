package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Conta contaOrigem = new Conta(1000);
            Conta contaDestino = new Conta(500);

            TransactionHandler dh = new DepositHandler();
            TransactionHandler wh = new WithdrawHandler();
            TransactionHandler th = new TransferHandler();

            dh.definirProximo(wh);
            wh.definirProximo(th);

            // Testando depósito
            dh.processarTransacao(TipoTransacao.DEPOSITO, contaOrigem, null, 200);

            // Testando saque
            dh.processarTransacao(TipoTransacao.SAQUE, contaOrigem, null, 150);

            // Testando transferência
            dh.processarTransacao(TipoTransacao.TRANSFERENCIA, contaOrigem, contaDestino, 300);

            // Testando transação inválida
            dh.processarTransacao(null, contaOrigem, contaDestino, 100);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
