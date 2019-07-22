package Capítulo_3;

public class Exercicio5 {
    public static void main(String[] args) {
        long fat = 1; // trocando int por long

        for (int n=1; n<=30; n++) {
            while (n >= 2) {
                fat = fat * n;
                break;
            }
            System.out.println("O fatorial de " + n + " é (" + (n-1) + "!) * " + n + " = " + fat);

            // Começa a sair respostas erradas a partir do fatorial de 17, pois vai passar da faixa de valores que o tipo int alcança
            // Começa a sair respostas erradas a partir do fatorial de 21
        }
    }
}