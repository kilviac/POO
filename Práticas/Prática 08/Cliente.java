import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
    public static void main(String[] args) {
        String host = (args.length < 1) ? "localhost" : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            ObjetoRemotoSignos_IF stub = (ObjetoRemotoSignos_IF) registry.lookup("mensagem");
            String resposta = stub.getMensagemSigno("Capricórnio");
            System.out.println("resposta: " + resposta);
        } catch (Exception e) {
            System.err.println("Cliente exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
