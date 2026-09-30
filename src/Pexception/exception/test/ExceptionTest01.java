package Pexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("Java-Estudos/arquivo/teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo Criado: " + isCriado);
        } catch (IOException e) {
            // nao deixar o bloco em branco pq ignora a exceção e tu n vai conseguir tratar
            e.printStackTrace();// aqui ele vai imprimir tudo oq aconteceu na stack

        }
    }
}
