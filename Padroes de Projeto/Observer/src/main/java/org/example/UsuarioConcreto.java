package org.example;

class UsuarioConcreto implements Observer {
    private Usuario usuario;

    public UsuarioConcreto(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void update(String mensagem) {
        System.out.println("Notificação para " + usuario.getNome() + ": " + mensagem);
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
