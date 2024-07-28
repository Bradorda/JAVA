public abstract class OvoPascoa {
    private String nome;
    private int peso;
    private String descricao;
    private String codigo;
    private double preco;

    public OvoPascoa(String nome, int peso, String descricao, String codigo, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.descricao = descricao;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public int getPeso() { return peso; }
    public String getDescricao() { return descricao; }
    public String getCodigo() { return codigo; }
    public double getPreco() { return preco; }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Peso: " + peso + "g, Descrição: " + descricao + ", Código: " + codigo + ", Preço: R$" + preco;
    }
}