public class Main {
    public static void main(String[] args) {

        ClientePessoaFisica clienteF = new ClientePessoaFisica("Leo","1998","@gmail.com","12345");
        ClientePessoaJuridica clienteJ = new ClientePessoaJuridica("Aeon","333","hotmal","4567");

        ContaEspecial ce = new ContaEspecial(1500,clienteF);
        ContaPoupanca cp = new ContaPoupanca(clienteF);
        ContaCorrente cc = new ContaCorrente(clienteF);
        ContaEmpresarial cem = new ContaEmpresarial(clienteJ);

        System.out.println("Teste calculo rendimentos 0.5 %");
        cp.setSaldo(1500);
        System.out.println(cp.getSaldo());
        cp.calcRendimentos();
        System.out.println(cp.getSaldo());
        System.out.println("--------------------------");

        System.out.println("Teste valor negativo até limite especial, saque 3000 depois 1");
        ce.setSaldo(1500);
        System.out.println(ce.getSaldo());
        ce.sacar(3000);
        System.out.println(ce.getSaldo());
        System.out.println(ce.sacar(1));
        System.out.println("----------------------------");

        System.out.println("teste saldo nunca negativo, saque 1504");
        cc.setSaldo(1503);
        System.out.println(cc.getSaldo());
        System.out.println(ce.sacar(1504));
        System.out.println("----------------------------");

        System.out.println("nenhum teste!");
        cem.setSaldo(1111);
        System.out.println(cem.getSaldo());
        System.out.println("------------------------------");





    }
}