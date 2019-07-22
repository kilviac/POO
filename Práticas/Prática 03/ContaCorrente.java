import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    private String numero, titular;
    private double saldo;
    private List<String> movimentacoes = new ArrayList<>();

    public ContaCorrente(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void deposito(double quantia) {
        setSaldo(getSaldo() + quantia);
        movimentacoes.add("Depósito: R$" + (quantia));
    }

    public void saque(double quantia) {
        setSaldo(getSaldo() - quantia);
        movimentacoes.add("Saque: R$" + (quantia));
    }

    public void extrato() {
        for (String str : movimentacoes) {
            System.out.println(str);
        } System.out.println("\n");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
