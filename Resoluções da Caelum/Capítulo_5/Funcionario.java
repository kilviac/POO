package Capítulo_5;

public class Funcionario {
    String nome, departamento, rg;
    Data dataDeEntrada;
    double salario;
    boolean estaNaEmpresa = true;

    public Funcionario(String nome, String departamento, String rg, Data dataDeEntrada, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.rg = rg;
        this.dataDeEntrada = dataDeEntrada;
        this.salario = salario;
    }

    public void bonifica(double quantia) {
        salario = salario+quantia;
    }

    public double calculaGanhoAnual() {
        return salario*12;
    }

    public void demite() {
        estaNaEmpresa = false;
    }

    public String mostra() {
        return "\nNome: " + this.nome + "\nDepartamento: " + this.departamento + "\nSalário: R$" + this.salario + "\nData de entrada: " + this.dataDeEntrada.formatada() + "\nRG: " + this.rg;
    }
}