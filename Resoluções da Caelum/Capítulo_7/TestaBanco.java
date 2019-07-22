package Capítulo_7;

public class TestaBanco {
    public static void main(String[] args) {
        Banco b = new Banco();
        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        b.adiciona(c);
        b.adiciona(cc);
        b.adiciona(cp);

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);

        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);

        System.out.println("\nSaldo Total: " + adc.getSaldoTotal());
        System.out.println("Total de contas: " + b.pegaTotalDeContas());

        System.out.println(b.pegaConta(2));
    }
}