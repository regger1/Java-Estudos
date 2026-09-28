package Mclassesabstratas.teste;

import Mclassesabstratas.dominio.Desenvolvedor;
import Mclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Mr. Satan", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Light Yagami", 1000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);

        desenvolvedor.imprime();
        gerente.imprime();
    }

}
