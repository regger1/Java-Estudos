package AIntroducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprima o dia da semana considerando 1 como domingo
        byte dia = 1;

        switch (dia) {
            case (1):
                System.out.println("domingo");
                break;
            case (2):
                System.out.println("segunda-feira");
                break;
            case (3):
                System.out.println("terça-feira");
                break;
            case (4):
                System.out.println("quarta-feira");
                break;
            case (5):
                System.out.println("quinta-feira");
                break;
            case (6):
                System.out.println("sexta-feira");
                break;
            case (7):
                System.out.println("sábado");
                break;
            default:
                System.out.println("Opção inválida");
        }

        // switch case sendo usado com o tipo primitivo char, tb funciona com String mas
        // tem q usar aspas duplas ""
        char sexo = 'F';

        switch (sexo) {
            case 'M':
                System.out.println("homem");
                break;
            case 'F':
                System.out.println("mulher");
                break;
            default:
                System.out.println("Inválido");
        }
    }
}
