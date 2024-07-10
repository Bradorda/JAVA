public class AdapterBD implements iAdapter{
    private Usuario usuario;

    public AdapterBD(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void iniciarConexao(BancoDeDados db) {
        if(db != null){
            db.conectar();
        }
    }

    @Override
    public void terminarConexao(BancoDeDados db) {
        if(db != null){
            db.desconectar();
        }

    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
