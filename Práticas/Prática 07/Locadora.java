public class Locadora {
    public static void main(String[] args) {
        CD cd = new CD(1, "Thank U, Next", "Ariana Grande");
        DVD dvd = new DVD(2, "Barbie", "Infantil");
        Fita fita = new Fita(3, "Led Zeppelin IV", "Led Zeppelin");

        Lancamento lancamento = new Lancamento();
        Normal normal = new Normal();
        Infantil infantil = new Infantil();

        cd.setCategoria(lancamento);
        dvd.setCategoria(infantil);
        fita.setCategoria(normal);

        System.out.println("O preço é: " + cd.saberPreco());
        System.out.println("O preço é: " + fita.saberPreco());
        System.out.println("O preço é: " + dvd.saberPreco());

        infantil.mudarPreco(4);
        System.out.println("\nO preço é: " + dvd.saberPreco());
    }
}
