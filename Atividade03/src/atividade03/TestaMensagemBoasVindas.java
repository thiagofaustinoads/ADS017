package atividade03;

import javax.swing.JOptionPane;

public class TestaMensagemBoasVindas {

    public static void main(String[] args) {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja iniciar o programa?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            String nome = JOptionPane.showInputDialog(null, "Informe seu nome");
            if (nome != null) {
                JOptionPane.showMessageDialog(null, "Bem-vindo " + nome, "aviso", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "nome nao informado!", "erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "O programa foi encerrado.", "Alerta", JOptionPane.WARNING_MESSAGE);

        }

    }
}
