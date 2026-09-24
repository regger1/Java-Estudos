package Econstrutores.test;

import Econstrutores.dominio.Anime;

public class SobrecargaTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação", "Production IG");
        anime.imprime();
    }
}
