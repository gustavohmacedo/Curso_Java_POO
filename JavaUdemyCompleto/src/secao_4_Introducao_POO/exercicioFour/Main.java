package secao_4_Introducao_POO.exercicioFour;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Aluno, informe o seu nome: ");
        aluno.nomeDoAluno = scan.nextLine();

        System.out.println("Informe a Nota do 1º trimestre: ");
        aluno.notaPrimeiroTrimestre = scan.nextDouble();

        System.out.println("Informe a Nota do 2º trimestre: ");
        aluno.notaSegundoTrimestre = scan.nextDouble();

        System.out.println("Informe a Nota do 3º trimestre: ");
        aluno.notaTerceiroTrimestre = scan.nextDouble();

        System.out.println(aluno.toString());

        System.out.printf("Notal final: %.2f \n", aluno.calcularNotaFinal());
        aluno.calcularAprovacao();

        scan.close();
    }
}
