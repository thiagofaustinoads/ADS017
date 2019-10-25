package componentesswing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TestaTabela2 {

    public static void main(String[] args) {

        Object[][] dados = {
            {"Ana", "ana@iesb.com", "01/01/1989"},
            {"João", "joao@iesb.com", "02/07/1990"},
            {"Pedro", "pedro@iesb.com", "05,04,1992"}
        };

        String[] colunas = {"Nome", "Email", "Data Nascimento"};

        JTable tabela = new JTable(dados, colunas);

        JScrollPane rolagem = new JScrollPane();
        rolagem.setViewportView(tabela);

        JFrame janela = new JFrame();
        janela.add(rolagem);
        janela.setSize(600, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

    }
}
