package CityIF;

public class Botao {

	private int estaParaCima;
	
	
	public void pressionar(int cimaBaixo) {
		this.estaParaCima = cimaBaixo;
	}
	
	public int estado() {
		return this.estaParaCima;
	}

	
}
