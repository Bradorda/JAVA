package CityIF;

import java.util.Random;

public class Elevsim {

   
    public static final int FALSO = 0;
    public static final int VERDADEIRO = 1;
    public static final int PARA_CIMA = 1;
    public static final int PARA_BAIXO = -1;
    public static final int NENHUMA_DIRECAO = 0;
    public static final int TECLA_ESC = 27;

    
    public static final int MAX_ELEVADORES = 10;     
    public static final int MAX_ANDARES = 10;    
    public static final int MAX_PESSOAS = 750;  
    public static final int TEMPOESPERA = 15;     
    public static final int CAPACIDADE = 24;     
    public static final int TEMPOVIAGEM = 5;    
    public static final int ATRASO_ITERACAO = 0;      

    public static int ELEVADORES = MAX_ELEVADORES;
    public static int ANDARES = MAX_ANDARES;
    public static int PESSOAS = MAX_PESSOAS;
    public static int TEMPO_ESPERA = TEMPOESPERA;
    public static int CAPACIDADE_ELEVADOR = CAPACIDADE;
    public static int TEMPO_VIAGEM = TEMPOVIAGEM;
    public static int ATRASO_SIMULACAO = ATRASO_ITERACAO;
    public static int TEMPO_SIMULACAO = 600;

    
    static final Random rand = new Random();

    
    public static boolean querEntrar() {
        return rand.nextInt(Integer.MAX_VALUE) < Integer.MAX_VALUE / 3;
    }

    public static int destinoEntrar() {
        return 1 + rand.nextInt(ANDARES - 1);
    }

    public static int esperaMax() {
        return 60 + rand.nextInt(120);
    }

    public static int tempoComercial() {
        return 40 + rand.nextInt(60);
    }

    public static boolean estaSaindo() {
        return rand.nextInt(Integer.MAX_VALUE) < 2 * (Integer.MAX_VALUE / 3);
    }

    
    public static int totalPessoas = 0;      
    public static int noPredio = 0;       
    public static int pessoasSaindo = 0;     
    public static int esperaMedia = 0;          
    public static int passeioMedio = 0;          
    public static int subiramEscada = 0;        
    public static int tempoTotal = 0;        

   
}
