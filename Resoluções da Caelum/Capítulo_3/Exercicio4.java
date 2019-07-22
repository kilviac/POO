package Capítulo_3;

public class Exercicio4 {
    public static void main(String[] args) {
        int fat = 1;

        for (int n=1; n<=10; n++) {
            while (n >= 2) {
                fat = fat * n;
                break;
            }
            System.out.println("O fatorial de " + n + " é (" + (n-1) + "!) * " + n + " = " + fat);
        }
    }
}