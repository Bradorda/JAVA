package CityIF;

public class Acao {
	
	//atributos
	private long tempoInicio; // segundos para simulação
	private long tempoRestante; //segundos restantes para o fim
	
	
	//construtor
	public Acao() {
		super();
		this.tempoInicio = 6000;
		this.tempoRestante = this.tempoInicio;
	}
	
	//alterado de int para boolean
	public boolean continua() {
		return this.tempoRestante > 0;
	}

	//alterado de int para boolean
	public boolean continua2() {
		exibir();
		this.tempoRestante--;
		return this.tempoRestante >0;
	}
	
	public void setTempo(int secs) {
		this.tempoInicio = secs;
		this.tempoRestante = this.tempoInicio;		
	}
	
	public long getTempo() {
		return this.tempoRestante;
	}
	
	public void reduzirTempo() {
		this.tempoRestante--;
	}
	
	public void reduzirTempo(int secs) {
		if(secs > this.tempoRestante) {
			this.tempoRestante =0;
		} else
			this.tempoRestante -= secs;
	}
	
	public void realizar() {
		System.out.println("\n\nAção! (Pressione <Espaço> para continuar...)");
		reduzirTempo(900);
	}
	
	public void exibir() {
		System.out.println("\n\nTempo restante: " + this.tempoRestante + " seg.");
	}
	
	public void resultados() {
		System.out.println("\n\nResultados da simulação");
		System.out.println("\n==================");
		System.out.println("\nTempo inicial .. : " + this.tempoInicio + " seg.");
		System.out.println("\nTempo final .... : " + this.tempoRestante + " seg.\n");
	}

	//Getters and Setters atributos
	public long getTempoInicio() {
		return tempoInicio;
	}


	public void setTempoInicio(long tempoInicio) {
		this.tempoInicio = tempoInicio;
	}


	public long getTempoRestante() {
		return tempoRestante;
	}


	public void setTempoRestante(long tempoRestante) {
		this.tempoRestante = tempoRestante;
	}
	

}
