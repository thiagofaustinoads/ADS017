package atividade07;

import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestaNumeroKeyListener {

    public static void main(String[] args) {
        NumeroKeyListener ouvinte = new NumeroKeyListener();
        JTextField campo = new JTextField();
        campo.addKeyListener(ouvinte);
        JFrame janela = new JFrame();
        janela.addKeyListener((KeyListener) campo);
        janela.setSize(500, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

    }
}
