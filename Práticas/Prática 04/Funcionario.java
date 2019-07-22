public class Funcionario {
    private String matricula, endereco, nome;
    private int idade;
    private double salario = 480;

    public Funcionario() {
        setMatricula("--- Sem matrícula ---");
        setEndereco("--- Sem endereço ---");
        setNome("--- Sem nome ---");
        setIdade(0);
    }

    public Funcionario (String matricula, String endereco, String nome, int idade) {
        setMatricula(matricula);
        setEndereco(endereco);
        setNome(nome);
        setIdade(idade);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return "\nNome: " + getNome() + "\nMatrícula: " + getMatricula() + "\nIdade: " + getIdade() +
                "\nEndereço: " + getEndereco() + "\nSalário: R$" + getSalario();
    }
}
