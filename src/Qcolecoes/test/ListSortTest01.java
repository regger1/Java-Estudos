package Qcolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on Titan");
        mangas.add("Berserk");
        mangas.add("Hunter x Hunter");
        mangas.add("Hellsing");
        mangas.add("Pokemon");
        mangas.add("Dragon ball");

        Collections.sort(mangas); // para String ele organiza em ordem alfabética

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);
        Collections.sort(dinheiros);
        // se for com números ele organiza do maior pro menor

        for (String manga : mangas) {
            System.out.println(manga);
        }
        for (Double double1 : dinheiros) {
            System.out.println(double1);
        }
    }
}
