package secao_2_Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        /*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
        que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
        qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
        Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
        mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

               Renda              | Imposto de Renda
        de 0.00 a R$ 2000.00      | Isento
        de 2000.01 até R$ 3000.00 | 8%
        de 3000.01 até R$ 4500.00 | 18%
        acima de R$ 4500.00       | 28%

        Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
        salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
        de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
        duas casas decimais.

        EXEMPLOS

        Entrada: 3002.00 -> Saída: R$ 80.36
        Entrada: 1701.12 -> Saída: R$ Isento
        Entrada: 4520.00 -> Saída: R$ 355.60 */

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
