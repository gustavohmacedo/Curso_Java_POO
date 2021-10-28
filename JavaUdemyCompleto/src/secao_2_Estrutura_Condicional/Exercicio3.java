package secao_2_Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
       /* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos"
        ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
         Atenção: os números podem ser digitados em ordem crescente ou decrescente.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o valor de A: ");
        int a = scanner.nextInt();

        System.out.println("Entre com o valor de B: ");
        int b = scanner.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("\nSao multiplos ");

        } else {
            System.out.println("\nNao sao multiplos ");
        }

        scanner.close();
    }
}
