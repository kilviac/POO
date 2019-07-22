package Capítulo_9;

public abstract class Conta {
    protected double saldo;

    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public abstract void atualiza(double taxa); // tornando esse método abstrato a responsabilidade de implementá-lo passa para as filhas

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
