package Capítulo_6;

public class Funcionario {
    private String nome, departamento, rg;
    private Data dataDeEntrada;
    private double salario;
    private boolean estaNaEmpresa = true;

    public Funcionario(String nome, String departamento, String rg, Data dataDeEntrada, double salario) {
        setNome(nome);
        setDepartamento(departamento);
        setRg(rg);
        setDataDeEntrada(dataDeEntrada);
        setSalario(salario);
    }

    public Funcionario() {
        setNome("--- Sem nome ---");
        setDepartamento("--- Sem departamento ---");
        setRg("0");
        setDataDeEntrada(new Data(0,0,0));
        setSalario(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Data getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(Data dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isEstaNaEmpresa() {
        return estaNaEmpresa;
    }

    public void setEstaNaEmpresa(boolean estaNaEmpresa) {
        this.estaNaEmpresa = estaNaEmpresa;
    }

    public void bonifica(double quantia) {
        setSalario(getSalario()+quantia);
    }

    public double calculaGanhoAnual() {
        return getSalario()*12;
    }

    public void demite() {
        setEstaNaEmpresa(false);
    }

    public String mostra() {
        return "\nNome: " + getNome() + "\nDepartamento: " + getDepartamento() + "\nSalário: R$" + getSalario() + "\nData de entrada: " + getDataDeEntrada().formatada() + "\nRG: " + getRg();
    }
}