public class DVD extends Midia {
    private String genero;

    public DVD(int codigo, String nome, String genero) {
        super(codigo, nome);
        this.genero = genero;
    }
}
