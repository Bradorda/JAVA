import java.time.LocalDate;
import java.util.Date;
import java.util.List;
public class Artigo extends Publicacao{
    private String resumo;

    public Artigo(LocalDate dataPublicacao, String titulo, List<Publicacao> referencias, List<Autor> autores, String resumo, double valorMulta) {
        super(dataPublicacao, titulo, referencias, autores,valorMulta);
        this.resumo = resumo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}
