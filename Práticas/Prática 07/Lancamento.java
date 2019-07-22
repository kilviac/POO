public class Lancamento implements Categoria{
    private double preco = 10;

    @Override
    public double saberPreco() {
        return this.preco;
    }

    @Override
    public void mudarPreco(double preco) {
        this.preco = preco;
    }
}
