package horadosistema;

import java.awt.*;

public class Resolucao {
    public static void main(String[] args) {
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension tamanho = tela.getScreenSize();
        System.out.println("A resolução da sua máquina é: " +tamanho.width + " x " +tamanho.height);
    }
}
