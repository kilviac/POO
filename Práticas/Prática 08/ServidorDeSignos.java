import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.util.*;

public class ServidorDeSignos implements ObjetoRemotoSignos_IF {
    private Map<String, List<String>> mapaSignos = new HashMap<>();

    public ServidorDeSignos() {
        List<String> aries = new ArrayList<>();
        aries.add("Você representa o recém-nascido do zodíaco");
        aries.add("Sua maior virtude é idealismo");

        List<String> touro = new ArrayList<>();
        touro.add("Você representa a infância do zodíaco");
        touro.add("Sua maior virtude é a persistência");

        List<String> gemeos = new ArrayList<>();
        gemeos.add("Você representa a juventude do zodíaco");
        gemeos.add("Sua maior virtude é a perspicácia");

        List<String> cancer = new ArrayList<>();
        cancer.add("Você representa o adolescente do zodíaco");
        cancer.add("Sua maior virtude é a intuição");

        List<String> leao = new ArrayList<>();
        leao.add("Você representa o jovem adulto do zodíaco");
        leao.add("Sua maior virtude é a lealdade");

        List<String> virgem = new ArrayList<>();
        virgem.add("Você representa o organizador do zodíaco");
        virgem.add("Sua maior virtude é ser serviçal diante dos outros");

        List<String> libra = new ArrayList<>();
        libra.add("Você representa o resto da humanidade");
        libra.add("Sua maior virtude é a integridade");

        List<String> escorpiao = new ArrayList<>();
        escorpiao.add("Você representa o ocultista do zodíaco");
        escorpiao.add("Sua maior virtude é ser leal");

        List<String> sagitario = new ArrayList<>();
        sagitario.add("Você representa o guia filosófico do zodíaco");
        sagitario.add("Sua maior virtude é a sabedoria");

        List<String> capricornio = new ArrayList<>();
        capricornio.add("Você representa o ancião do zodíaco");
        capricornio.add("Sua maior virtude é a disciplina");

        List<String> aquario = new ArrayList<>();
        aquario.add("Você representa o rebelde do zodíaco");
        aquario.add("Sua maior virtude é ser engenhoso");

        List<String> peixes = new ArrayList<>();
        peixes.add("Você representa o ilusionista do zodíaco");
        peixes.add("Sua maior virtude é a sensibilidade");

        mapaSignos.put("Aries", aries);
        mapaSignos.put("Touro", touro);
        mapaSignos.put("Gêmeos", gemeos);
        mapaSignos.put("Câncer", cancer);
        mapaSignos.put("Leão", leao);
        mapaSignos.put("Virgem", virgem);
        mapaSignos.put("Libra", libra);
        mapaSignos.put("Escorpião", escorpiao);
        mapaSignos.put("Sagitário", sagitario);
        mapaSignos.put("Capricórnio", capricornio);
        mapaSignos.put("Aquário", aquario);
        mapaSignos.put("Peixes", peixes);
    }

    @Override
    public String getMensagemSigno(String umSigno) throws RemoteException {
        Random random = new Random();
        int numero = random.nextInt(2);
        int i = 0;
        String[] aux= new String[2];

        if(!mapaSignos.containsKey(umSigno)) {
            return "Signo não foi encontrado!";
        }

        for(String a: mapaSignos.get(umSigno)) {
            aux[i] = a;
            i++;
        }

        return aux[numero];
    }

    public static void main(String args[]) {
        try {
            ServidorDeSignos obj = new ServidorDeSignos();
            ObjetoRemotoSignos_IF stub = (ObjetoRemotoSignos_IF) UnicastRemoteObject.exportObject(obj, 1099);

            System.setProperty("java.rmi.server.hostname", "192.168.0.101");
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("mensagem", stub);

            System.err.println("Servidor pronto...");
        } catch (Exception e) {
            System.err.println ("Erro no servidor: " + e.toString());
            e.printStackTrace();
        }
    }
}
