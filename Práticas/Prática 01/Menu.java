import java.util.Scanner;

public class Menu {
    public void exibirMenu() {
        Calculadora c = new Calculadora();
        Scanner read = new Scanner(System.in);
        int opcao = 0;
        double a, b;
        System.out.print("Calculadora\n================\n1.Somar\n2.Subtrair\n3.Multiplicar\n4.Dividir\n5.Sair");

        while(opcao != 5) {
            System.out.print("\n\nDigite uma opção: ");
            opcao = read.nextInt();
            if (opcao == 1) {
                System.out.print("Entre com os valores: ");
                a = read.nextInt();
                b = read.nextInt();
                System.out.print("Resultado: " + c.soma(a, b));
            } if (opcao == 2) {
                System.out.print("Entre com os valores: ");
                a = read.nextInt();
                b = read.nextInt();
                System.out.print("Resultado: " + c.subtracao(a, b));
            } if (opcao == 3) {
                System.out.print("Entre com os valores: ");
                a = read.nextInt();
                b = read.nextInt();
                System.out.print("Resultado: " + c.multiplicacao(a, b));
            } if (opcao == 4) {
                System.out.print("Entre com os valores: ");
                a = read.nextInt();
                b = read.nextInt();
                System.out.print("Resultado: " + c.divisao(a, b));
            } if (opcao == 5) {
                System.out.print("Encerrando...");
                break;
            }
        }
    }
}
