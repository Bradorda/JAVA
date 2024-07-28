public class NestleFactory implements OvoPascoaFactory {

    @Override
    public Alpino criarOvo1() {
        return new Alpino();
    }

    @Override
    public Classic criarOvo2() {
        return new Classic();
    }

    @Override
    public KitKat criarOvo3() {
        return new KitKat();
    }

    public Bis criarOvo4() {
        return new Bis();
    }
}