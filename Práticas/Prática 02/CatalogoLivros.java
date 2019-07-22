import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    private List<Livro> listaDeLivros = new ArrayList<>();

    public void adicionar (String titulo, String autor, String genero) {
        Livro livro = new Livro(titulo, autor, genero);
        for (Livro l : listaDeLivros) {
            if (l.getTitulo().equals(titulo)) {
                System.out.println("Livro já cadastrado!");
                break;
            } else {
                listaDeLivros.add(livro);
                System.out.println("Livro cadastrado com sucesso!");
                break;
            }
        }
        if (listaDeLivros.size() == 0) {
            listaDeLivros.add(livro);
            System.out.println("Livro cadastrado com sucesso!");
        }
    }

    public void remover (String titulo) {
        for (Livro l : listaDeLivros) {
            if (l.getTitulo().equals(titulo)) {
                listaDeLivros.remove(l);
                System.out.println("\nLivro '" + l.getTitulo() + "' removido com sucesso!");
                break;
            } else {
                System.out.println("Não existe livro com esse nome!");
            }
        }
    }

    public void buscar(String titulo) {
        for (Livro l : listaDeLivros) {
            if (l.getTitulo().equals(titulo)) {
                System.out.println(l.toString());
            }
        }
    }

    public void listar() {
        for (Livro l : listaDeLivros) {
            System.out.println(l.toString());
        }
    }


}
