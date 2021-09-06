package secao_4_Introducao_POO.exercicioTwo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("\n--\tInforme os dados do Produto\t--");
        System.out.println("Entre com o produto: ");
        produto.nomeProduto = scanner.nextLine();

        System.out.println("Entre com o preço: ");
        produto.precoProduto = scanner.nextDouble();

        System.out.println("Informe a quantidade no estoque: ");
        produto.quantidadeProduto = scanner.nextInt();

        System.out.println("\n--\tProdutos no estoque\t-- ");
        System.out.println(produto.detalhesDoProduto());

        System.out.println("\nEntre com a quantidade de produtos que vão ser INSERIDOS no estoque: ");
        int quantidadeAdicionaProduto = scanner.nextInt();
        produto.adicionaProdutosNoEstoque(quantidadeAdicionaProduto);

        System.out.println("--\tEstoque atualizado\t--");
        System.out.println(produto.detalhesDoProduto());

        System.out.println("\nEntre com a quantidade de produtos que vão ser REMOVIDOS do estoque: ");
        int quantidadeRemoveProduto = scanner.nextInt();
        produto.removeProdutosDoEstoque(quantidadeRemoveProduto);
        System.out.println("--\tEstoque atualizado\t--");
        System.out.println(produto.detalhesDoProduto() + "\n\n");

        scanner.close();

    }

}
