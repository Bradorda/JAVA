public class ContaCorrente extends Conta{
    private ClientePessoaFisica clientePessoaFisica;

    public ContaCorrente (ClientePessoaFisica clientePessoaFisica) {
        this.clientePessoaFisica = clientePessoaFisica;
    }

    @Override
    public void setSaldo(double saldo) {
        if(saldo >=0){
            super.setSaldo(saldo);
        }
    }

    public ClientePessoaFisica getClientePessoaFisica() {
        return clientePessoaFisica;
    }

    public void setClientePessoaFisica(ClientePessoaFisica clientePessoaFisica) {
        this.clientePessoaFisica = clientePessoaFisica;
    }
}
