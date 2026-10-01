package Qcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        // ele é altamente incrementável, enquanto tu vai botando coisa dentro dele
        // por debaixo dos panos faz a lógica para armazenar sem q tu precise fazer isso

        // A sintaxe diamond <> força tu colocar o tipo da variável pra n deixar botar
        // int
        // em uma lista so de String
        List<String> nomes = new ArrayList<>();// da pra aumentar o tamanho da lista, mas sempre que passar de 10 ele
                                               // aumenta 50% do tamanho
        List<String> nomes2 = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("João");
        nomes2.add("Carlos");
        nomes2.add("João");

        nomes.addAll(nomes2); // adiciona na lista de nomes todos os nomes dentro de nomes2

        // nomes.remove("Carlos"); // remove pelo objeto usando o equals
        // nomes.remove(1); // remove pelo indice

        // ele pede um Object para variavel de referencia
        // se tu definiu a List como String, tu coloca do mesmo tipo
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("-------------------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        System.out.println(nomes);

        System.out.println("-------------------");

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);

    }
}
