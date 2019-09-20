package atividade6;

import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class TestaWindowFocusListener {

    public static void main(String[] args) {

        OuvinteWindowFocusListener ouvinte = new OuvinteWindowFocusListener();

        JFrame janela = new JFrame();
        janela.addWindowFocusListener(ouvinte);
        janela.setSize(300, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);


    }
}
