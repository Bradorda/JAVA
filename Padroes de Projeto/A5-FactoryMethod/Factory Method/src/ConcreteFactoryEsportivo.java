public class ConcreteFactoryEsportivo implements FactoryEsportivo {
    @Override
    public Esportivo getProduto(String nomeTime, String produto) {
        if(nomeTime.equals("brasil")){
            return new EsportivoNike(produto);
        }else if(nomeTime.equals("flamengo")){
            return new EsportivoAdidas(produto);
        }else if(nomeTime.equals("botafogo")){
            return new EsportivoPuma(produto);
        }else if(nomeTime.equals("fluminense")){
            return new EsportivoUmbro(produto);
        }else if(nomeTime.equals("vasco")){
            return new EsportivoKappa(produto);
        }else{
            System.out.println("Time não encontrado");
            return null;
        }
    }

}