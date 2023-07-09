import java.time.LocalDate;
import java.util.Date;
import java.util.List;
public class Tese extends Publicacao{
    private int numPaginas;
    private String resumo;
    private LocalDate dataDefesa;
    private String nomeInstituicaoDefesa;

    public Tese (LocalDate dataPublicacao, String titulo, List<Publicacao> referencias, Autor autor, int numPaginas, String resumo, LocalDate dataDefesa, String nomeInstituicaoDefesa, double valorMulta) {
        super(dataPublicacao, titulo, referencias,autor,valorMulta);
        this.numPaginas = numPaginas;
        this.resumo = resumo;
        this.dataDefesa = dataDefesa;
        this.nomeInstituicaoDefesa = nomeInstituicaoDefesa;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public LocalDate getDataDefesa() {
        return dataDefesa;
    }

    public void setDataDefesa(LocalDate dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public String getNomeInstituicaoDefesa() {
        return nomeInstituicaoDefesa;
    }

    public void setNomeInstituicaoDefesa(String nomeInstituicaoDefesa) {
        this.nomeInstituicaoDefesa = nomeInstituicaoDefesa;
    }
}

