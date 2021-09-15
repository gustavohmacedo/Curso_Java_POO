package secao_6_memoria_arrays_e_listas.listas.exercicio_de_fixacao.entities;

public class Employee {
    private Integer id;
    private String nome;
    private Double salario;

    public Employee() {
    }

    public Employee(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void aumentarSalario(Double porcentagem) {

        salario += ((salario * porcentagem) / 100.0);
    }

    @Override
    public String toString() {
        return "Id: " + getId() + ", " +
                "Nome: " + getNome() + ", " +
                "Salario: " + String.format("%.2f", getSalario()) + "\n";
    }
}
