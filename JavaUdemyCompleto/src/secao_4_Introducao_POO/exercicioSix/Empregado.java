package secao_4_Introducao_POO.exercicioSix;

public class Empregado {
    private String nome;
    private double salarioBruto;
    private double impostoSobreSalario;

    public Empregado(String nome, double salarioBruto, double impostoSobreSalario) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.impostoSobreSalario = impostoSobreSalario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImpostoSobreSalario() {
        return impostoSobreSalario;
    }

    public void setImpostoSobreSalario(double impostoSobreSalario) {
        this.impostoSobreSalario = impostoSobreSalario;
    }

    public double salarioLiquido() {

        return getSalarioBruto() - getImpostoSobreSalario();
    }

    public void aumentarSalario(double porcentagem) {

        double salarioComAumento = salarioLiquido() + ((getSalarioBruto() * porcentagem) / 100);
        System.out.printf("Dados atualizados: %s ,R$ %.2f\n", getNome(), salarioComAumento);

    }

    @Override
    public String toString() {
        return "Empregado: " + getNome() + ", " +
                "Salário líquido:" + String.format("%.2f", salarioLiquido())+ "\n";
    }
}
