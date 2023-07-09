public class ContaPoupanca extends Conta{
    private ClientePessoaFisica clientePessoaFisica;

    public ContaPoupanca(ClientePessoaFisica clientePessoaFisica) {
        this.clientePessoaFisica = clientePessoaFisica;
    }

    public void calcRendimentos(){
        super.setSaldo(super.getSaldo()+(super.getSaldo()*0.005));
    }

    public ClientePessoaFisica getClientePessoaFisica() {
        return clientePessoaFisica;
    }

    public void setClientePessoaFisica(ClientePessoaFisica clientePessoaFisica) {
        this.clientePessoaFisica = clientePessoaFisica;
    }
}
