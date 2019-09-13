package eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class OuvinteMuse implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Disparando mouseClicked...");
        System.out.println("Clicou o botão" + e.getButton());
        System.out.println("Clicou" + e.getClickCount() + "vez(es)");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Disparando mousePressed...");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Disparando mouseReleased...");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Disparando mouseEntered...");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Disparando mouseExited...");
    }

}
