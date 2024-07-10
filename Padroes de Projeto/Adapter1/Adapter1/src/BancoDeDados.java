public class BancoDeDados {
    private String nome;
    private String senha;
    private boolean conectado = false;

    public BancoDeDados(){

    }

    public BancoDeDados(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public void conectar(){
        if(!this.conectado){
            this.conectado = true;
            System.out.println("Conectado");
        } else{
            System.out.println("Ja Conectado");
        }
    }

    public void desconectar(){
        if(this.conectado){
            this.conectado = false;
            System.out.println("Desconectado");
        }else {
            System.out.println("Não ha conexao");
            ;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }


}
