package CityIF;

public class Botao2 {

	private int estaParaCima;
	
	public void pressionar(int cimaBaixo) {
		this.estaParaCima = cimaBaixo;
	}
	
	public int estado() {
		return estaParaCima;
	}
	
	public void alternar() {
	    estaParaCima = (estaParaCima != 0) ? 0 : 1;
	}

}
