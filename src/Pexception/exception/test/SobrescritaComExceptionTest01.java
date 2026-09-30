package Pexception.exception.test;

import Pexception.exception.dominio.Funcionario;
import Pexception.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        funcionario.salvar();
    }
}
