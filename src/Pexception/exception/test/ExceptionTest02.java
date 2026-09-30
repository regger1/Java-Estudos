package Pexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    // qnd o metodo é privado é preferível utilizar try-catch

    // qnd o metodo é público é preferível utilizar o throw no prórpio metodo, pq tu
    // n sabe qm q vai chamar ele
    private static void criarNovoArquivo() throws IOException {
        File file = new File("Java-Estudos/arquivo/teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
