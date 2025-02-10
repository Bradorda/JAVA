package CityIF;


import java.io.IOException;


public class Predio extends Acao {
    private ColecaoPessoas asPessoas;    // Pessoas no sistema
    private ColecaoAndares osAndares;    // Andares do prédio
    private ColecaoElevadores osElevadores;  // Elevadores do prédio
    private int tempoTotal = 0;
    private int totalPessoas = 0;
    private int noPredio = 0;
    private int saiuPredio = 0;
    private int esperaMedia = 0;
    private int viagemMedia = 0;
    private int subiuEscada = 0;
    
    private static final int MAX_ELEVADORES = 5;
    private static final int MAX_ANDARES = 10;

    public Predio(ColecaoPessoas pessoas, ColecaoAndares andares, ColecaoElevadores elevadores) {
        this.asPessoas = pessoas;
        this.osAndares = andares;
        this.osElevadores = elevadores;
    }

    public boolean continua() {
        try {
            if (System.in.available() > 0) { // Verifica se há entrada no buffer
                char tecla = (char) System.in.read(); // Lê um único caractere
                if (tecla == 27) { // Se for a tecla ESC
                    setTempo(0);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.continua();
    }

    public void realizar() {
        asPessoas.executarAcao();
        osElevadores.acao(osAndares, asPessoas);
        reduzirTempo(1); // Um segundo passa
        tempoTotal++;   // Contabiliza segundos para exibição do tempo
    }

    public void exibir() {
        long t = tempoTotal;
        int horas = 0, minutos = 0, segundos = 0;

        //theFloors.showFloors(thePersons);
        //theElevators.showElevators();
        esperaMedia = osAndares.mediaEspera();
        viagemMedia = osElevadores.mediaPassageiros();

        System.out.printf(
            "%05d    %05d    %05d    %04d    %04d    %05d%5d%5d%n",
            totalPessoas, noPredio, saiuPredio, esperaMedia,
            viagemMedia, subiuEscada, MAX_ELEVADORES, MAX_ANDARES
        );

        if (t >= 3600) {
            horas = (int) (t / 3600);
            t -= horas * 3600;
        }
        if (t >= 60) {
            minutos = (int) (t / 60);
            t -= minutos * 60;
        }
        segundos = (int) t;

        System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
    }

	public ColecaoPessoas getAsPessoas() {
		return asPessoas;
	}

	public void setAsPessoas(ColecaoPessoas asPessoas) {
		this.asPessoas = asPessoas;
	}

	public ColecaoAndares getOsAndares() {
		return osAndares;
	}

	public void setOsAndares(ColecaoAndares osAndares) {
		this.osAndares = osAndares;
	}

	public ColecaoElevadores getOsElevadores() {
		return osElevadores;
	}

	public void setOsElevadores(ColecaoElevadores osElevadores) {
		this.osElevadores = osElevadores;
	}

	public int getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(int tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

	public int getTotalPessoas() {
		return totalPessoas;
	}

	public void setTotalPessoas(int totalPessoas) {
		this.totalPessoas = totalPessoas;
	}

	public int getNoPredio() {
		return noPredio;
	}

	public void setNoPredio(int noPredio) {
		this.noPredio = noPredio;
	}

	public int getSaiuPredio() {
		return saiuPredio;
	}

	public void setSaiuPredio(int saiuPredio) {
		this.saiuPredio = saiuPredio;
	}

	public int getEsperaMedia() {
		return esperaMedia;
	}

	public void setEsperaMedia(int esperaMedia) {
		this.esperaMedia = esperaMedia;
	}

	public int getViagemMedia() {
		return viagemMedia;
	}

	public void setViagemMedia(int viagemMedia) {
		this.viagemMedia = viagemMedia;
	}

	public int getSubiuEscada() {
		return subiuEscada;
	}

	public void setSubiuEscada(int subiuEscada) {
		this.subiuEscada = subiuEscada;
	}

	public static int getMaxElevadores() {
		return MAX_ELEVADORES;
	}

	public static int getMaxAndares() {
		return MAX_ANDARES;
	}
    
    
}
