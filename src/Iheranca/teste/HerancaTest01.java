package Iheranca.teste;

import Iheranca.dominio.Endereco;
import Iheranca.dominio.Funcionario;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("012345-209");
        endereco.setRua("Rio das Antas");
        Funcionario funcionario = new Funcionario("Carlos");
        funcionario.setCpf("123.456.789-10");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        System.out.println("-------------");
        funcionario.imprime();
    }

}
