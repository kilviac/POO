package Capítulo_3;

public class Exercicio6 {
    public static void main(String[] args) {
        int a = 1;

        for (int b=0; b<=100; b = a-b) {
            System.out.print(" " + b);
            a = a+b;
        }
    }
}