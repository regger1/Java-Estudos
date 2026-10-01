package Qcolecoes.test;

import java.util.ArrayList;
import java.util.List;

import Qcolecoes.dominio.Smartphone;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3); // o numero antes da var é pra manipular o indice
        // no caso o s3 vai ser o primeiro item da lista
        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("22222", "Pixel");
        System.out.println(smartphones.contains(s4));
        // contains retorna um booleano pra ver se ele está ou não na lista
    }
}
