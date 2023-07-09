public class ContaEspecial extends Conta{
    private double valorChequeEspecial;
    private ClientePessoaFisica clientePessoaFisica;

    public ContaEspecial(double valorChequeEspecial,ClientePessoaFisica clientePessoaFisica) {
        this.valorChequeEspecial = valorChequeEspecial;
        this.clientePessoaFisica = clientePessoaFisica;
    }

    @Override
    public void setSaldo(double saldo) {
        if(saldo >= (this.valorChequeEspecial*(-1))){
            super.setSaldo(saldo);
        }
    }

    @Override
    public boolean sacar(double valor){
        if(valor > 0 && (super.getSaldo()+this.valorChequeEspecial) >= valor){
            setSaldo(super.getSaldo()-valor);
            return true;
        } else
            return false;
    }

    public ClientePessoaFisica getClientePessoaFisica() {
        return clientePessoaFisica;
    }

    public void setClientePessoaFisica(ClientePessoaFisica clientePessoaFisica) {
        this.clientePessoaFisica = clientePessoaFisica;
    }

    public double getValorChequeEspecial() {
        return valorChequeEspecial;
    }

    public void setValorChequeEspecial(double valorChequeEspecial) {
        this.valorChequeEspecial = valorChequeEspecial;
    }
}
