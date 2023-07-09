public class ContaEmpresarial extends Conta{
    private ClientePessoaJuridica clientePessoaJuridica;

    public ContaEmpresarial(ClientePessoaJuridica clientePessoaJuridica) {
        this.clientePessoaJuridica = clientePessoaJuridica;
    }

    public ClientePessoaJuridica getClientePessoaJuridica() {
        return clientePessoaJuridica;
    }

    public void setClientePessoaJuridica(ClientePessoaJuridica clientePessoaJuridica) {
        this.clientePessoaJuridica = clientePessoaJuridica;
    }
}
