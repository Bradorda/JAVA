package CityIF;

class ColecaoElevadores {
    private Elevador[] elevadores;

    public ColecaoElevadores() {
        this.elevadores = new Elevador[Elevsim.ELEVADORES];
        for (int i = 0; i < Elevsim.ELEVADORES; i++) {
            elevadores[i] = new Elevador();
            elevadores[i].setNumeroElevador(i);
        }
    }

    public void acao(ColecaoAndares andares, ColecaoPessoas pessoas) {
        for (Elevador elevador : elevadores) {
            elevador.acao(andares, pessoas);
        }
    }

    public int mediaPassageiros() {
        int totalPassageiros = 0;
        for (Elevador elevador : elevadores) {
            totalPassageiros += elevador.getPassageiros();
        }
        return totalPassageiros / Elevsim.ELEVADORES;
    }

	public Elevador[] getElevadores() {
		return elevadores;
	}

	public void setElevadores(Elevador[] elevadores) {
		this.elevadores = elevadores;
	}
    
}
