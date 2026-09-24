package AIntroducao;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        double salario = 70000;
        double taxa = 0;
        double salarioComTaxaAplicada = 0;

        if (salario < 34713) {
            taxa = 0.097;
            salarioComTaxaAplicada = salario *= taxa;

            System.out.println("Taxa aplicada no valor de: " + salario * taxa);
        } else if (salario < 68508) {
            taxa = 0.3735;
            salarioComTaxaAplicada = salario *= taxa;

            System.out.println("Taxa aplicada no valor de: " + salario * taxa);
        } else {
            taxa = 0.495;
            salarioComTaxaAplicada = salario *= taxa;

            System.out.println("Taxa aplicada no valor de: " + salario * taxa);
        }

        System.out.println("salario final: " + salarioComTaxaAplicada);
    }
}