package Capítulo_16;

public class Banco_Teste {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Conta c1 = new Conta("Caio", 100, 1000);
        Conta c2 = new Conta("Maria", 101, 2000);
        Conta c3 = new Conta("João", 102, 3000);

        banco.adiciona(c1);
        banco.adiciona(c2);
        banco.adiciona(c3);

        System.out.println(banco.pegaQuantidadeDeContas());
    }
}
