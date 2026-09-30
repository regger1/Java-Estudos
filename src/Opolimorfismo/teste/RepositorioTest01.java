package Opolimorfismo.teste;

import Opolimorfismo.repositorio.Repositorio;
import Opolimorfismo.servico.RepositorioArquivo;

public class RepositorioTest01 {
    public static void main(String[] args) {
        // A variável de referência é do tipo da interface (Repositorio),
        // mas o objeto em memória que ela referencia é do tipo da classe que implementa essa interface (RepositorioArquivo).
        Repositorio repositorio = new RepositorioArquivo();
        // daria pra dar um new RepositorioMemoria() ou new RepositorioBancoDeDados() q funcionaria igualmente
        repositorio.salvar();
    }
}
