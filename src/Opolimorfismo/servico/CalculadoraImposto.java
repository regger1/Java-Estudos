package Opolimorfismo.servico;

import Opolimorfismo.dominio.Produto;
import Opolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto " + produto.getNome());
        System.out.println("Preço " + produto.getValor());
        System.out.println("Imposto à ser pago " + imposto);
        if (produto instanceof Tomate) {
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
            // isso é um cast, ele vai pegar um atributo mais específico da classe Tomate
            // (getDataValidade())
        }
    }
}
