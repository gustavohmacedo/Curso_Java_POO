package secao_6_memoria_arrays_e_listas.vetores.exemplo1;

//Fazer um programa para ler um número inteiro N e a altura de N pessoas.
//Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas.

import java.util.Locale;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("\nInforme a quantidade de Alturas que serão armazenadas: ");
        int quantidadeAlturas = scan.nextInt();
        System.out.println();

        double[] idades = new double[quantidadeAlturas];
        double somasDasAlturas = 0d;

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Entre com a Altura " + (i + 1) + ":");
            idades[i] = scan.nextDouble();
            somasDasAlturas += idades[i];
        }

        double mediaDasAlturas = somasDasAlturas / quantidadeAlturas;
        System.out.printf("\nA média das Alturas é: %.2f ", mediaDasAlturas);
        System.out.println("\n\n");

        scan.close();


    }
}
