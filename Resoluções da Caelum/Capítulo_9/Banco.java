package Capítulo_9;

public class Banco {
    private Conta[] contas = new Conta[3]; /* podemos fazer isso porque o ‘new' no caso do Array não cria uma instância de Conta,
                                           cria um Array que pode conter Contas, onde Conta pode ser uma instância de quaquer classe
                                           concreta que instancie Conta. */
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