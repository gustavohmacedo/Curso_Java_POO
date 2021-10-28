package secao_2_Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /*
        Com base na tabela abaixo, escreva um programa que leia o código de um item e a sua quantidade deste.
        A seguir, calcule e mostre o valor da conta a pagar.

        Código | Especificação   | Preço
          1    | Cachorro-Quente | 4.00
          2    |    X-Salada     | 4.50
          3    |    X-Bacon      | 5.00
          4    | Torrada simples | 2.00
          5    |   Refrigerante  | 1.50
          */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o codigo do produto: ");
        int codigoProduto = scanner.nextInt();

        System.out.println("Entre com a quantidade do produto: ");
        int quantidadeProduto = scanner.nextInt();

        double calculo = 0.0;

        System.out.println();
        switch (codigoProduto) {

            case 1:
                calculo = 4.00 * quantidadeProduto;
                System.out.printf("Total: R$ %.2f", calculo);
                break;
            case 2:
                calculo = 4.50 * quantidadeProduto;
                System.out.printf("Total: R$ %.2f", calculo);
                break;

            case 3:
                calculo = 5.00 * quantidadeProduto;
                System.out.printf("Total: R$ %.2f", calculo);
                break;

            case 4:
                calculo = 2.00 * quantidadeProduto;
                System.out.printf("Total: R$ %.2f", calculo);
                break;

            case 5:
                calculo = 1.50 * quantidadeProduto;
                System.out.printf("Total: R$ %.2f", calculo);
                break;

            default:
                System.out.println("Erro! Código do pruduto inserido não existe ");

        }

        scanner.close();

    }
}
