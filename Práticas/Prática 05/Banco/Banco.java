import java.util.*;

public class Banco {
    private List<Conta> listaContas = null;

    public Banco() {
        listaContas = new LinkedList<>();
    }

    public boolean cadastrarConta(String titular, int numero,  double saldo){
        for (Conta c : listaContas) {
            if (c.getNumero() == numero) {
                return false;
            }
        }
        Conta temp = new Conta(titular, numero, saldo);
        listaContas.add(temp);
        return true;
    }

    public boolean removerConta(int numero) {
        for (Conta c : listaContas) {
            if (c.getNumero() == numero) {
                listaContas.remove(c);
                return true;
            }
        } return false;
    }

    public int quantContas() {
        return listaContas.size();
    }

    public void buscarConta(int numero) {
        for (Conta c : listaContas) {
            if (c.getNumero() == numero) {
                c.toString();
            }
        }
    }

    public void deposito(int numero, double quant) {
        for (Conta c : listaContas) {
            if (c.getNumero() == numero) {
                if (quant <= 0) {
                    throw new QuantiaInvalidaException("Quantia inválida!");
                } else {
                    c.setSaldo(c.getSaldo() + quant);
                }
            }
        }
    }

    public void saque(int numero, double quant) {
        for (Conta c : listaContas) {
            if (c.getNumero() == numero) {
                if (c.getSaldo() < quant) {
                    throw new SaldoInsuficienteException("Saldo insuficiente!");
                } else if (quant <= 0) {
                    throw new QuantiaInvalidaException("Quantia inválida!");
                } else {
                    c.setSaldo(c.getSaldo() - quant);
                }
            }
        }
    }

    public void saldo(int numero) {
        for (Conta c : listaContas) {
            if (c.getNumero() == numero) {
                System.out.println(c.getSaldo());
            }
        }
    }

    @Override
    public String toString() {
        return "Banco{" +
                "listaContas=" + listaContas +
                '}';
    }
}
