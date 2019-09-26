package atividade02;

import javax.swing.JDialog;

public class TestaCaixaDialogo {

    public static void main(String[] args) {

        JDialog caixaDialogo = new JDialog();
        caixaDialogo.setTitle("First Dialogo");
        //dialogo.setModal(true);
        caixaDialogo.setSize(320, 240);
        caixaDialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        caixaDialogo.setLocationRelativeTo(null);
        caixaDialogo.setVisible(true);

    }

}
