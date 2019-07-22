package Capítulo_4;

public class Funcionario {
    String nome, departamento, rg;
    Data dataDeEntrada;
    double salario;
    boolean estaNaEmpresa = true;

    public void bonifica(double quantia) {
        salario = salario+quantia;
    }

    public double calculaGanhoAnual() {
        return salario*12;
    }

    public void demite() {
        estaNaEmpresa = false;
    }

    public void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: R$" + this.salario);
        System.out.println("Data de entrada: " + this.dataDeEntrada.formatada());
        System.out.println("RG: " + this.rg);
    }
}
