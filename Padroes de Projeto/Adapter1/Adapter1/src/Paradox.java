public class Paradox extends BancoDeDados{

    public Paradox(){
        super("paradox","paradox");
    }

    @Override
    public void conectar(){
        super.conectar();
        System.out.println("conectado com paradox");
    }

    @Override
    public void desconectar(){
        super.desconectar();
        System.out.println("desconectado com paradox");
    }

}
