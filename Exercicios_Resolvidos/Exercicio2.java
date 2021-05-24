package Exercicios_Resolvidos;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        /*
         * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
         * soma desses números com uma mensagem explicativa.
         * 
         * 
         */
        int number1, number2, soma = 0;
        Scanner calc = new Scanner(System.in);

        System.out.println("Enter number 1:");
        number1 = calc.nextInt();

        System.out.println("Enter number 2:");
        number2 = calc.nextInt();

        soma = number1 + number2;

        System.out.println();
        System.out.printf("%d + %d = %d", number1, number2, soma);

        calc.close();
    }
}
