package Cintroducaometodos.test;

import Cintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Makoto");
        funcionario.setIdade(18);
        funcionario.setSalarios(new double[] { 1200, 987.32, 2000 });

        funcionario.imprimeDados();
    }
}
