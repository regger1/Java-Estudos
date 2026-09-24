package DsobrecarcaMetodos.test;

import DsobrecarcaMetodos.dominio.Anime;

public class SobrecargaTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama drive", "TV", 12, "Ação");
        anime.imprime();
    }
}
