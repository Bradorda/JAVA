public class HersheysFactory implements OvoPascoaFactory {

    @Override
    public Hersheys137 criarOvo1() {
        return new Hersheys137();
    }

    @Override
    public Hersheys225 criarOvo2() {
        return new Hersheys225();
    }

    @Override
    public Hersheys336 criarOvo3() {
        return new Hersheys336();
    }

}