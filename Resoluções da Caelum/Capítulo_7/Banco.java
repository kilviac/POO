package Capítulo_7;

public class Banco {
    private Conta[] contas = new Conta[3];
    private static int cont = 0;

    public void adiciona(Conta c) {
        if (cont < contas.length) {
            this.contas[cont] = c;
            cont++;
        }
    }

    public Conta pegaConta(int x) {
        return contas[x];
    }

    public int pegaTotalDeContas(){
        return this.cont;
    }
}