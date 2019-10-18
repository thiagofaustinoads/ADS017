
package componentesswing;

import java.awt.FlowLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TestaaixaCombinacao {
    public static void main(String[] args) {
        JLabel rotuloUF = new JLabel("UF");
        JLabel rotuloCidade = new JLabel("cidade");
        
        String[] ufs = {"DF", "GO"};
        JComboBox caixaUF = new JComboBox(ufs);
        caixaUF.addItem("MG");
        caixaUF.setSelectedIndex(1);
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Brasilia");
        JComboBox caixaCidade = new JComboBox();
        caixaCidade.setModel(modelo);
        
        JPanel painel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painel.add(rotuloUF);
        painel.add(caixaUF);
        painel.add(rotuloCidade);
        painel.add(caixaCidade);
       
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
