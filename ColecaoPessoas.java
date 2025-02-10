package CityIF;

class ColecaoPessoas {
    private Pessoa[] pessoas;
    private static final int MAX_PESSOAS = 100;

    public ColecaoPessoas() {
        this.pessoas = new Pessoa[MAX_PESSOAS];
        for (int i = 0; i < MAX_PESSOAS; i++) {
            pessoas[i] = new Pessoa();
        }
    }

    public void executarAcao() {
        for (Pessoa pessoa : pessoas) {
            pessoa.executarAcao();
        }
    }

    public void numPessoasEsperando(int numeroAndar, int[] subindo, int[] descendo) {
        subindo[0] = 0;
        descendo[0] = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.esperandoParaSubir(numeroAndar)>0) subindo[0]++;
            if (pessoa.esperandoParaDescer(numeroAndar)>0) descendo[0]++;
        }
    }

    public boolean embarcarQualquer(int numeroElevador, int numeroAndar, int[] pessoaDestino) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.embarcarSeEsperando(numeroElevador, numeroAndar, pessoaDestino)) {
                return true;
            }
        }
        return false;
    }

    public boolean embarcarDireceionado(int numeroElevador, int numeroAndar, int direcao, int[] pessoaDestino) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.embarcarSeNaMesmaDirecao(numeroElevador, numeroAndar, direcao, pessoaDestino)) {
                return true;
            }
        }
        return false;
    }

    public int desembarcar(int numeroElevador, int numeroAndar) {
        int contador = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.desembarcar(numeroElevador, numeroAndar)) contador++;
        }
        return contador;
    }

	public Pessoa[] getPessoas() {
		return pessoas;
	}

	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}

	public static int getMaxPessoas() {
		return MAX_PESSOAS;
	}
    
}

