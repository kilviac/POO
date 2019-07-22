package Capítulo_11;

public class TesteConta {
    public static void main(String[] args) {
        Conta c1 = new Conta("Kilvia", 100, 250);
        try {
//            c1.sacar(300);
            c1.sacar(250);
            System.out.println("consegui sacar!");
            c1.depositar(-10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (QuantiaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}