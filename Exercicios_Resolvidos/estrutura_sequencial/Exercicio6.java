package exercicios_resolvidos.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        /*
         * Fazer um programa para ler o código, a quantidade comprada, e o valor
         * unitário da peça 1 e da peça 2. Em seguida, mostre o código das peças, a
         * quantidade e Calcule o valor total a ser pago por estas peças.
         * 
         */

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int codigoPecaUm = 0, codigoPecaDois = 0;
        int qtdPecaUm = 0, qtdPecaDois = 0;
        double precoPecaUm = 0.0, precoPecaDois = 0.0;
        double calc = 0.0;

        System.out.println("\n**********[Entrada de Dados Peça 1]**********");
        System.out.println("Entre com o codigo da peça 1: ");
        codigoPecaUm = leitor.nextInt();

        System.out.println("Entre com quantidade de peças 1 que será comprada: ");
        qtdPecaUm = leitor.nextInt();

        System.out.println("Entre com o preço da peça 1: ");
        precoPecaUm = leitor.nextDouble();
        System.out.println("*********************************************\n");

        System.out.println("**********[Entrada de Dados Peça 2]**********");
        System.out.println("\nEntre com o codigo da peça 2: ");
        codigoPecaDois = leitor.nextInt();

        System.out.println("Entre com quantidade de peças 2 que será comprada: ");
        qtdPecaDois = leitor.nextInt();

        System.out.println("Entre com o preço da peça 2: ");
        precoPecaDois = leitor.nextDouble();

        System.out.println("*********************************************\n");
        System.out.println("\n==================[Peça 1]===================");
        System.out.printf("Código da peça 1: %d \n", codigoPecaUm);
        System.out.printf("Quantidade de peças 1 adquiridas: %d \n", qtdPecaUm);
        System.out.printf("Preço da peça 1 R$ %.2f \n", precoPecaUm);
        System.out.println("==============================================\n");

        System.out.println("\n=================[Peça 2]====================");
        System.out.printf("Código da peça 2: %d \n", codigoPecaDois);
        System.out.printf("Quantidade de peças 2 adquiridas: %d \n", qtdPecaDois);
        System.out.printf("Preço da peça 2 R$ %.2f \n", precoPecaDois);
        System.out.println("==============================================\n");

        calc = (qtdPecaUm * precoPecaUm) + (qtdPecaDois * precoPecaDois);
        System.out.println("=================[Resultado]==================");
        System.out.printf("Valor total a pagar R$ %.2f \n", calc);
        System.out.println("==============================================\n");

        leitor.close();

    }

}
