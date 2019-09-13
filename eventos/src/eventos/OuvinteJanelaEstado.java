package eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class OuvinteJanelaEstado implements WindowStateListener {

    @Override
    public void windowStateChanged(WindowEvent e) {
        System.out.println("Disparando WindowStateListener...");
        System.out.println(
                " Mudou de "
                + e.getOldState()
                + " para "
                + e.getNewState()
        );
    }

}
