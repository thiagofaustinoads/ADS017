
package componentesswing;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTable;


public class TestaTabela1 {
    public static void main(String[] args) {
        JTable tabela = new JTable(20, 5);
        
        JFrame janela = new JFrame();
        janela.add(tabela );
        janela.setSize(600, 400);
        janela.setLocationRelativeTo(null); //centraliza a janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
}
