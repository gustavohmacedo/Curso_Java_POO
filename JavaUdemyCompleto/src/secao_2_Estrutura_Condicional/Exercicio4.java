package secao_2_Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

        Scanner scanner = new Scanner(System.in);
        int horaInicial, horaFinal, duracaoDoJogo;
        final int RELOGIO = 24;

        System.out.println();
        System.out.println("Entre com a hora inicial do Jogo: ");
        horaInicial = scanner.nextInt();

        System.out.println("Entre com a hora final do Jogo: ");
        horaFinal = scanner.nextInt();

        if (horaInicial >= horaFinal) {
            duracaoDoJogo = (RELOGIO - horaInicial) + horaFinal;
            System.out.println("\nO jogo durou " + duracaoDoJogo + " hora(s) ");

        } else {
            duracaoDoJogo = horaFinal - horaInicial;
            System.out.println("\nO jogo durou " + duracaoDoJogo + " hora(s) ");
        }


        scanner.close();
    }
}
