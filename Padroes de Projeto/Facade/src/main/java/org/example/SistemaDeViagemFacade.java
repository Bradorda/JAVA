package org.example;

public class SistemaDeViagemFacade {
    private SistemaDePassagemAerea passagemAerea;
    private SistemaDeHotel hotel;
    private SistemaDeAluguelCarro aluguelCarro;
    private SistemaDePagamento pagamento;

    public SistemaDeViagemFacade() {
        this.passagemAerea = new SistemaDePassagemAerea();
        this.hotel = new SistemaDeHotel();
        this.aluguelCarro = new SistemaDeAluguelCarro();
        this.pagamento = new SistemaDePagamento();
    }

    public void comprarPacote(String nome, String cpf, String classeVoo, String assento,
                              String tipoQuarto, int numPessoas, String tipoCarro,
                              String formaPagamento) {
        double valorPassagem = passagemAerea.reservarPassagem(classeVoo, assento);
        double valorHotel = hotel.reservarQuarto(tipoQuarto, numPessoas);
        double valorCarro = aluguelCarro.reservarCarro(tipoCarro);
        double valorTotal = valorPassagem + valorHotel + valorCarro;

        double valorFinal = pagamento.realizarPagamento(valorTotal, formaPagamento);

        System.out.println("\nDados do Comprador: ");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("\nDetalhes da Compra: ");
        System.out.println("Classe do Voo: " + classeVoo);
        System.out.println("Assento: " + assento);
        System.out.println("Tipo de Quarto: " + tipoQuarto);
        System.out.println("Número de Pessoas: " + numPessoas);
        System.out.println("Tipo de Carro: " + tipoCarro);
        System.out.println("Forma de Pagamento: " + formaPagamento);
        System.out.println("Valor Total do Pacote: R$ " + valorTotal);
        System.out.println("Valor Final com Descontos/Acrescimos: R$ " + valorFinal);
    }
}