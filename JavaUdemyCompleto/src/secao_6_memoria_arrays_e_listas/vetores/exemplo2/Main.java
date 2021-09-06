package secao_6_memoria_arrays_e_listas.vetores.exemplo2;

import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N Produtos.
 Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.*/
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEntre com a quantidade de produtos que serão cadastrados: ");
        int quantidadeProdutos = scanner.nextInt();

        Produto[] produtos = new Produto[quantidadeProdutos];

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Entre com o Nome e o Preço do produto " + (i + 1) + ": ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            double preco = scanner.nextDouble();

            produtos[i] = new Produto(nome, preco);
        }

        System.out.println("----\tLista de Produtos\t----");
        double somaPreco = 0d;
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - " + String.format("R$ %.2f ", produto.getPreco()));

            somaPreco += produto.getPreco();
        }
        System.out.println("----------------------------");

        System.out.printf("A média dos preços é: R$ %.2f\n\n", (somaPreco / produtos.length));
        scanner.close();
    }
}
