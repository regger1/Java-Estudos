package Gmodificadorstatic.teste;

import Gmodificadorstatic.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("bmw", 280);
        Carro carro2 = new Carro("mercedes", 275);
        Carro carro3 = new Carro("audi", 290);

        Carro.setVelocidadeLimite(180);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
