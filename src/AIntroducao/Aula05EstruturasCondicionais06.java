package AIntroducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // utilizando switch e dado os valores de 1 a 7, imprima se é dia útil ou final
        // de semana
        // Considerando 1 como domingo

        byte dia = 2;

        switch (dia) {
            case 1:
                System.out.println("DOMINGO = Final de semana");
                break;
            case 2:
                System.out.println("SEGUNDA = Dia útil");
                break;
            case 3:
                System.out.println("TERÇA = Dia útil");
                break;
            case 4:
                System.out.println("QUARTA = Dia útil");
                break;
            case 5:
                System.out.println("QUINTA = Dia útil");
                break;
            case 6:
                System.out.println("SEXTA = Dia útil");
                break;
            case 7:
                System.out.println("SÁBADO = Final de semana");
                break;
            default:
                System.out.println(dia + " não é um dia válido.");
                break;
        }

        // mesma coisa que fazer isso aqui

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println(dia + " não é um dia válido.");
                break;
        }

        // ou fazer isso aqui

        switch (dia) {
            case 1, 7 -> System.out.println("Fim de semana");
            case 2, 3, 4, 5, 6 -> System.out.println("Dia útil");
            default -> System.out.println(dia + " não é um dia válido.");
        }
    }
}
