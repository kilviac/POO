public class Gerente extends Funcionario{
    private double gratificacao = 1200;

    public Gerente(String matricula, String endereco, String nome, int idade) {
        super(matricula, endereco, nome, idade);
        setSalario(super.getSalario() + this.gratificacao);
    }

    public String toString() {
        return "\n--- Gerente ---" + super.toString();
    }
}
