package Capítulo_11;

public class Conta {
    private String nome;
    private double saldo;
    private int numero;

    public Conta(String nome, int numero, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void sacar(double quantia) {
        if ((getSaldo() < quantia) || quantia <= 0) {
            throw new IllegalArgumentException("Saldo insuficiente!");
        } setSaldo(getSaldo() - quantia);
    }

    public void depositar(double quantia) {
        if (quantia <= 0) {
            throw new QuantiaInvalidaException("Quantia ilegal!");
        } setSaldo((getSaldo() + quantia));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
