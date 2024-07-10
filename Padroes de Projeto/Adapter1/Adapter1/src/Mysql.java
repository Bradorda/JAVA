public class Mysql extends BancoDeDados{
    public Mysql(){
        super("mysql","mysql");
    }


    @Override
    public void conectar(){
    super.conectar();
        System.out.println("conectado com mysql");
    }

    @Override
    public void desconectar(){
        super.desconectar();
        System.out.println("desconectado mysql");
    }

}

