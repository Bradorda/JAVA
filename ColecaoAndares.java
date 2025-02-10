package CityIF;

import java.util.Arrays;

class ColecaoAndares {
    public static final int TOTAL_ANDARES = 10;
    private Andar[] andares;

    public ColecaoAndares() {
        andares = new Andar[TOTAL_ANDARES];
        for (int i = 0; i < TOTAL_ANDARES; i++) {
            andares[i] = new Andar();
            andares[i].setNumeroAndar(i);
        }
    }

    public void exibirTodosAndares(Pessoa pessoas) {
        for (Andar andar : andares) {
            andar.exibirAndar(pessoas);
        }
    }

    public void resetarBotao(int direcao, int numeroAndar) {
        if (direcao == 1) // UP
            andares[numeroAndar].resetarBotaoSubir();
        else if (direcao == -1) // DOWN
            andares[numeroAndar].resetarBotaoDescer();
    }

    public boolean sinalizarParaCima(int numeroAndar) {
        return Arrays.stream(andares, numeroAndar + 1, TOTAL_ANDARES)
                .anyMatch(f -> f.isBotaoSubirPressionado() || f.isBotaoDescerPressionado());
    }

    public boolean sinalizarParaBaixo(int numeroAndar) {
        return Arrays.stream(andares, 0, numeroAndar)
                .anyMatch(f -> f.isBotaoSubirPressionado() || f.isBotaoDescerPressionado());
    }

    public boolean sinalizarMesmaDirecao(int direcao, int numeroAndar) {
        if (direcao == 1) return andares[numeroAndar].isBotaoSubirPressionado();
        if (direcao == -1) return andares[numeroAndar].isBotaoDescerPressionado();
        return false;
    }

    public int mediaEspera() {
        return Arrays.stream(andares).mapToInt(Andar::gerNumPessoasEsperando).sum() / TOTAL_ANDARES;
    }

	public Andar[] getAndares() {
		return andares;
	}

	public void setAndares(Andar[] andares) {
		this.andares = andares;
	}

	public static int getTotalAndares() {
		return TOTAL_ANDARES;
	}
    
}
