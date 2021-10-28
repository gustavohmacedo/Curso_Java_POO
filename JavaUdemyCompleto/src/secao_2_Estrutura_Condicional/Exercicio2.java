package secao_2_Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("\nEven number");
        } else {
            System.out.println("\nOdd number");

        }
        scanner.close();
    }
}
