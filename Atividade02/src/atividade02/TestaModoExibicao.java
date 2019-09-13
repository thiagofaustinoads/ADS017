package atividade02;

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

        JDialog caixaDialogo = new JDialog(janelaPrincipal, false);
        caixaDialogo b.setTitle("Caixa Dialogo");
        caixaDialogo.setSize(320, 240);
        caixaDialogo.setVisible(true);

    }

}
