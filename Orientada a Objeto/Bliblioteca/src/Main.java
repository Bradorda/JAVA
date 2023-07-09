import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws UsuarioSemLimiteException, PublicacaoIndisponivelException {

        Usuario usuario = new Usuario("Leo","1","x","13",true);
        Autor autor = new Autor("Camila Queiroz","Atriz");
        Tese tese = new Tese(LocalDate.ofYearDay(1998,35),"aeon",null,autor,343,"era uma vez",LocalDate.ofYearDay(1968,28),"if",35.99);
        Tese tese2 = new Tese(LocalDate.ofYearDay(1998,35),"aeon",null,autor,343,"era uma vez",LocalDate.ofYearDay(1968,28),"if",35.99);

        Emprestimo emprestimo = new Emprestimo(tese,usuario);
        Emprestimo emprestimo1 = new Emprestimo(tese2,usuario);


        System.out.println(emprestimo.renovar());
        System.out.println(emprestimo.renovar());
        System.out.println(emprestimo.renovar());
        System.out.println(emprestimo.renovar());
        System.out.println(emprestimo.devolucao());



    }
}