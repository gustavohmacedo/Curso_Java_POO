import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        /*
         * EXERCÍCIO 4: Fazer um programa para ler quatro valores inteiros A, B, C e D.
         * A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C
         * e D segundo a fórmula: DIFERENCA = (A * B - C * D).
         */

        int a, b, c, d;
        int ResultDiferenca;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        a = scanner.nextInt();

        System.out.print("Informe o valor de B: ");
        b = scanner.nextInt();

        System.out.print("Informe o valor de C: ");
        c = scanner.nextInt();

        System.out.print("Informe o valor de D: ");
        d = scanner.nextInt();

        ResultDiferenca = ((a * b) - (c * d));

        System.out.printf("A diferença entre os produtos é: %d", ResultDiferenca);

        scanner.close();

    }
}
