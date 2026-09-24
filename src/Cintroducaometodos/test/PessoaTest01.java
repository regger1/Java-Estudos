package Cintroducaometodos.test;

import Cintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao");
        pessoa.setIdade(-1);

        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getNome());
    }
}
