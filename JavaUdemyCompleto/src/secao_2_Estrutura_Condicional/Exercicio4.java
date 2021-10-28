package secao_2_Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com a hora inicial: ");
        int horaInicial = scanner.nextInt();

        System.out.println("Entre com a hora final: ");
        int horaFinal = scanner.nextInt();

        System.out.println("O jogo durou " + " hora(s) ");


        scanner.close();
    }
}
