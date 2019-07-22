package Capítulo_4;

public class Data {
    int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String formatada() {
        return (this.dia + "/" + this.mes + "/" + this.ano);
    }
}