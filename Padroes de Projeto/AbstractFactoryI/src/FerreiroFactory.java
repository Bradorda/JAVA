public class FerreiroFactory implements OvoPascoaFactory {

    @Override
    public Ferreiro137 criarOvo1() {
        return new Ferreiro137();
    }

    @Override
    public Ferreiro255 criarOvo2() {
        return new Ferreiro255();
    }

    @Override
    public Ferreiro366 criarOvo3() {
        return new Ferreiro366();
    }
}