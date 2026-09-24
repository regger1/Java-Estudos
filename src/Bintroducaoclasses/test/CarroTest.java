package Bintroducaoclasses.test;

import Bintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "fuca";
        carro1.modelo = "sport";
        carro1.ano = 1950;

        carro2.nome = "uno";
        carro2.modelo = "mille";
        carro2.ano = 1980;
    }
}
