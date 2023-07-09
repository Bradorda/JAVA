import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Publicacao {
    private LocalDate dataPublicacao;
    private String titulo;
    private List <Publicacao> referencias = new ArrayList<>();
    private List <Autor> autores = new ArrayList<>();
    private Autor autor;
    private boolean disponibilidade;
    private double valorMulta;

    public Publicacao (LocalDate date, String titulo, List<Publicacao> referencias, List<Autor> autores,double valorMulta) {
        this.dataPublicacao = date;
        this.titulo = titulo;
        this.referencias = referencias;
        this.autores = autores;
        this.valorMulta = valorMulta;
        this.disponibilidade = true;
    }

    public Publicacao(LocalDate date, String titulo, List<Publicacao> referencias, Autor autor,double valorMulta) {
        this.dataPublicacao = date;
        this.titulo = titulo;
        this.referencias = referencias;
        this.autor = autor;
        this.valorMulta = valorMulta;
        this.disponibilidade = true;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Publicacao> getReferencias() {
        return referencias;
    }

    public void setReferencias(List<Publicacao> referencias) {
        this.referencias = referencias;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
}
