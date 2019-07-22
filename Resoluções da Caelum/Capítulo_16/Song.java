package Capítulo_16;

public class Song implements Comparable<Song>{
    private String nome, artista, genero;

    public Song(String nome, String artista, String genero) {
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
    }

    public String getNome() {
        return this.nome;
    }

    public String getArtista() {
        return this.artista;
    }

    public String getGenero() {
        return this.genero;
    }

    public String toString() {
        return "\nNome: " + getNome() + "; Artista: " + getArtista() + "; Gênero: " + getGenero();
    }

    public int compareTo(Song s) {
        return this.getNome().compareTo(s.getNome());
    }

    public int hashCode() {
        return this.getNome().hashCode();
    }

    public boolean equals(Song s) {
        return this.getNome().equals(s.getNome());
    }
}