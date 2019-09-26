package atividade02;

import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class TestaModoExibicao {

    public static void main(String[] args) {

        JFrame janelaPrincipal = new JFrame();
        janelaPrincipal.setTitle("First Dialogo");
        //dialogo.setModal(true);
        janelaPrincipal.setSize(640, 480);
        janelaPrincipal.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        janelaPrincipal.setLocationRelativeTo(null);
        janelaPrincipal.setVisible(true);
        Frame JanelaPrincipal = null;

        JDialog CaixaDialogo = new JDialog(JanelaPrincipal, false);
        CaixaDialogo.setTitle("Caixa Dialogo");
        CaixaDialogo.setLocationRelativeTo(CaixaDialogo);
        CaixaDialogo.setSize(320, 240);
        CaixaDialogo.setVisible(true);
        CaixaDialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        CaixaDialogo.setLocationRelativeTo(CaixaDialogo);

    }

}
