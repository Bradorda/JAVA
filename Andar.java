package CityIF;


class Andar {
    private int numeroAndar;
    private boolean subir, descer;
    private int numPessoasEsperando;

    public Andar() {
        this.subir = false;
        this.descer = false;
        this.numPessoasEsperando = 0;
    }

    public void setNumeroAndar(int n) {
        this.numeroAndar = n;
    }

    public boolean isBotaoDescerPressionado() {
        return descer;
    }

    public boolean isBotaoSubirPressionado() {
        return subir;
    }

    public void resetarBotaoSubir() {
        subir = false;
    }

    public void resetarBotaoDescer() {
        descer = false;
    }

    public int gerNumPessoasEsperando() {
        return numPessoasEsperando;
    }

    public void ativarBotaoSubir() {
        if (numeroAndar < ColecaoAndares.TOTAL_ANDARES - 1)
            subir = true;
    }

    public void ativarBotaoDescer() {
        if (numeroAndar > 0)
            descer = true;
    }

    public void exibirAndar(Pessoa pessoas) {
        int coluna = 0;
        int linha = 20 - (numeroAndar * 2);
        char simboloSubida = '-';
        char simboloDescida = '-';

        // Obtém o número de pessoas esperando no andar para subir ou descer
        int esperandoSubir = pessoas.esperandoParaSubir(numeroAndar);
        int esperandoDescer = pessoas.esperandoParaDescer(numeroAndar);
        int totalPessoas = esperandoSubir + esperandoDescer;

        if (esperandoSubir > 0) ativarBotaoSubir(); // Detecta botão de subida pressionado
        if (esperandoDescer > 0) ativarBotaoDescer(); // Detecta botão de descida pressionado
        if (subir) simboloSubida = 'U'; // Define símbolos para exibição
        if (descer) simboloDescida = 'D';

        // Exibe informações deste andar
        System.out.println("Posição na tela: linha " + linha + ", coluna " + coluna);
        System.out.println(String.format("%02d:%c%c%03d", numeroAndar, simboloSubida, simboloDescida, totalPessoas));
    }

}
