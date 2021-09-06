package secao_4_Introducao_POO.exercicioFive;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        ConversorDeMoeda cambio = new ConversorDeMoeda();

        System.out.println("Qual o preço do Dollar? ");
        double cotacaoDoDollar = scan.nextDouble();

        System.out.println("Quantos dólares serão comprados?");
        double valorAComprar = scan.nextDouble();

        System.out.println("Valor a ser pago em reais R$ " + cambio.calcularCambio(cotacaoDoDollar, valorAComprar));


    }
}
