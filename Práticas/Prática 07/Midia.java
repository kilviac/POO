public abstract class Midia {
    private Categoria cat;
    private String nome;
    private int codigo;

    public Midia(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void setCategoria(Categoria cat) {
        this.cat = cat;
    }

    public double saberPreco() {
        return this.cat.saberPreco();
    }
}
