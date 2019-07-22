package Capítulo_6;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Danilo", "RH", "11111111111", new Data(10, 04, 2016), 2000);
        Funcionario f2 = new Funcionario("Hugo", "Financeiro", "22222222222", new Data(11, 05, 2017), 3000);
        Funcionario f3 = new Funcionario();

        f3.setNome("Ana");
        f3.setDataDeEntrada( new Data(12, 6, 2018));

        f1.demite();
        System.out.println(f2.mostra());
        System.out.println(f3.mostra());
    }
}