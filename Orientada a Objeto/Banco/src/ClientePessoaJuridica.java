public class ClientePessoaJuridica extends Cliente{
    private String cnpj;

    public ClientePessoaJuridica(String nome, String telefone, String email,String cnpj) {
        super(nome, telefone, email);
        this.cnpj = cnpj;
    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
