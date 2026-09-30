package Pexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreconexao();
    }

    private static String abreconexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // esse bloco SEMPRE será executado
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    private static void abreconexao2() {
        try {
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevendo dados no Arquivo");
            throw new RuntimeException();
        } finally {
            // esse bloco SEMPRE será executado
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
