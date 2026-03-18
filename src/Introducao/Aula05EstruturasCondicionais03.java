package Introducao;

public class Aula05EstruturasCondicionais03 {
    static void main() {
        // doar se salario > 5000
        double salario = 6000;
        // (condicao) ? verdadeiro : falso

        String resultado = salario> 5000 ? "Eu vou doar 500 reais pra caridade" : "Ainda não tenho condições, mas vou ter!";

        System.out.println(resultado);
    }
}
