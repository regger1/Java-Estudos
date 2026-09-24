package Atividades.arrays;

public class Atividade01Arrays01 {
    public static void main(String[] args) {
        /*
         * // crie uma variavel inventário contendo os itens básicos "espada", "escudo"
         * e "capacete"
         * // imprima todos os itens do array
         * 
         * String[] inventario = new String[] { "espada", "escudo", "capacete" };
         * for (String string : inventario) {
         * System.out.println(string);
         * }
         * 
         * 
         * -----------------------------------atv2--------------------------------------
         * 
         * // crie um laço de repetição e qnd chegar no escudo imprimir uma frase no
         * // terminal
         * 
         * String[] inventario = new String[] { "Espada", "Escudo", "Capacete" };
         * for (String string : inventario) {
         * if (string.equals("Escudo")) {
         * System.out.println(string + " encontrado! Defesa ativada.");
         * }
         * }
         * -----------------------------------atv3--------------------------------------
         * 
         * 
         * // criar o array inventario com 5 espaços
         * // adicionar a espada escudo e capacete e deixar os outros vazios
         * // imprimir os itens e se for nulo imprimir "[Espaço Vazio]"
         * ------
         * String[] inventario = new String[5];
         * inventario[0] = "Espada";
         * inventario[1] = "Escudo";
         * inventario[2] = "Capacete";
         * 
         * for (String string : inventario) {
         * if (string != null) {
         * System.out.println(string);
         * } else { if (string != null) {
         * System.out.println(string);
         * } else {
         * System.out.println("[Espaço Vazio]");
         * }
         * System.out.println("[Espaço Vazio]");
         * }inventario
         * }
         * -----------------------------------atv4--------------------------------------
         * // criar o array inventario com 5 espaços
         * // adicionar a espada escudo e capacete e deixar os outros vazios
         * // quando percorrer o for tem que preencher o primeiro espaço vazio com
         * "Poção
         * // de vida"
         * String[] inventario = new String[5];
         * inventario[0] = "Espada";
         * inventario[1] = "Escudo";
         * inventario[2] = "Capacete";
         * 
         * for (int i = 0; i < inventario.length; i++) {
         * 
         * if (inventario[i] != null) {
         * continue;
         * } else {
         * inventario[i] = "Poção de vida";
         * break;
         * }
         * }
         * for (String string : inventario) {
         * System.out.println(string);
         * }
         *
         * -----------------------------------atv5--------------------------------------
         *
         * // faça um loop ate achar o escudo e retire do inventário
         * // dps imprima o inventario
         * 
         * String[] inventario = new String[5];
         * inventario[0] = "Espada";
         * inventario[1] = "Escudo";
         * inventario[2] = "Capacete";
         * inventario[3] = "Poção de Vida";
         * 
         * for (int i = 0; i < inventario.length; i++) {
         * if (inventario[i] != null && inventario[i].equals("Escudo")) {
         * inventario[i] = null;
         * break;
         * }
         * }
         * for (String string : inventario) {
         * System.out.println(string);
         * }
         * -----------------------------------atv6--------------------------------------
         * // troque as posições da espada com o capacete
         * 
         * String[] inventario = new String[5];
         * inventario[0] = "Espada";
         * inventario[2] = "Capacete";
         * inventario[3] = "Poção de Vida";
         * 
         * String maoDoPersonagem;
         * 
         * maoDoPersonagem = inventario[0];
         * inventario[0] = inventario[2];
         * inventario[2] = maoDoPersonagem;
         * for (String string : inventario) {
         * System.out.println(string);
         * }
         * 
         * -----------------------------------atv7--------------------------------------
         * 
         * String[] inventario = new String[5];
         * inventario[0] = "Capacete";
         * inventario[1] = "Poção de Vida";
         * inventario[2] = "Espada";
         * inventario[3] = "Poção de Vida";
         * 
         * int contador = 0;
         * for (String string : inventario) {
         * if (string != null && string.equals("Poção de Vida")) {
         * contador++;
         * }
         * }
         * System.out.println("você tem " + contador + " Poções de Vida.");
         * 
         * -----------------------------------atv8--------------------------------------
         * 
         * 
         * // organize o array pra não ter buracos no inventário
         * String[] inventario = new String[5];
         * inventario[0] = "Capacete";
         * inventario[1] = null;
         * inventario[2] = "Espada";
         * inventario[3] = null;
         * inventario[4] = "Poção de Vida";
         * 
         * String[] novaMochila = new String[5];
         * int novoEspacoMochila = 0;
         * 
         * for (String string : inventario) {
         * if (string != null) {
         * novaMochila[novoEspacoMochila] = string;
         * novoEspacoMochila++;
         * }
         * }
         * for (String string : novaMochila) {
         * System.out.println(string);
         * }
         * 
         * -----------------------------------atv8--------------------------------------
         * 
         * 
         */
        String[] bau = new String[] { "Arco", "Flechas", "Ouro" };
        String[] inventario = new String[5];
        inventario[0] = "Capacete";
        inventario[1] = "Espada";
        inventario[2] = "Poção de Vida";

        int contador = -1;
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == null && contador < bau.length - 1) {
                contador++;
                inventario[i] = bau[contador];
            }
            System.out.println(inventario[i]);
        }

    }
}
