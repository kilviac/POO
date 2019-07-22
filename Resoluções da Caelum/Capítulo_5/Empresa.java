package Capítulo_5;

public class Empresa {
    String nome, cnpj;
    Funcionario[] empregados;
    static int cont = 0;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void adiciona(Funcionario f) {
        if (cont < empregados.length) {
            this.empregados[cont] = f;
            cont++;
        }
    }

    public void mostraSalarioEmpregados() {
        for (int i = 0; i < this.empregados.length; i++) {
            System.out.println("\nFuncionário na posição: " + i);
            System.out.println("Salario: R$" + this.empregados[i].salario);
        }
    }

    public void mostraEmpregados() {
        for (int i = 0; i < this.empregados.length; i++) {
            System.out.println(this.empregados[i].mostra());
        }
    }

    public boolean contem(Funcionario f) {
        for (Funcionario a : empregados) {
            if (f.estaNaEmpresa == true) {
                System.out.println("\nO(a) funcionário(a) " + f.nome + " está na empresa.");
                return true;
            }
        } System.out.println("\nO(a) funcionário(a) " + f.nome + " não está na empresa.");
        return false;
    }
}