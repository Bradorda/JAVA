public class GarotoFactory implements OvoPascoaFactory {

    @Override
    public Crocante criarOvo1() {
        return new Crocante();
    }

    @Override
    public Talento criarOvo2() {
        return new Talento();
    }

    @Override
    public Baton criarOvo3() {
        return new Baton();
    }

    public Caribe criarOvo4() {
        return new Caribe();
    }
}