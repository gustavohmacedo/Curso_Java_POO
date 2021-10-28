package secao_2_Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            System.out.println("\nPositive number ");
        } else {
            System.out.println("\nNegative number ");
        }

        scanner.close();
    }
}
