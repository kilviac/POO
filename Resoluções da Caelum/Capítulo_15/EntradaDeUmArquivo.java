package Capítulo_15;

import java.io.*;
import java.util.*;

public class EntradaDeUmArquivo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("arquivo_2.txt")));
        String linha = br.readLine();

        while (linha != null){
            System.out.print(linha);
            bw.write(linha);
        }

        br.close();
        bw.close();
    }
}
