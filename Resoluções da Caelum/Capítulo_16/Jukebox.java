package Capítulo_16;

import java.util.*;

public class Jukebox {
    public static void main(String[] args) {
        ComparadorPorArtista comparadorPorArtista = new ComparadorPorArtista();
        Set<Song> lista = new TreeSet<>(comparadorPorArtista);

//        Utilizando ArrayList:
//        List<Song> lista = new ArrayList<>();

        Song s1 = new Song("Want", "Taemin", "K-pop");
        Song s2 = new Song("Style", "Foster the People", "Alternative");
        Song s3 = new Song("Mary Lou", "Sonata Arctica", "Metal");
        Song s4 = new Song("Want", "Taemin", "K-pop");

        lista.add(s1);
        lista.add(s2);
        lista.add(s3);
        lista.add(s4);

//        Collections.sort(lista);
//        System.out.println(lista);
//        Collections.sort(lista, comparadorPorArtista);
//        System.out.println(lista);

        System.out.println(lista);
    }
}