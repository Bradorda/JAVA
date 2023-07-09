import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Livro extends Publicacao{
    private String numEdicao;
    private String nomeEditora;
    private String ISBN;

    public Livro(LocalDate dataPublicacao, String titulo, List<Publicacao> referencias, List<Autor> autores, String numEdicao, String nomeEditora, String ISBN, double valorMulta) {
        super(dataPublicacao, titulo, referencias, autores,valorMulta);
        this.numEdicao = numEdicao;
        this.nomeEditora = nomeEditora;
        this.ISBN = ISBN;
    }

    public String getNumEdicao() {
        return numEdicao;
    }

    public void setNumEdicao(String numEdicao) {
        this.numEdicao = numEdicao;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
