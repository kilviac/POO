package Capítulo_9;

public class ContaPoupanca extends Conta { // transformando a classe em abstrata ela pode compilar sem reescrever o método atualiza
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }
}
