package CityIF;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CityIfApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CityIfApplication.class, args);
		
		
		Acao acao = new Acao();
		
		acao.exibir();
		while(acao.continua()) {
			acao.realizar();
			acao.exibir();
		}
		acao.resultados();
		
		
		
		/*ColecaoPessoas colecaoPessoas = new ColecaoPessoas();	
		ColecaoAndares colecaoAndares = new ColecaoAndares();
		ColecaoElevadores colecaoElevadores = new ColecaoElevadores();
		
		Predio predio = new Predio(colecaoPessoas,colecaoAndares,colecaoElevadores);
		
		
		colecaoElevadores.acao(colecaoAndares, colecaoPessoas);
		colecaoPessoas.executarAcao();
		
		predio.exibir();
		
		predio.realizar();
		
		//verificar elevadores
		System.out.println(predio.getOsElevadores().getElevadores().length);
		
		System.out.println(predio.getOsAndares().getAndares().length);
		
		System.out.println(predio.getAsPessoas().getPessoas().length);
		
		predio.getAsPessoas().embarcarQualquer(0, 0, null);*/
	
		
		
		
		
		/*//testar simulacao
		JanelaSimulacao janelaSimulacao = new JanelaSimulacao();
        janelaSimulacao.adicionarTexto("Janela de Simulação Inicializada!");
        janelaSimulacao.iniciarTextoNegrito();
        janelaSimulacao.adicionarTexto("Exemplo de Texto em Negrito");
        janelaSimulacao.finalizarTextoNegrito();
        janelaSimulacao.adicionarTextoFormatado("Saída formatada: %d + %d = %d", 5, 3, (5 + 3));
	
	
	 
	
*/
	}
}
	
