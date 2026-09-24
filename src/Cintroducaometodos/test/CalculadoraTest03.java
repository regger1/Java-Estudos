package Cintroducaometodos.test;

import Cintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(10, 2);
        System.out.println(resultado);
        System.out.println("\n ----------------------");
        calculadora.imprimeDivisaoDoisNumeros02(20, 2);
    }
}
