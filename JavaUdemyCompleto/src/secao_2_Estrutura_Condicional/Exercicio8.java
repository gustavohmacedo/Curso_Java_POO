package secao_2_Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        final double salarioLimiteIsento = 2000.00;
        double salario;
        double descontoFinal;
        double descontoImpostoDeRenda1;
        double descontoImpostoDeRenda2;
        double descontoImpostoDeRenda3;

        System.out.println();
        System.out.println("Entre com o seu Salário: ");
        salario = scanner.nextDouble();

        if (salario <= salarioLimiteIsento) {
            System.out.println();
            System.out.printf("O salário informado foi de R$ %.2f \n", salario);
            System.out.println("Portanto, está isento de Imposto de Renda. ");

        } else if (salario >= 2000.01 && salario <= 3000.00) {
            descontoImpostoDeRenda1 = salario - salarioLimiteIsento * 0.08;// imposto 8% até 3000.00
            System.out.println();
            System.out.printf("O salário informado foi de R$ %.2f \n", salario);
            System.out.printf("O desconto será de R$ %.2f", descontoImpostoDeRenda1);

        } else if (salario >= 3000.01 && salario <= 4500.00) {
            descontoImpostoDeRenda1 = 1000.00 * 0.08; // imposto 8% até 3000.00
            descontoImpostoDeRenda2 = (salario - salarioLimiteIsento - 1000.00) * 0.18;//imposto 18% até 4500.00
            descontoFinal = descontoImpostoDeRenda1 + descontoImpostoDeRenda2;
            System.out.println();
            System.out.printf("O salário informado foi de R$ %.2f \n", salario);
            System.out.printf("O desconto será de R$ %.2f", descontoFinal);

        } else {
            descontoImpostoDeRenda1 = 1000.00 * 0.08; // imposto 8% até 3000.00
            descontoImpostoDeRenda2 = 1500 * 0.18; // imposto 18% até 4500.00
            descontoImpostoDeRenda3 = (salario - 4500.00) * 0.28; // imposto 28% > 4500.00
            descontoFinal = descontoImpostoDeRenda1 + descontoImpostoDeRenda2 + descontoImpostoDeRenda3;
            System.out.println();
            System.out.printf("O salário informado foi de R$ %.2f \n", salario);
            System.out.printf("O desconto será de R$ %.2f", descontoFinal);


        }
        scanner.close();

    }
}
