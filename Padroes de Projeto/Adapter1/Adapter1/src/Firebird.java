public class Firebird extends BancoDeDados{

    public Firebird(){
        super("firebird","firebird");
    }

    @Override
    public void conectar(){
    super.conectar();
        System.out.println("conectado com firebird");
    }

    @Override
    public void desconectar(){
        super.desconectar();
        System.out.println("desconectado firebird");
    }

}
