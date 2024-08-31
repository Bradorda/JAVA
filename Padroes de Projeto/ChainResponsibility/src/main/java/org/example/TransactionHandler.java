package org.example;

public interface TransactionHandler {
    void definirProximo(TransactionHandler proximo);
    void processarTransacao(TipoTransacao tipo, Conta contaOrigem, Conta contaDestino, double valor) throws Exception;
}


