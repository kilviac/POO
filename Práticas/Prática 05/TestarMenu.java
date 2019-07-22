public class TestarMenu {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("01", "Caio", 1050);
        Menu menu = new Menu(c1);
        menu.exibirMenu();
    }
}
