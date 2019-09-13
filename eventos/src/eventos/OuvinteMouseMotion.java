package eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class OuvinteMouseMotion implements MouseMotionListener {

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Disáramdp mouseMoved...");
        System.out.println("X=" + e.getX() + "");    }

}
