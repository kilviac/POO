package Capítulo_4;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.nome = "Danilo";
        f1.salario = 100;
        f1.departamento = "RH";
        f1.rg = "11111111111";
        f1.dataDeEntrada = new Data(10, 06, 2018);
        f1.bonifica(50);

        f1.mostra();

        Funcionario f2 = f1;

        if (f2 == f1) {
            System.out.println("\niguais");
        } else {
            System.out.println("\ndiferentes");
        }
    }
}
