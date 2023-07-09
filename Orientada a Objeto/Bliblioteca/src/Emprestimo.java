import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
public class Emprestimo {
    private Publicacao publicacao;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataPossivelEntrega;
    private LocalDate dataEntrega;
    private int renovacoes;
    private double multa;

    public Emprestimo (Publicacao publicacao, Usuario usuario) throws UsuarioSemLimiteException,PublicacaoIndisponivelException {
       if(usuario.isLimite()==false){
           throw new UsuarioSemLimiteException("Limite Insuficiente!");
       }
       if(publicacao.isDisponibilidade()==false){
           throw new PublicacaoIndisponivelException("Publicacao Indisponivel!");
       }

        this.publicacao = publicacao;
        this.usuario = usuario;
        this.dataEmprestimo = LocalDate.now();
        this.dataPossivelEntrega = this.dataEmprestimo.plusDays(7);
        this.renovacoes = 0;
        publicacao.setDisponibilidade(false);
        usuario.setLimite(false);
    }

    public boolean renovar(){
        LocalDate dataHoje = LocalDate.now();
        if(this.renovacoes < 3){
        if(!dataHoje.isAfter(this.dataPossivelEntrega)){
                this.renovacoes++;
                this.dataPossivelEntrega = dataHoje.plusDays(7);
            } return true;
        } else
            return false;
    }

    public double devolucao(){
        this.publicacao.setDisponibilidade(true);
        this.usuario.setLimite(true);
        this.dataEntrega = LocalDate.now();
        return calcularMulta();
    }

    public double calcularMulta(){
        if(dataEntrega.isAfter(dataPossivelEntrega)){
            Period periodo = Period.between(dataEntrega, dataPossivelEntrega);
            int diasAtraso = Math.abs(periodo.getDays());
            return this.multa = diasAtraso * this.publicacao.getValorMulta();
        }else
            return this.multa;
    }

    public LocalDate getDataPossivelEntrega() {
        return dataPossivelEntrega;
    }

    public void setDataPossivelEntrega(LocalDate dataPossivelEntrega) {
        this.dataPossivelEntrega = dataPossivelEntrega;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public int getRenovacoes() {
        return renovacoes;
    }

    public void setRenovacoes(int renovacoes) {
        this.renovacoes = renovacoes;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public Publicacao getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
}
