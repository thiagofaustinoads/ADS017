
import dados.Aluno;
import dados.AlunoDAO;
import dados.DadosException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestaAlunoDAO {

    public static void main(String[] args) {
        AlunoDAO dao = new AlunoDAO();
        try {
            for (Aluno aluno : dao.listar()) {
                System.out.println(aluno);
            }
        } catch (DadosException ex) {
            System.out.println(ex.getMessage() + ex.getCause().getMessage());
        }

        Aluno aluno = new Aluno();
        aluno.setMatricula(2009300);
        aluno.setNome("PAULO");

        try {
            dao.incluir(aluno);
        } catch (DadosException ex) {
            System.out.println(ex.getMessage() + ex.getCause().getMessage());
        }
        
        try {
            aluno = dao.consultar(1);
        } catch (DadosException ex) {
            System.out.println(ex.getMessage() + ex.getCause().getMessage());
        }
        
        aluno.setNome("ANGELICA");
        try {
            dao.alterar(aluno);
        } catch (DadosException ex) {
            System.out.println(ex.getMessage() + ex.getCause().getMessage());
        }
        
        try {
            dao.excluir(2);
        } catch (DadosException ex) {
            System.out.println(ex.getMessage() + ex.getCause().getMessage());
        }
    }
}
