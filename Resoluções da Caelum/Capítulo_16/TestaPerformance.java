package Capítulo_16;

import java.util.*;

public class TestaPerformance {
    public static void main(String[] args) {
//        List<Integer> teste = new ArrayList<>();
        Set<Integer> teste = new HashSet<>();
        long inicio = System.currentTimeMillis();

        System.out.println("Iniciando...");

        for (int i=0; i<=30000; i++) {
            teste.add(i);
        }

        for (int i = 0; i<=30000; i++) {
            teste.contains(i);
        }

        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto: " + tempo);
        // tempo gasto com ArrayList: 0.335s
        // tempo gasto com HashSet: 0.015s
    }
}