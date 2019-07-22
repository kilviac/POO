public class Livro {
    private String titulo, autor, genero;

    public Livro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "\nTítulo: " + this.getTitulo() + "\nAutor: " + this.autor + "\nGênero: " + this.genero;
    }
}
