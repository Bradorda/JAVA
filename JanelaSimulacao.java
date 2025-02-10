package CityIF;

import javax.swing.*;
import java.awt.*;

public class JanelaSimulacao {
    private JFrame janela;
    private JTextArea areaTexto;

    public JanelaSimulacao() {
        janela = new JFrame("Janela de Simulacao");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(600, 400);
        janela.setLayout(new BorderLayout());

        areaTexto = new JTextArea();
        areaTexto.setFont(new Font("Monospaced", Font.PLAIN, 14));
        janela.add(new JScrollPane(areaTexto), BorderLayout.CENTER);

        janela.setVisible(true);
    }

    public void suspenderExibircao() {
        janela.setVisible(false);
    }

    public void retomarExibicao() {
        janela.setVisible(true);
    }

    public void abrirExibicao() {
        areaTexto.setText("");
    }

    public void moverCursor(int y, int x) {
        areaTexto.setCaretPosition(areaTexto.getDocument().getLength());
    }

    public void limparExibicao() {
        areaTexto.setText("");
    }

    public void esconderCursor() {
        areaTexto.setCursor(null);
    }

    public void adicionarCaractere(char ch) {
        areaTexto.append(String.valueOf(ch));
    }

    public void adicionarTexto(String str) {
        areaTexto.append(str + "\n");
    }

    public void adicionarTextoFormatado(String format, Object... args) {
        areaTexto.append(String.format(format, args) + "\n");
    }

    public void iniciarTextoNegrito() {
        areaTexto.setFont(new Font("Monospaced", Font.BOLD, 14));
    }

    public void finalizarTextoNegrito() {
        areaTexto.setFont(new Font("Monospaced", Font.PLAIN, 14));
    }

    public static void main(String[] args) {
        JanelaSimulacao janelaSimulacao = new JanelaSimulacao();

        janelaSimulacao.adicionarTexto("Janela de Simulação Inicializada!");
        janelaSimulacao.iniciarTextoNegrito();
        janelaSimulacao.adicionarTexto("Exemplo de Texto em Negrito");
        janelaSimulacao.finalizarTextoNegrito();
        janelaSimulacao.adicionarTextoFormatado("Saída formatada: %d + %d = %d", 5, 3, (5 + 3));
    }
}
