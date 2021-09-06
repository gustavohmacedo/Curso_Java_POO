package secao_4_Introducao_POO.exercicioTwo;

public class Produto {
    public String nomeProduto;
    public double precoProduto;
    public int quantidadeProduto;

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return this.precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQuantidadeProduto() {
        return this.quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public double totalValorNoEstoque() {

        return getPrecoProduto() * getQuantidadeProduto();
    }

    public void adicionaProdutosNoEstoque(int quantidade) {

        setQuantidadeProduto(getQuantidadeProduto() + quantidade);

    }

    public void removeProdutosDoEstoque(int quantidade) {

        setQuantidadeProduto(getQuantidadeProduto() - quantidade);

    }

    public String detalhesDoProduto() {
        return "Dados do Produto: " + getNomeProduto() + ", " + String.format("R$ %.2f", getPrecoProduto()) + ", "
                + getQuantidadeProduto() + " unidades, " + String.format("Total: R$ %.2f ", totalValorNoEstoque());
    }

}
