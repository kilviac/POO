package Capítulo_10;

public class ContaCorrente implements Conta {
    private double saldo;

    @Override
    public void deposita(double valor) {
        this.saldo += valor;
    }

    @Override
    public void saca(double valor) {
        this.saldo -= valor;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
}
