public class Infantil implements Categoria {
    private double preco = 3.5;

    @Override
    public double saberPreco() {
        return this.preco;
    }

    @Override
    public void mudarPreco(double preco) {
        this.preco = preco;
    }
}
