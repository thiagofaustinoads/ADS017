package eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

public class OuvinteJanela implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Disparando windowsClosing...");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja sair?");
        if (opcao == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        System.out.println("Disparando windowClosing...");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Disparando windowClosed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Disparando windowIconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Disparando windowDeiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Disparando windowActivated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Disparando windowDeactivated");
    }

}
