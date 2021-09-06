package secao_4_Introducao_POO.exercicioOne.application;

import java.util.Locale;
import java.util.Scanner;
import secao_4_Introducao_POO.exercicioOne.entidades.Triangulo;

public class Programa {
    public static void main(String[] args) {

        Triangulo trianguloX, trianguloY;
        trianguloX = new Triangulo();
        trianguloY = new Triangulo();

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe as medidas do Triangulo X: ");
        trianguloX.ladoA = scan.nextDouble();
        trianguloX.ladoB = scan.nextDouble();
        trianguloX.ladoC = scan.nextDouble();
        System.out.println();

        System.out.println("Informe as medidas do Triangulo Y: ");
        trianguloY.ladoA = scan.nextDouble();
        trianguloY.ladoB = scan.nextDouble();
        trianguloY.ladoC = scan.nextDouble();
        System.out.println("\n");

        System.out.printf("Area de X = %.4f\n", trianguloX.calculaArea());

        System.out.printf("Area de Y = %.4f\n", trianguloY.calculaArea());

        if (trianguloX.calculaArea() > trianguloY.calculaArea()) {
            System.out.println("A area maior é X ");

        } else if (trianguloY.calculaArea() > trianguloX.calculaArea()) {
            System.out.println("A area maior é Y ");

        } else {
            System.out.println("Area X = Area Y");
        }

        scan.close();

    }

}
