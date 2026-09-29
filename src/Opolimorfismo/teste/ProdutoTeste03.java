package Opolimorfismo.teste;

import Opolimorfismo.dominio.Computador;
import Opolimorfismo.dominio.Produto;
import Opolimorfismo.dominio.Tomate;
import Opolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2026");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
