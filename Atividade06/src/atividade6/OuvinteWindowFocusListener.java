package atividade6;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class OuvinteWindowFocusListener implements WindowFocusListener {

    @Override
    public void windowGainedFocus(WindowEvent we) {
         System.out.println("Janela ganhou o foco");
    }

    @Override
    public void windowLostFocus(WindowEvent we) {
         System.out.println("Janela perdeu o foco");
    }
    
}
