public abstract class Conta {
    private double saldo;
    private int numero;
    private int numGerado = 0;

    public Conta (){
        this.saldo = 0;
        this.numero = gerarNumero();
    }


    public int gerarNumero(){
        return this.numGerado++;
    }

    public boolean sacar(double valor){
        if(valor > 0 && this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else
            return false;
    }

    public boolean depositar (double valor){
        if(valor > 0){
            this.saldo += valor;
            return true;
        } else
            return false;
    }

    public boolean transferir (Conta contaDestino,double valor){
        if(valor > 0 && this.saldo >= valor){
            this.saldo -= valor;
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            return true;
        } else
            return false;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public int getNumGerado() {
        return numGerado;
    }

    public void setNumGerado(int numGerado) {
        this.numGerado = numGerado;
    }
}