
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public static class TestaComandoActionListener {
       
    privete OuvinteInterno implements ActionListener {

    @Override
    public void actionPerformed (ActionEvent e) {
        System.out.println("Disparou ouvinte interno...");
    }
   
}

    public static void main(String[] args) {
        ComandoActionListener ouvinte = new ComandoActionListener();
        
        JButton botao = new JButton("Ok");
        botao.addActionListener(ouvinte);
        botao.addActionListener(ouvinte);

        JTextField campo = new JTextField("Pressione Enter");
        campo.addActionListener(ouvinte);
        
        JFrame janela = new JFrame();
        janela.setLayout(new FlowLayout());
        janela.add(botao);
        janela.add(campo);
        janela.setDefaultCloseOperation(
        JFrame.EXIT_ON_CLOSE);
        janela.setSize(300, 200);
        janela.setVisible(true);
    }
}
