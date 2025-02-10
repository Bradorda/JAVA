package CityIF;

import java.util.Arrays;

public class Elevador {
    private int numeroElevador; // Elevator's number
    private int tempoParaAcao; // Time in secs until next action
    private int numeroAndar; // Current floor number
    private boolean parado; // true == stopped at floor
    private int direcao; // 1 == up, -1 == down, 0 == none
    private int[] botoes; // Floor buttons (false == off, true == on)
    private int passageiros; // Number of passengers on board
    private int destinoPessoa;    // Destino da pessoa   
    //private int newDirection; // Nova direção do elevador
    
    
    public Elevador() {
        this.numeroElevador = -1;
        this.tempoParaAcao = Elevsim.TEMPO_ESPERA;
        this.numeroAndar = 0;
        this.parado = true;
        this.direcao = Elevsim.NENHUMA_DIRECAO;
        this.passageiros = 0;
        this.botoes = new int[Elevsim.ANDARES];
        Arrays.fill(this.botoes, 0);
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setNumeroElevador(int n) {
        this.numeroElevador = n;
    }

    private boolean botaoParaCima() {
        for (int i = numeroAndar + 1; i < Elevsim.ANDARES; i++) {
            if (botoes[i] == 1) return true;
        }
        return false;
    }

    private boolean botaoParaBaixo() {
        for (int i = 0; i < numeroAndar; i++) {
            if (botoes[i] == 1) return true;
        }
        return false;
    }

    public void setDirecao(ColecaoAndares osAndares) {
        if (botaoParaCima()) direcao = Elevsim.PARA_CIMA;
        else if (botaoParaBaixo()) direcao = Elevsim.PARA_BAIXO;
        else if (osAndares.sinalizarParaCima(numeroAndar)) direcao = Elevsim.PARA_CIMA;
        else if (osAndares.sinalizarParaBaixo(numeroAndar)) direcao = Elevsim.PARA_BAIXO;
        else direcao = Elevsim.NENHUMA_DIRECAO;
    }

    public boolean elevadorParando(ColecaoAndares osAndares) {
        if (botoes[numeroAndar] == 1) return true;
        else if (osAndares.sinalizarMesmaDirecao(direcao, numeroAndar)) return true;
        else if (numeroAndar == 0) return true;
        else if (numeroAndar == Elevsim.ANDARES - 1) return true;
        else if (direcao == Elevsim.NENHUMA_DIRECAO) return true;
        return false;
    }

    //
    public void acao(ColecaoAndares osAndares, ColecaoPessoas asPessoas) {
    	
        // Se o elevador está parado
        if (parado) {
            passageiros -= asPessoas.desembarcar(numeroElevador, numeroAndar);

            // Se o elevador está vazio, pega o primeiro passageiro e define a direção
            if ((direcao == Elevsim.NENHUMA_DIRECAO) && (passageiros < Elevsim.CAPACIDADE_ELEVADOR)) {
                if (asPessoas.embarcarQualquer(numeroElevador, numeroAndar, new int[1])) {
                    passageiros++;              // Conta o passageiro
                    tempoParaAcao++;            // Tempo para embarque
                    botoes[destinoPessoa] = 1;        // Pressiona botão de destino
                    direcao = (destinoPessoa > numeroAndar) ? Elevsim.PARA_CIMA : Elevsim.PARA_BAIXO;  // Define direção
                }
            }

            // Se já há passageiros, pega mais enquanto houver espaço
            if ((direcao != Elevsim.NENHUMA_DIRECAO) && (passageiros < Elevsim.CAPACIDADE_ELEVADOR)) {
                if (asPessoas.embarcarDireceionado(numeroElevador, numeroAndar, direcao, new int[1])) {
                    passageiros++;              
                    tempoParaAcao++;            
                    botoes[destinoPessoa] = 1;        
                    if (passageiros >= Elevsim.CAPACIDADE_ELEVADOR) 
                        tempoParaAcao = 0;      
                }
            }

            // Se está pronto para se mover
            if (tempoParaAcao-- <= 0) {
                if (direcao == Elevsim.NENHUMA_DIRECAO)
                    setDirecao(osAndares);
                if ((direcao == Elevsim.NENHUMA_DIRECAO) && (numeroAndar > 0))
                    direcao = Elevsim.PARA_BAIXO;
                if (direcao == Elevsim.NENHUMA_DIRECAO)
                    tempoParaAcao = Elevsim.TEMPO_ESPERA;  
                else {
                    osAndares.resetarBotao(direcao, numeroAndar);
                    parado = false;          
                    tempoParaAcao = Elevsim.TEMPO_VIAGEM;
                }
            }
        }
        // Se está se movendo para o próximo andar
        else if (tempoParaAcao-- <= 0) {  
            numeroAndar += (direcao == Elevsim.PARA_CIMA) ? 1 : -1;
            setDirecao(osAndares);    

            if (elevadorParando(osAndares)) {  
                osAndares.resetarBotao(direcao, numeroAndar);
                parado = true;             
                tempoParaAcao = Elevsim.TEMPO_ESPERA;     
                botoes[numeroAndar] = 0;   
            } else {
                tempoParaAcao = Elevsim.TEMPO_VIAGEM;  
            }
        }
    }
}
