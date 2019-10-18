package componentesswing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TestaBotao {

    public static void main(String[] args) {
        JButton ok = new JButton();
        ok.setText("OK");
        JButton cancelar = new JButton("Cancelar");
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "Deseja Sair", "Confirmação",
                        JOptionPane.YES_NO_CANCEL_OPTION);
            }
        });

        JPanel painel = new JPanel();
        painel.setLayout((LayoutManager) new FlowLayout(FlowLayout.RIGHT));
        painel.add(ok);
        painel.add(cancelar);

        JFrame janela = new JFrame();
        janela.add(painel, BorderLayout.SOUTH);
        janela.setSize(600, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

    }

    public TestaBotao() {
    }
}
