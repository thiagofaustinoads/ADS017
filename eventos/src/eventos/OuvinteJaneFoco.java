package eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class OuvinteJaneFoco implements WindowFocusListener{

    @Override
    public void windowGainedFocus(WindowEvent e) {
        System.out.println("Disparando windowsGainedFocus...");    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        System.out.println("Disparando windowsLostFocus...");    }

}
