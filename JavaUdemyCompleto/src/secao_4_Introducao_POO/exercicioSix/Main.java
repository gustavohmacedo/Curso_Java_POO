package secao_4_Introducao_POO.exercicioSix;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Empregado empregado = new Empregado("Gustavo", 600.00, 100.00);
        System.out.println(empregado.toString());
        System.out.println("Informe a porcentagem sobre o salário: ");
        double porcentagem = scan.nextDouble();
        empregado.aumentarSalario(porcentagem);

        scan.close();
    }
}
