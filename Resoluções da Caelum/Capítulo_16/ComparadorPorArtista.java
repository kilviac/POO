package Capítulo_16;

import java.util.*;

public class ComparadorPorArtista implements Comparator<Song> {
    public int compare(Song s1, Song s2) {
        return s1.getArtista().compareTo(s2.getArtista()); // Poderia ser qualquer atributo!

//        Decrescente:
//        return s2.getArtista().compareTo(s1.getArtista());
    }
}