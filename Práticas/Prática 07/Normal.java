public class Normal implements Categoria {
    private double preco = 5;

    @Override
    public double saberPreco() {
        return this.preco;
    }

    @Override
    public void mudarPreco(double preco) {
        this.preco = preco;
    }
}
