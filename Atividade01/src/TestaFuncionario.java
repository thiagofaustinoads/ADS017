
public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(12345, "Joao", Funcionario.SEXO_MASCULINO, 1000);

        System.out.println(funcionario.getMatricula() + " _ "
                + funcionario.getNome() + " _ "
                + funcionario.getSexo() + " _ "
                + funcionario.getSalario());
    }

}
