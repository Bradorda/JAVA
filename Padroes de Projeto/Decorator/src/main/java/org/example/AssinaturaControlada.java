package org.example;

import java.util.HashSet;
import java.util.Set;

public class AssinaturaControlada implements Assinatura {
    private Set<String> pacotesAdicionados = new HashSet<>();
    private Assinatura assinatura;

    public AssinaturaControlada(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    public void adicionarPacote(PacoteAdicional pacote, String nomePacote) {
        if (!pacotesAdicionados.contains(nomePacote)) {
            pacotesAdicionados.add(nomePacote);
            assinatura = new AssinaturaDecorada(assinatura, pacote);
        } else {
            System.out.println("Pacote " + nomePacote + " já foi adicionado.");
        }
    }

    @Override
    public void assinar() {
        assinatura.assinar();
    }
}