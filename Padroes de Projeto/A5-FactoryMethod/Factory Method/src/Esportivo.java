public class Esportivo {
    public String nomeTime;
    public String nomeFabrica;
    public String produto;

    @Override
    public String toString() {
        return "Fabricante: "+ this.nomeFabrica +", Produzindo "+this.produto +" do Time: "+this.nomeTime;
    }
}