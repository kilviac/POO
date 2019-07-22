import java.util.Scanner;

public class Menu {
    private ContaCorrente conta;
    double quantia;

    public Menu(ContaCorrente conta) {
        this.conta = conta;
    }

    public void exibirMenu(){
        Scanner read = new Scanner(System.in);
        int opcao = 0;
        System.out.println("--- Projeto Conta Corrente ---\n1. Saque\n2. Depósito\n3. Saldo\n4. Extrato\n5. SAIR\n------------------------------");

        while(opcao != 5){
            System.out.print("\nDigite uma opção: ");
            opcao = read.nextInt();

            if (opcao == 1) {
                System.out.print("Entre com a quantia a ser depositada: ");
                quantia = read.nextInt();
                if (quantia > 0) {
                    conta.deposito(quantia);
                    System.out.println("Depósito feito com sucesso!");
                } if (quantia > conta.getSaldo()) {
                    throw new SaldoInsuficienteException("Saldo insuficiente!");
                } else if (quantia < 0) {
                    throw new QuantiaNegativaException("Quantia negativa!");
                } else {
                    throw new EntradaInvalidaException("Entrada inválida!");
                }
            }

            if (opcao == 2) {
                System.out.print("Entre com a quantia a ser sacada: ");
                quantia = read.nextInt();
                if (quantia > 0 && quantia <= conta.getSaldo()) {
                    conta.saque(quantia);
                    System.out.println("Saque feito com sucesso!");
                } else if (quantia > 0) {
                    throw new QuantiaNegativaException("Quantia negativa!");
                } else {
                    throw new EntradaInvalidaException("Entrada inválida!");
                }
            }

            if (opcao == 3) {
                System.out.println("Saldo: R$" + conta.getSaldo());
            }

            if (opcao == 4) {
                System.out.println("\n--- Extrato ---");
                conta.extrato();
            }

            if (opcao == 5) {
                System.out.println("Encerrando...");
            }
        }
    }
}
