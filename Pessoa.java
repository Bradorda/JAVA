package CityIF;

public class Pessoa {
	private int andarAtual;      // Andar (-1 se estiver fora)
    private int destino;         // Número do andar de destino
    private int tempoMaxEspera;  // Nível de frustração
    private boolean esperandoElevador;  // Verdadeiro se estiver esperando
    private boolean subindoEscada;     // Verdadeiro se estiver andando
    private int elevadorAtual;   // Número do elevador (-1 se não houver nenhum)

    public Pessoa() {
        this.andarAtual = -1;
        this.esperandoElevador = false;
        this.destino = -1;
        this.tempoMaxEspera = 0;
        this.subindoEscada = false;
        this.elevadorAtual = -1;
    }

    public void executarAcao() {
        if (andarAtual < 0) { // If not in building
            if (Elevsim.querEntrar()) {
                destino = Elevsim.destinoEntrar();
                andarAtual = 0;
                tempoMaxEspera = Elevsim.esperaMax();
                esperandoElevador = true;
                subindoEscada = false;
                elevadorAtual = -1;
            }
        } else {
            if (esperandoElevador) {
                if (--tempoMaxEspera <= 0) {
                    esperandoElevador = false;
                    subindoEscada = true;
                    tempoMaxEspera = 30 * Math.abs(destino - andarAtual);
                }
            } else if (subindoEscada) {
                if (--tempoMaxEspera <= 0) {
                    andarAtual = destino;
                    subindoEscada = false;
                    tempoMaxEspera = Elevsim.tempoComercial();
                }
            } else if (elevadorAtual < 0) {
                if (--tempoMaxEspera <= 0) {
                    destino = Elevsim.estaSaindo() ? 0 : Elevsim.destinoEntrar();
                    if (destino == andarAtual) destino = 0;
                    tempoMaxEspera = Elevsim.esperaMax();
                    esperandoElevador = true;
                }
            }
            if (andarAtual == 0 && destino == 0) {
                andarAtual = -1;
            }
        }
    }

    public int esperandoParaSubir(int numeroAndar) {
        return (esperandoElevador && andarAtual == numeroAndar && destino > andarAtual) ? 1 : 0;
    }


    public int esperandoParaDescer(int numeroAndar) {
        return (esperandoElevador && andarAtual == numeroAndar && destino < andarAtual) ? 1:0;
    }

    public boolean embarcarSeEsperando(int numeroElevador, int numeroAndar, int[] destinoPessoa) {
        if (esperandoElevador && andarAtual == numeroAndar) {
            esperandoElevador = false;
            elevadorAtual = numeroElevador;
            destinoPessoa[0] = destino;
            return true;
        }
        return false;
    }

    public boolean embarcarSeNaMesmaDirecao(int numeroElevador, int numeroAndar, int direcao, int[] destinoPessoa) {
        int direcaoPessoa = (destino > numeroAndar) ? 1 : -1;
        if (esperandoElevador && andarAtual == numeroAndar && direcao == direcaoPessoa) {
            esperandoElevador = false;
            elevadorAtual = numeroElevador;
            destinoPessoa[0] = destino;
            return true;
        }
        return false;
    }

    public boolean desembarcar(int numeroElevador, int numeroAndar) {
        if (elevadorAtual == numeroElevador && destino == numeroAndar) {
            elevadorAtual = -1;
            andarAtual = destino;
            if (andarAtual != 0) tempoMaxEspera = Elevsim.tempoComercial();
            return true;
        }
        return false;
    }
}