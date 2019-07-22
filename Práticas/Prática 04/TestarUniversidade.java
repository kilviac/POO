public class TestarUniversidade {
    public static void main(String[] args) {
        Professor professor = new Professor("0003", "Rua Santiago Mota, 606, Presidente Médice",
                "Renato", 35, 40);

        Gerente gerente = new Gerente("0001", "Rua João Alves de Oliveira, 107, Centro",
                "Carla", 40);

        Universidade u = new Universidade();

        u.imprimirDados(professor);
        u.imprimirDados(gerente);
    }
}
