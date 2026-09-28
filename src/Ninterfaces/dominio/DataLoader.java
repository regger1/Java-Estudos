package Ninterfaces.dominio;

// interfaces não são Classes
public interface DataLoader {
    // todos os métodos criados em uma interface são por padrão public e abstract
    void load();

    // o default tira a obrigação de implementar a função nas classes filhas
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retriveMaxDataSize() {
        System.out.println("dentro do retrieveMaxDataSize na interface");
    }
}
