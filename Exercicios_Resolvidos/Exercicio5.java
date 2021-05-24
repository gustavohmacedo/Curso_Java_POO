package Exercicios_Resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /*
         * Fazer um programa que leia o número de um funcionário, a quantidade de horas
         * trabalhadas no mês, o valor que recebe por hora e calcular o salário desse
         * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
         * casas decimais.
         */

        int numeroDoFuncionario = 0;
        int qtdDeHorasTrabalhadas = 0;
        double valorHoraDeTrabalho = 0.0;

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.println("Funcionario, Informe o seu numero, por gentileza: ");
        numeroDoFuncionario = leitor.nextInt();

        System.out.println("Funcionario, Informe a quantidade de horas trabalhadas, por gentileza: ");
        qtdDeHorasTrabalhadas = leitor.nextInt();

        System.out.println("Funcionario, informe o valor da sua hora de trabalho , por gentileza: ");
        valorHoraDeTrabalho = leitor.nextDouble();

        System.out.println("\nO numero informado foi: " + numeroDoFuncionario);

        double salarioTotalFuncionario = qtdDeHorasTrabalhadas * valorHoraDeTrabalho;
        System.out.printf("O salario total é R$ %.2f \n", salarioTotalFuncionario);

        leitor.close();
    }

}
