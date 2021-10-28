package secao_2_Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        /*
        Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
        seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o
        valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Entre com um valor qualquer para checagem de intervalo: ");
        double valor = scanner.nextDouble();

        System.out.println();
        if (valor >= 0 && valor <= 25) {
            System.out.println("Valor se encontra no intervalo: [0 - 25] ");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("Valor se encontra no intervalo: [25 - 50] ");

        } else if (valor > 50 && valor <= 75) {
            System.out.println("Valor se encontra no intervalo: [50 - 75] ");

        } else if (valor > 75 && valor <= 100) {
            System.out.println("Valor se encontra no intervalo: [75 - 100] ");

        } else {
            System.out.println("Valor inserido Fora de intervalo ");

        }

        scanner.close();
    }
}
