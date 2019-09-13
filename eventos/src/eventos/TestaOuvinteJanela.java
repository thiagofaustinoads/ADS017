package eventos;

import javax.swing.JFrame;

public class TestaOuvinteJanela {

    public static void main(String[] args) {
        OuvinteJanela ouvinte = new OuvinteJanela();
        OuvinteJaneFoco ouvinteFoco = new OuvinteJaneFoco();
        OuvinteJanelaEstado ouvinteEstado = new OuvinteJanelaEstado();

        JFrame janela = new JFrame();
        janela.addWindowListener(ouvinte);
        janela.addWindowFocusListener(ouvinteFoco);
        janela.addWindowStateListener(ouvinteEstado);
        janela.setSize(300, 300);
        janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        janela.setVisible(true);
    }
}
