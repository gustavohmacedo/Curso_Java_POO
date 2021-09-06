package secao_5_exercicioDeFixacao_POO;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        ContaBancaria conta; //instanciando aqui para utilizar o objeto 'conta' fora do escopo do (if else);

        System.out.println("\n\nEntre com o número da conta: ");
        int numeroConta = scan.nextInt();

        System.out.println("\nEntre com o nome do Titular: ");
        scan.nextLine(); //para consumir a quebra de linha pedente do nextInt() anterior;
        String nomeTitular = scan.nextLine();


        System.out.println("\nHaverá depósito inicial? [sim ou não] ");
        String resposta = scan.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("\nEntre com o valor do Depósito Inicial: ");
            double depositoInicial = scan.nextDouble();

            conta = new ContaBancaria(numeroConta, nomeTitular, depositoInicial);

        } else {

            conta = new ContaBancaria(numeroConta, nomeTitular);

        }

        System.out.println("\n----\tDados da conta atualizados\t----");
        System.out.println(conta.toString());

        System.out.println("\nEntre com o valor do Depósito: ");
        double deposito = scan.nextDouble();
        conta.realizarDesposito(deposito);

        System.out.println("\n----\tDados da conta atualizados\t----");
        System.out.println(conta.toString());

        System.out.println("\nEntre com o valor do Saque: ");
        double saque = scan.nextDouble();
        conta.realizarSaque(saque);

        System.out.println("\n----\tDados da conta atualizados\t----");
        System.out.println(conta.toString());

        System.out.println();


    }
}
