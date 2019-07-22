package Capítulo_16;

import java.util.*;

public class Banco {
    List<Conta> contas = new LinkedList<>();

    public void adiciona(Conta c) {
        contas.add(c);
    }

    public Conta pega(int x) {
        return contas.get(x);
    }

    public int pegaQuantidadeDeContas() {
        return contas.size();
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
