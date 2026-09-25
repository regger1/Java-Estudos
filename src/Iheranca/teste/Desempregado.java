package Iheranca.teste;

import Iheranca.dominio.Endereco;
import Iheranca.dominio.Pessoa;

public class Desempregado {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("12312312");
        endereco.setRua("Rua dos bobo");
        Pessoa pessoa = new Pessoa("joao bobão");
        pessoa.setCpf("321.654.978-01");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

    }
}
