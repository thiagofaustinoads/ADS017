package eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class OuvinteTeclado implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Disparando KeyTyped...");
        //Converte para Miusculo
        if (e.getKeyChar() < KeyEvent.VK_0
                || e.getKeyChar() > KeyEvent.VK_9) {
            e.setKeyChar(Character.toUpperCase(e.getKeyChar()));

        }
        //so pirmite muneros
        if (e.getKeyChar() < KeyEvent.VK_0
                || e.getKeyChar() > KeyEvent.VK_9) {
            e.setKeyChar('\0');
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Disparando KeyTyped...");
        System.out.println(
                "A teclado Pressionada foi "
                + e.getKeyCode()
        );

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Disparamdo KeyReleased...");
    }
}

