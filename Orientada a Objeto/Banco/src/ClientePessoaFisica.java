public class ClientePessoaFisica extends Cliente{
    private String cpf;

    public ClientePessoaFisica(String nome, String telefone, String email,String cpf) {
        super(nome, telefone, email);
        this.cpf =cpf;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
