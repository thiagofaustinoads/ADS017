package main;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;



public class Janela extends JFrame {

  public static void main(String[] args) {

    JFrame janela = new Janela();

    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    janela.setSize(300, 200);

    janela.setVisible(true);

  }



  public Janela() {

    this.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent e) {

        ((JFrame)e.getSource()).setTitle("Principal");

      }

        @Override
        public void actionPerformed(ActionEvent ae) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    });

  }

    private void addActionListener(ActionListener actionListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}