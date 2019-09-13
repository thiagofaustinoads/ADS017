import javax.swing.JFrame;

public class TestaOuvinteMouse {

    public static void main(String[] args) {
        OuvinteMouse ouvinte = new OuvinteMouse();

        JFrame janela = new JFrame();
        janela.addMouseListener(ouvinte);
        janela.setSize(300,300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
    }
}
