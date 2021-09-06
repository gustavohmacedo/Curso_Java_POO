package secao_4_Introducao_POO.exercicioThree;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Retangulo retangulo = new Retangulo(3.00, 4.00);
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Informe a Altura do Retângulo: ");
        retangulo.altura = scan.nextDouble();

        System.out.println("Infome a Base do Retângulo: ");
        retangulo.base = scan.nextDouble();

        System.out.println("\n" + retangulo.toString());
        System.out.printf("Área: %.2f m²\n", retangulo.areaDoRetangulo());
        System.out.printf("Perímetro: %.2f \n", retangulo.perimetroDoRetangulo());
        System.out.printf("Diagonal: %.2f", retangulo.DiagonalDoRetangulo());

        scan.close();

    }


}
