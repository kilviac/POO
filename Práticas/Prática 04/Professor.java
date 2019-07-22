public class Professor extends Funcionario {
    private int numeroHoras;

    public Professor(String matricula, String endereco, String nome, int idade, int numeroHoras) {
        super(matricula, endereco, nome, idade);
        this.numeroHoras = numeroHoras;
        setSalario(super.getSalario() + numeroHoras);
    }

    @Override
    public String toString() {
        return "\n--- Professor ---" + super.toString() + "\nNúmero de horas: " + this.numeroHoras;
    }
}
