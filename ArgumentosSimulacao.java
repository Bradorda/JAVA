package CityIF;

public class ArgumentosSimulacao {
    public static int init(String[] args) {
        // Definir valores padrão para os parâmetros
        int maxElevadores = 1;
        int maxAndares = 2;
        int maxPessoas = 50;
        int tempoEspera = 10;
        int capacidadeElevador = 10;
        int tempoViagem = 5;
        int atrasoSimulacao = 1;
        int tempoSimulacao = 60;

        // Atribuir valores lidos para a classe Elevsim (supondo que essas variáveis são estáticas)
        Elevsim.ELEVADORES = maxElevadores;
        Elevsim.ANDARES = maxAndares;
        Elevsim.PESSOAS = maxPessoas;
        Elevsim.TEMPO_ESPERA = tempoEspera;
        Elevsim.CAPACIDADE_ELEVADOR = capacidadeElevador;
        Elevsim.TEMPO_VIAGEM = tempoViagem;
        Elevsim.ATRASO_SIMULACAO = atrasoSimulacao;
        Elevsim.TEMPO_SIMULACAO = tempoSimulacao;

        return 0;
    }

    public static void main(String[] args) {
        init(args);  // Chama o método para processar os argumentos

        // Exibe as configurações após inicialização
        System.out.println("Simulação iniciada com:");
        System.out.println("Elevadores: " + Elevsim.MAX_ELEVADORES);
        System.out.println("Andares: " + Elevsim.MAX_ANDARES);
        System.out.println("Máximo de Pessoas: " + Elevsim.MAX_PESSOAS);
    }
}
