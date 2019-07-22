package Capítulo_5;

public class TestaEmpresa {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Danilo", "RH", "11111111111", new Data(10, 04, 2016), 2000);
        Funcionario f2 = new Funcionario("Hugo", "Financeiro", "22222222222", new Data(11, 05, 2017), 3000);
        Funcionario f3 = new Funcionario("Ana", "Administração", "33333333333", new Data(12, 06, 2018), 4000);

        Empresa empresa = new Empresa("Polar", "12345678900");
        empresa.empregados = new Funcionario[3];

        empresa.adiciona(f1);
        empresa.adiciona(f2);
        empresa.adiciona(f3);

        f2.demite();

//        empresa.mostraSalarioEmpregados();
        empresa.mostraEmpregados();
        empresa.contem(f1);
        empresa.contem(f2);
    }
}