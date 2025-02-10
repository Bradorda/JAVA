package CityIF;

import java.io.IOException;

public class TeclaPressionada {
    private static boolean inicializando = false;
    private static String sistemaOperacional = System.getProperty("os.name").toLowerCase();

    public static void iniciar() throws IOException {
        if (!inicializando && !isWindows()) {
            new ProcessBuilder("sh", "-c", "stty raw -echo </dev/tty").inheritIO().start();
            inicializando = true;
        }
    }

    public static boolean teclaPressionada() throws IOException {
        iniciar();
        return System.in.available() > 0;
    }

    public static void restaurar() throws IOException {
        if (inicializando && !isWindows()) {
            new ProcessBuilder("sh", "-c", "stty cooked echo </dev/tty").inheritIO().start();
            inicializando = false;
        }
    }

    private static boolean isWindows() {
        return sistemaOperacional.contains("win");
    }

    public static void main(String[] args) {
        System.out.println("Pressione qualquer tecla para sair...");

        try {
            while (!teclaPressionada()) {
                System.out.print(".");
                System.out.flush();
                Thread.sleep(100);
            }
            System.out.println("\nTecla pressionada. Encerrando...");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                restaurar();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
