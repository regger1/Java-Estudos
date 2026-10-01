package Qcolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Qcolecoes.dominio.Manga;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Attack on Titan", 19.9));
        mangas.add(new Manga(4L, "Berserk", 20.5));
        mangas.add(new Manga(1L, "Hunter x Hunter", 27.0));
        mangas.add(new Manga(2L, "Hellsing", 23.5));
        mangas.add(new Manga(6L, "Pokemon", 19.9));
        mangas.add(new Manga(7L, "Dragon ball", 30.0));

        // Collections.sort(mangas);
        mangas.sort(new MangaByIdComparator());

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(7L, "Dragon ball", 30.0);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
    }
}
