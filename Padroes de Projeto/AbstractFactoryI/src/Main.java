public class Main {

    public static void main(String[] args) {
        String codigoProduto = "NEST001";
        OvoPascoa ovo = DistribuidoraOvosPascoa.getOvo(codigoProduto);
        if (ovo != null) {
            System.out.println(ovo);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}