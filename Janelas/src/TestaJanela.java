
import javax.swing.JDialog;
import javax.swing.JFrame;

public class TestaJanela {

    public static void main(String[] args) {

    
        JDialog dialogo = new JDialog();
        dialogo.setTitle("Minha Caixa de Dialogo");
        dialogo.setModal(true);
        dialogo.setSize(200,100);    
        //dialogo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);
     
        
    }