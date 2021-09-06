package secao_6_memoria_arrays_e_listas.vetores.exercicioDeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        final int TOTAL_QUARTOS = 10;
        Estudantes[] quartos = new Estudantes[TOTAL_QUARTOS];

        System.out.println("\n\nInforme a quantidade de quartos que serão alugados [1 a 10]: ");
        int quantidadeQuartosAlugados = scan.nextInt();


        for (int i = 0; i < quantidadeQuartosAlugados; i++) {
            System.out.println("\nEntre com o Nome e E-mail do estudante " + (i + 1) + " e Número do quarto escolhido [0 a 9]");
            System.out.print("Nome: ");
            scan.nextLine();
            String nome = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.nextLine();
            System.out.print("Quarto: ");
            int numeroDoQuarto = scan.nextInt();

            quartos[numeroDoQuarto] = new Estudantes(nome, email);

        }
        System.out.println("\n---\tQuartos Ocupados\t---");
        for (int i = 0; i < quartos.length; i++) {

            if (quartos[i] != null) {
                System.out.println(i + ":" + quartos[i]);

            }
        }

        scan.close();
    }
}
