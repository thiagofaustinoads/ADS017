package eventos;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestaOuvinteTeclado {

    public static void main(String[] args) {
        OuvinteTeclado ouvinte = new OuvinteTeclado();

        JTextField campo = new JTextField();
        campo.addKeyListener(ouvinte);

        JFrame janela = new JFrame();
        janela.add(campo, BorderLayout.NORTH);
        janela.setSize(300, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

    }
}
