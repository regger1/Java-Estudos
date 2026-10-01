package Qcolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Qcolecoes.dominio.Manga;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Attack on Titan", 19.9));
        mangas.add(new Manga(4L, "Berserk", 20.5));
        mangas.add(new Manga(1L, "Hunter x Hunter", 27.0));
        mangas.add(new Manga(2L, "Hellsing", 23.5));
        mangas.add(new Manga(6L, "Pokemon", 19.9));
        mangas.add(new Manga(7L, "Dragon ball", 30.0));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("---------------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas, new MangaByIdComparator());
        System.out.println("---------------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
