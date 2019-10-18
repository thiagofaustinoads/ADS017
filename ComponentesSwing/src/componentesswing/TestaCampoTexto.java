
package componentesswing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TestaCampoTexto {
    public static void main(String[] args) {
        JLabel rotuloTexto = new JLabel("Informa um texto:");
        JLabel rotuloDataNascimento = new JLabel("Data de Nascimento");
        JTextField campoTexto = new JTextField(40);
        JTextField campoDataNascimento = new JTextField(15);
        campoDataNascimento.setText("  /  /  ");
        campoDataNascimento.setEditable(false);
        
        GridLayout leiaute = new GridLayout(10,2);
        
        JPanel painel = new JPanel();
        painel.setLayout(leiaute);
        painel.add(rotuloTexto);
        painel.add(campoTexto);
        painel.add(rotuloDataNascimento);
        painel.add(campoDataNascimento);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
}