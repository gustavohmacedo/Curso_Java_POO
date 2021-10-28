package secao_2_Estrutura_Condicional;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
      /*  Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um
        plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos
        cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”.
        Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.*/

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Informe as coordenadas do plano cartesiano (X, Y) \n");
        System.out.println("Informe o ponto X: ");
        double x = scanner.nextDouble();

        System.out.println("Informe o ponto Y: ");
        double y = scanner.nextDouble();

        System.out.println();
        if (x > 0 && y > 0.0) {
            System.out.println("Ponto se encontra no 1º Quadrante ");

        } else if (x < 0 && y > 0.0) {
            System.out.println("Ponto se encontra no 2º Quadrante ");

        } else if (x < 0 && y < 0.0) {
            System.out.println("Ponto se encontra no 3º Quadrante ");

        } else if (x > 0 && y < 0.0) {
            System.out.println("Ponto se encontra no 4º Quadrante ");

        } else if (x == 0.0 && y == 0.0) {
            System.out.println("Ponto se encontra na Origem ");

        } else if ((x < 0.0 || x > 0.0) && y == 0.0) {
            System.out.println("Ponto se encontra no Eixo X ");

        } else if (x == 0 && (y > 0.0 || y < 0.0)) {
            System.out.println("Ponto se encontra no Eixo Y ");

        }


        scanner.close();

    }


}
