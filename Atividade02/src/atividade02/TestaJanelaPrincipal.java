package atividade02;

import javax.swing.JFrame;

public class TestaJanelaPrincipal {

    public static void main(String[] args) {

        JFrame janela = new JFrame(); //criação da janela
        janela.setTitle("Janela Principal"); //titulo da janela
        janela.setSize(640, 480); //tamanho da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar execução da janela 
        janela.setLocationRelativeTo(null);
        //janela.setExtendedState(JFrame.MAXIMIZED_BOTH); //janela tela cheia
        janela.setVisible(true); //janela visivel 

        JFrame janela2 = new JFrame();
        janela2.setTitle("Second Window");
        janela2.setSize(640, 480);
    }

}
