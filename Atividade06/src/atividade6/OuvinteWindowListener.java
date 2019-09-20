
package atividade6;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class OuvinteWindowListener implements WindowListener {

    @Override
    public void windowOpened(WindowEvent we) {
         System.out.println("Janela aberta");
   }

    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("Fechando a janela");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("Janela fechada");    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Janela inativa");    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        System.out.println("Janela minimizada");    }

    @Override
    public void windowActivated(WindowEvent we) {
        System.out.println("Janela ativa");    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("Janela inativa");    }
    
}
