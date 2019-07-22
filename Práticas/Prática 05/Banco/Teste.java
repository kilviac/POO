public class Teste {
    public static void main (String[] args){
        Banco bb = new Banco();

        bb.cadastrarConta("Kilvia", 111, -10);

        System.out.println(bb.toString());

    }

}
