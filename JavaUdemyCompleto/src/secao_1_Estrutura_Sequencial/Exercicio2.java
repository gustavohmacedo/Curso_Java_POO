package secao_1_Estrutura_Sequencial;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {
    public static void main(String[] args) {


        /*  EXERCÍCIO 2: Faça um programa para ler o valor do raio de um círculo, e
          depois mostrar o valor da área deste círculo com quatro casas decimais.
          Fórmula da área: Área = (π . raio²), onde o valor de π = 3.14159
         */

        final double PI = 3.14159;
        double raioDoCiculo;
        double areaDoCirculo;

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio do Círculo: ");
        raioDoCiculo = scanner.nextDouble();

        areaDoCirculo = PI * (Math.pow(raioDoCiculo, 2));

        System.out.printf("Área = %.4f ", areaDoCirculo);

        scanner.close();

    }
}
