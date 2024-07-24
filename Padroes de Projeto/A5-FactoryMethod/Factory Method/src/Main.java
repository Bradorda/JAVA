import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConcreteFactoryEsportivo fabrica = new ConcreteFactoryEsportivo();
        String nomeTime;
        String produto;
        boolean continuar = true;

        Scanner ler = new Scanner(System.in);
        int escolha;

        System.out.println("Bem-vindo!");

        while (continuar) {
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1: Definir Produto");
            System.out.println("0: Sair");
            System.out.print("Opção: ");

            if (ler.hasNextInt()) {
                escolha = ler.nextInt();
                ler.nextLine();

                switch (escolha) {
                    case 1:
                        System.out.println("Digite o time de preferência: (Digite o nome do time em minúsculas)");
                        System.out.println("---------");
                        System.out.println("Brasil");
                        System.out.println("Flamengo");
                        System.out.println("Botafogo");
                        System.out.println("Fluminense");
                        System.out.println("Vasco");
                        System.out.println("----------");

                        nomeTime = ler.nextLine().toLowerCase();

                        System.out.println("Digite o produto que quer produzir:");
                        System.out.println("------------------------------------");
                        System.out.println("|| Camisa, Bola, Chuteira ||");
                        System.out.println("------------------------------------");
                        System.out.println("Escreva os nomes em minúsculas e sem acentuação");

                        produto = ler.nextLine().toLowerCase();

                        switch (produto) {
                            case "camisa":
                                produto = "Camisa";
                                break;
                            case "bola":
                                produto = "Bola";
                                break;
                            case "chuteira":
                                produto = "Chuteira";
                                break;
                            default:
                                System.out.println("Produto não definido, criando Camisa por padrão.");
                                produto = "Camisa";
                                break;
                        }

                        System.out.println("");
                        fabrica.getProduto(nomeTime, produto);
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                ler.next(); // Limpa o buffer
            }
            System.out.println();
        }

        System.out.println("Obrigado por utilizar o sistema.");
        ler.close();
    }
}
