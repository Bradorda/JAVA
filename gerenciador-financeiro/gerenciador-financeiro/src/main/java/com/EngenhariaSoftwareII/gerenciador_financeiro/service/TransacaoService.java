package com.EngenhariaSoftwareII.gerenciador_financeiro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EngenhariaSoftwareII.gerenciador_financeiro.model.Transacao;
import com.EngenhariaSoftwareII.gerenciador_financeiro.repository.TransacaoRepository;

import java.util.List;

@Service
public class TransacaoService {
    @Autowired
    private TransacaoRepository transacaoRepository;

    public Transacao adicionarTransacao(Transacao transacao) {
        return transacaoRepository.save(transacao);
    }

    public List<Transacao> listarTransacoes() {
        return transacaoRepository.findAll();
    }
}
