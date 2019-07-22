package Capítulo_17;

public class Programa implements Runnable {
    private int id;
    @Override
    public void run() {
        for (int i = 0; i<=10000; i++) {
            System.out.println("Programa " + getId() + " valor: " + i);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
