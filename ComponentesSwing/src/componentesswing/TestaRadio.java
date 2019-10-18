
package componentesswing;

import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class TestaRadio {
    public static void main(String[] args) {
        JLabel rotulo = new JLabel ("Escolha uma titulação");
        
        JRadioButton radioNivelMedio = new JRadioButton("Nivel Médio");
        JRadioButton radioNivelSuperior = new JRadioButton("Nivel Superior");
        JRadioButton radioNivelEspecialista = new JRadioButton("Nivel Especialista");
        JRadioButton radioNivelMestre = new JRadioButton("Nivel Mestre");
        JRadioButton radioNivelDoutor = new JRadioButton("Nivel Doutor");
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioNivelMedio);
        grupo.add(radioNivelDoutor);
        grupo.add(radioNivelSuperior);
        grupo.add(radioNivelEspecialista);
        grupo.add(radioNivelMestre);
        grupo.add(radioNivelDoutor);
        
        JPanel painel = new JPanel (new GridLayout(10,5));
        painel.add(rotulo);
        painel.add(radioNivelMedio);
        painel.add(radioNivelEspecialista);
        painel.add(radioNivelMestre);
        painel.add(radioNivelDoutor);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(600, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
    
}
