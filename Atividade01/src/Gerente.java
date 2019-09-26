
public class Gerente extends Funcionario {

    private final double bonus;

    public Gerente(double bonus, int matricula, String nome, int sexo, double salario) {
        super(matricula, nome, sexo, salario);
        this.bonus = bonus;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + bonus;
    }

}
