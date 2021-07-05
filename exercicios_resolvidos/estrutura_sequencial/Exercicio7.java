package exercicios_resolvidos.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        // Fazer um programa que leia três valores com ponto flutuante de dupla
        // precisão: A, B e C.
        // Em seguida, calcule e mostre:
        // a) a área do triângulo retângulo que tem A por base e C por altura.
        // b) a área do círculo de raio C. (pi = 3.14159)
        // c) a área do trapézio que tem A e B por bases e C por altura.
        // d) a área do quadrado que tem lado B.
        // e) a área do retângulo que tem lados A e B.

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double a, b, c;
        final double PI = 3.14159;

        System.out.println("Entre com os valores A, B e C das figuras geometricas: ");
        System.out.print("A: ");
        a = scan.nextDouble();

        System.out.print("B: ");
        b = scan.nextDouble();

        System.out.print("C: ");
        c = scan.nextDouble();
        System.out.println("\n[ Resultado ]\n");

        double areaTriangulo = (a * c) / 2.0;
        double areaDoCirculo = PI * Math.pow(c, 2);
        double areaDoTrapezio = ((a + b) * c) / 2.0;
        double areaDoQuadrado = Math.pow(b, 2);
        double areaDoRetangulo = a * b;

        System.out.printf("Area do Triangulo: %.3f m²\n", areaTriangulo);
        System.out.printf("Area do Circulo: %.3f m²\n", areaDoCirculo);
        System.out.printf("Area do Trapezio: %.3f m²\n", areaDoTrapezio);
        System.out.printf("Area do Quadrado: %.3f m²\n", areaDoQuadrado);
        System.out.printf("Area do Retangulo: %.3f m²\n", areaDoRetangulo);
        System.out.println("\n\n");

        scan.close();

    }

}
