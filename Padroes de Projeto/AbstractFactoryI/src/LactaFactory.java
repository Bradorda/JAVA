public class LactaFactory implements OvoPascoaFactory {

    @Override
    public AoLeite criarOvo1() {
        return new AoLeite();
    }

    @Override
    public Oreo criarOvo2() {
        return new Oreo();
    }

    @Override
    public SonhoDeValsa criarOvo3() {
        return new SonhoDeValsa();
    }

    public OuroBranco criarOvo4() {
        return new OuroBranco();
    }
}