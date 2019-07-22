package Capítulo_16;

import java.util.*;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {
    public static void main(String[] args) {
//        List<Integer> teste = new ArrayList<>();
        List<Integer> teste = new ArrayList<>();
        long inicio = System.currentTimeMillis();

        System.out.println("Iniciando...");

        for (int i = 0; i < 30000; i++) {
            teste.add(0, i);
        }

        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto: " + tempo);
        // tempo gasto com LinkedList: 0.003s
        // tempo gasto com ArrayList: 0.046s
    }
}