package secao_5_exercicioDeFixacao_POO;

public class ContaBancaria {
    protected static final double TAXA_SAQUE = 5.00;
    private int numeroDaconta;
    private String nomeDoTitular;
    private double saldoDaconta;

    public ContaBancaria(int numeroDaconta, String nomeDoTitular) {
        this.numeroDaconta = numeroDaconta;
        this.nomeDoTitular = nomeDoTitular;
    }

    public ContaBancaria(int numeroDaconta, String nomeDoTitular, double valorDepositoInicial) {
        this.numeroDaconta = numeroDaconta;
        this.nomeDoTitular = nomeDoTitular;
        realizarDesposito(valorDepositoInicial);
    }

    public int getNumeroDaconta() {
        return numeroDaconta;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoUsuario(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }


    public double getSaldoDaconta() {
        return saldoDaconta;
    }


    public void realizarDesposito(double valorDoDeposito) {

        saldoDaconta += valorDoDeposito;

    }

    public void realizarSaque(double valorDoSaque) {
        System.out.println("Atenção! Haverá uma taxa de cobrança de R$ 5,00 por este serviço");

        saldoDaconta -= (valorDoSaque + TAXA_SAQUE);

    }

    @Override
    public String toString() {
        return "\nConta: " + getNumeroDaconta() + ", "
                + "Titular: " + getNomeDoTitular() + ", "
                + "Saldo: " + "R$ " + String.format("%.2f", getSaldoDaconta()) + "\n";
    }
}
