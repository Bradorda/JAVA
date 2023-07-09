public class Bliblioteca {
    private String nome;
    private String endereco;
    private Publicacao publicacao;

    public Bliblioteca(String nome, String endereco, Publicacao publicacao) {
        this.nome = nome;
        this.endereco = endereco;
        this.publicacao = publicacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Publicacao getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }
}
