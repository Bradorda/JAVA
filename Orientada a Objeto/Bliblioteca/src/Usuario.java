public class Usuario {
    private String nome;
    private String telefone;
    private String email;
    private String CPF;
    private boolean usuarioEspecial;
    private boolean limite;

    public Usuario (String nome, String telefone, String email, String CPF, boolean usuarioEspecial) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.CPF = CPF;
        this.usuarioEspecial = usuarioEspecial;
        this.limite = true;
    }

    public boolean isLimite() {
        return limite;
    }

    public void setLimite(boolean limite) {
        if(this.usuarioEspecial == false) {
            this.limite = limite;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public boolean isUsuarioEspecial() {
        return usuarioEspecial;
    }

    public void setUsuarioEspecial(boolean usuarioEspecial) {
        this.usuarioEspecial = usuarioEspecial;
    }
}
