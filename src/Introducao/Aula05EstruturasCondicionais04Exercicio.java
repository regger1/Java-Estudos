package Introducao;

public class Aula05EstruturasCondicionais04Exercicio {
    static void main() {
        double salario = 70000;

        double taxa1 = 0.097;
        double taxa2 = 0.3735;
        double taxa3 = 0.495;
        double taxaEmEuros = 0;

        if (salario < 34713) {
            taxaEmEuros = salario * taxa1;
            salario -= taxaEmEuros;
            System.out.println("A taxa é de 9.7%");
        } else if (salario >= 34713 && salario < 68508) {
            taxaEmEuros = salario * taxa2;
            salario -= taxaEmEuros;
            System.out.println("A taxa é de 37.35%");
        } else {
            taxaEmEuros = salario * taxa3;
            salario -= taxaEmEuros;
            System.out.println("A taxa é de 49.5%");
        }
        System.out.println("A taxa sobre o seu salário é de " + taxaEmEuros);
        System.out.println("Seu salario liquido é de " + salario);

    }
}
