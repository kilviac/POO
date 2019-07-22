public class TesteCatalogoLivros {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionar("Dom Quixote", "Miguel de Cervantes", "Aventura");
        catalogo.adicionar("O Conde de Monte Cristo", "Alexandre Dumas", "Romance");
        catalogo.adicionar("Um Conto de Duas Cidades", "Charles Dickens", "Romance");
        catalogo.adicionar("Dom Quixote", "Miguel de Cervantes", "Aventura");

        catalogo.listar();
        catalogo.remover("Dom Quixote");
        catalogo.listar();
        catalogo.buscar("O Conde de Monte Cristo");
    }
}
